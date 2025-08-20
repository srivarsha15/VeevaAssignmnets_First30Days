package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class Elements {
    public static ChromeDriver driver=Driver.getDriver();
    public static Locators locate=new Locators();
    public void textbox(){
        driver.navigate().to("https://demoqa.com/text-box");
        driver.findElement(By.cssSelector(locate.FullNameSelector)).sendKeys("Varsha");
        driver.findElement(By.cssSelector(locate.EmailSelector)).sendKeys("Varsha@gamil.com");
        driver.findElement(By.cssSelector(locate.PermanentAddressSelector)).sendKeys("Hyderabad");
        driver.findElement(By.cssSelector(locate.CurrentAddressSelector)).sendKeys("Siddipet");
        driver.findElement(By.id("submit")).click();
        driver.close();
    }
    public void checkbox(){
        driver.navigate().to("https://demoqa.com/checkbox");
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/button[1]/*[name()='svg'][1]")).click();
        driver.findElement(By.cssSelector("label[for='tree-node-desktop'] span[class='rct-checkbox'] svg")).click();
        driver.close();
    }
    public void radiobox(){
        driver.navigate().to("https://demoqa.com/radio-button");
        driver.findElement(By.cssSelector("label[for='yesRadio']")).click();
        driver.close();
    }
    public void webtable(){
        driver.navigate().to("https://demoqa.com/webtables");
        driver.findElement(By.id("addNewRecordButton")).click();
        driver.findElement(By.cssSelector("#firstName")).sendKeys("Varsha");
        driver.findElement(By.cssSelector("#lastName")).sendKeys("Thatikonda");
        driver.findElement(By.cssSelector("input[placeholder='name@example.com']")).sendKeys("v@mail.com");
        driver.findElement(By.cssSelector("input[id='age']")).sendKeys(String.valueOf(23));
        driver.findElement(By.cssSelector("input[placeholder='Salary']")).sendKeys(String.valueOf(10000));
        driver.findElement(By.cssSelector("input[id='department']")).sendKeys("Auth");
        driver.findElement(By.id("submit")).click();
        driver.close();
    }
    public void button(){
        driver.navigate().to("https://demoqa.com/buttons");
        Actions action=new Actions(driver);
        action.doubleClick(driver.findElement(By.id("doubleClickBtn"))).perform();
        action.contextClick(driver.findElement(By.xpath("//button[text()='Right Click Me']"))).perform();
        driver.findElement(By.xpath("//button[text()='Click Me']")).click();
        driver.close();
    }
    public void link(){
        driver.navigate().to("https://demoqa.com/links");
        driver.findElement(By.linkText("Home")).click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        WebElement ele = driver.findElement(By.cssSelector("a#dynamicLink"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true); arguments[0].click();",ele);
        driver.switchTo().window(tabs.get(0));


//        driver.navigate().back();
//        driver.findElement(By.cssSelector("a#dynamicLink")).click();
//        .findElement(By.cssSelector("a[href='https://demoqa.com']")).click();

        //Api calls
        driver.findElement(By.id("created")).click();
        driver.findElement(By.cssSelector("#no-content")).click();
        driver.findElement(By.cssSelector("#moved")).click();
        driver.findElement(By.cssSelector("#bad-request")).click();
        driver.close();

    }
    public void uploadDownload(){
        driver.navigate().to("https://demoqa.com/upload-download");
        driver.findElement(By.cssSelector("#downloadButton")).click();
        driver.findElement(By.cssSelector("#uploadFile")).sendKeys("/Users/srivarsha.thatikonda/Downloads/sampleFile.jpeg");
        driver.close();
    }

    public void practiceForm(){
        driver.navigate().to("https://demoqa.com/automation-practice-form");
        driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Thatikonda");
        driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Srivarsha");
        driver.findElement(By.id("userEmail")).sendKeys("V@gmail.com");
        driver.findElement(By.cssSelector("label[for='gender-radio-2']")).click();
        driver.findElement(By.cssSelector("#userNumber")).sendKeys("8888888888");
        driver.findElement(By.cssSelector("#subjectsContainer")).click();
        WebElement auto= driver.findElement(By.cssSelector("#subjectsInput"));
        auto.sendKeys("h");
        auto.sendKeys(Keys.ARROW_DOWN);
        auto.sendKeys(Keys.ENTER);

        driver.findElement(By.cssSelector("label=[for'hobbies-checkbox-3']")).click();
        driver.findElement(By.cssSelector("label=[for'hobbies-checkbox-2']")).click();
        driver.findElement(By.cssSelector("input[class='form-control-file']")).sendKeys("/Users/srivarsha.thatikonda/Downloads/sampleFile.jpeg");
        driver.findElement(By.id("currentAddress")).sendKeys("Hyderabad");
//        WebElement drop1=driver.findElements(By.cssSelector("svg[class='css-19bqh2r']")).get(0);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].value='NCR'", drop1);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        driver.close();
    }
    public void windows(){
        driver.navigate().to("https://demoqa.com/browser-windows");
        driver.findElement(By.id("tabButton")).click();
        ArrayList<String> tabs=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        driver.findElement(By.cssSelector("button[type='button']")).click();
        driver.findElement(By.cssSelector("button#messageWindowButton")).click();
        driver.close();


    }
    public void alerts() throws InterruptedException {
        driver.navigate().to("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        driver.switchTo().alert().accept();

        driver.findElement(By.cssSelector("#timerAlertButton")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(7));
        wait.until(ExpectedConditions.alertIsPresent()).accept();
        driver.findElement(By.id("confirmButton")).click();
        Alert message=driver.switchTo().alert();
        String s=message.getText();
//       assertEquals("What is your name?", alert.getText());
        if(s.contains("Do you confirm action?")){
            message.accept();
        }
        else{
            message.dismiss();
        }
        driver.findElement(By.cssSelector("#promtButton")).click();
        driver.switchTo().alert().sendKeys("Varsha");
        driver.switchTo().alert().accept();


    }
    public  void frames(){
        driver.navigate().to("https://demoqa.com/frames");
        WebElement iframe=driver.findElement(By.id("frame2"));
        driver.switchTo().frame(iframe);
        System.out.println(driver.getPageSource().contains("We Leave From Here"));
        driver.switchTo().parentFrame();
        WebElement iframe2=driver.findElement(By.id("frame1"));
        System.out.println(driver.getPageSource());
        driver.close();
    }
    public void nestedFrames(){
        driver.navigate().to("https://demoqa.com/frames");
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe#frame1")));
        System.out.println(driver.getPageSource().contains("Parent Iframe"));
        WebElement f2=driver.findElement(By.cssSelector("iframe[srcdoc='<p>Child Iframe</p>']"));
        driver.switchTo().frame(f2);
        System.out.println(driver.getPageSource());
    }
    public void modalDialog(){
        driver.navigate().to("https://demoqa.com/modal-dialogs");
        driver.findElement(By.cssSelector("button#showSmallModal")).click();
        System.out.println(driver.findElement(By.id("example-modal-sizes-title-sm")).getText());
        driver.findElement(By.id("closeSmallModal")).click();
        driver.findElement(By.cssSelector("button#showLargeModal")).click();
        System.out.println(driver.findElement(By.className("modal-body")).getText());
        driver.findElement(By.id("closeLargeModal")).click();
        driver.close();

    }
    public void accordian(){
        driver.navigate().to("https://demoqa.com/accordian");
        driver.findElement(By.cssSelector("#section1Heading")).click();
        System.out.println(driver.findElement(By.id("section1Content")).getText());
        driver.findElement(By.cssSelector("div[id='section2Heading']")).click();
        driver.close();
    }
    public void auto(){
        driver.navigate().to("https://demoqa.com/auto-complete");
        driver.findElement(By.cssSelector("#autoCompleteMultipleContainer")).click();
        WebElement colors= driver.findElement(By.cssSelector("input[id='autoCompleteMultipleInput']"));

        colors.sendKeys("blue");
        colors.sendKeys(Keys.ARROW_DOWN);
        colors.sendKeys(Keys.ENTER);

        colors.sendKeys("pink");
        colors.sendKeys(Keys.ARROW_DOWN);
        colors.sendKeys(Keys.ENTER);

        driver.findElement(By.cssSelector("#autoCompleteSingleContainer")).click();
        WebElement color= driver.findElement(By.cssSelector("input[id='autoCompleteSingleInput']"));

        color.sendKeys("blue");
        color.sendKeys(Keys.ARROW_DOWN);
        color.sendKeys(Keys.ENTER);

    }
    public void slider(){
        driver.navigate().to("https://demoqa.com/slider");
        WebElement slide= driver.findElement(By.cssSelector("input[type='range']"));
        Actions action = new Actions(driver);

        action.dragAndDropBy(slide, 0, 100).perform();
        driver.close();
    }
    public void progressBar(){
        driver.navigate().to("https://demoqa.com/progress-bar");

        driver.findElement(By.cssSelector("#startStopButton")).click();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        WebElement bar= driver.findElement(By.id("progressBar"));
        wait.until(ExpectedConditions.attributeToBe(bar, "aria-valuenow", "50"));
        driver.findElement(By.cssSelector("#startStopButton")).click();
        driver.close();

    }
    public void menu(){
        driver.navigate().to("https://demoqa.com/menu#");
        Actions action=new Actions(driver);

        WebElement main2 = driver.findElement(By.cssSelector("#nav > li:nth-child(2)"));
        action.moveToElement(main2).perform();

        WebElement sub = driver.findElement(By.cssSelector("#nav > li:nth-child(2) > ul > li:nth-child(3)"));
        action.moveToElement(sub).perform();

        WebElement item = driver.findElement(By.cssSelector("#nav > li:nth-child(2) > ul > li:nth-child(3) > ul > li:nth-child(1)"));
        action.moveToElement(item).click().perform();

        System.out.println(item.getText());
        driver.close();

    }
    public void selectMenu(){
        driver.navigate().to("https://demoqa.com/select-menu");
        driver.findElement(By.cssSelector("div#withOptGroup")).click();
        driver.findElement(By.cssSelector("input[id='react-select-2-input']")).sendKeys("group 1, option 2");
        driver.findElement(By.cssSelector("input#react-select-2-input")).sendKeys(Keys.ENTER);
        driver.close();
    }
    public void sortable(){
        driver.navigate().to("https://demoqa.com/sortable");
        Actions action=new Actions(driver);
        WebElement ele= driver.findElement(By.cssSelector("div.vertical-list-container div:nth-child(1)"));
        WebElement ele2=driver.findElement(By.cssSelector("div.vertical-list-container div:nth-child(3)"));
        action.dragAndDrop(ele,ele2).perform();
        driver.close();
    }
    public void resizeable(){
        driver.navigate().to("https://demoqa.com/resizable");
        WebElement ele= driver.findElements(By.cssSelector(".react-resizable-handle react-resizable-handle-se")).get(0);
        Actions action=new Actions(driver);
        action.clickAndHold(ele).moveByOffset(30,10).release();
        action.build().perform();
        driver.close();
    }

//    ----------------------------------------------------------------------
    public void classAtrribute(){
        driver.navigate().to("http://www.uitestingplayground.com/classattr");
        driver.findElement(By.xpath("//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]")).click();
        Alert alert=driver.switchTo().alert();
        alert.accept();
        driver.close();
    }

    public void ajax(){
        driver.navigate().to("http://www.uitestingplayground.com/ajax");
        driver.findElement(By.cssSelector("#ajaxButton")).click();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".bg-success")));
        System.out.println(ele.getText());
        driver.close();
    }
    public void click(){
        driver.navigate().to("http://www.uitestingplayground.com/click");
        WebElement ele=driver.findElement(By.cssSelector("#badButton"));
        String before= ele.getAttribute("class"); //getCSSvalue
        ele.click();
        String after= ele.getAttribute("class");
        if(before.equals(after)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        driver.close();
    }

    public  void scroll(){
        driver.navigate().to("http://www.uitestingplayground.com/scrollbars");

    }



}
