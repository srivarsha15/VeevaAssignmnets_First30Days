package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Scenario1 {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver=Driver.getDriver();
        driver.navigate().to("https://www.nba.com/warriors");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Wait for full page load
        wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
        driver.findElement(By.cssSelector("div.p-2.absolute.right-3.hover\\:cursor-pointer")).click();
        WebElement shop = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Shop']")));
        shop.click();

        String originalWindow = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(originalWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }


        Thread.sleep(16000);
//
//// Retry clicking the "Men" tab
        boolean clicked = false;
        int retries = 0;
        while (!clicked && retries < 5) {
            try {
                WebElement women = wait.until(ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[@data-trk-id='topnav-group-ga-2_women']")));
                women.click();
                clicked = true;
            } catch (Exception e) {
                System.out.println("Popup may still be blocking. Retrying... (" + (retries + 1) + ")");
                Thread.sleep(4000);
                retries++;
            }
        }

        if (!clicked) {
            throw new RuntimeException("Failed to click 'woen' after multiple retries due to popup.");
        }



        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Hats']"))).click();
        driver.findElement(By.cssSelector("a[data-trk-id='side-nav-one-size-sizes-155']")).click();
        driver.findElement(By.cssSelector("a[data-trk-id='side-nav-47-brands-479']")).click();

        List<WebElement> items = driver.findElements(By.cssSelector("div.product-card"));
        for(WebElement item:items){
            WebElement titleElement = item.findElement(By.cssSelector("div.product-card-title a"));
            String title = titleElement.getAttribute("title");
            System.out.println("Title:"+title);
            WebElement priceElement = item.findElement(By.cssSelector("span.money-value"));
            String price = priceElement.getText();
            System.out.println("Price: "+price);
        }
        driver.close();


    }
}
