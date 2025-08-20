package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) {
        ChromeDriver driver=new ChromeDriver();
        driver.navigate().to("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.34.0");
    }
}
