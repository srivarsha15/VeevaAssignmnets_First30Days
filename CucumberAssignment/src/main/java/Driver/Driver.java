package Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.util.HashMap;

public class Driver {
    private static ChromeDriver driver=null;
    private Driver(){}
     public static ChromeDriver getDriver(){
        if(driver==null){
            ChromeOptions options = new ChromeOptions();
            HashMap<String,Object> pref= new HashMap<>();
            pref.put("profile.password_manager_leak_detection",false);
            pref.put("profile.credentials_enable_service",false);
            options.setExperimentalOption("prefs",pref);
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
        }
        return driver;
    }
}
