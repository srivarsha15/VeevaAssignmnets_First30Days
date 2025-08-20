package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static ChromeDriver driver=null;
    private Driver(){}
    public static ChromeDriver getDriver(){
        if(driver==null){
            driver= new ChromeDriver();
        }
        return driver;
    }

}
