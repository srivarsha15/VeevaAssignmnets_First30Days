package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Scenario2 {
    public static ChromeDriver driver=Driver.getDriver();
    public void hover(){
        driver.navigate().to("https://www.google.com");
        Actions action=new Actions(driver);
        WebElement mic=driver.findElement(By.cssSelector("svg.goxjub"));
        action.moveToElement(mic).perform();
        WebElement micTT= driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]"));
        String tooltip=micTT.getAttribute("aria-label");
        System.out.println("tooltip: "+tooltip);

        WebElement img=driver.findElement(By.cssSelector("svg.Gdd5U"));
        action.moveToElement(img).perform();
        WebElement imgTT= img.findElement(By.xpath(".."));
        String imgTooltip=imgTT.getAttribute("aria-label");
        System.out.println("Image Tooltip:"+imgTooltip );
        driver.close();
    }
}
