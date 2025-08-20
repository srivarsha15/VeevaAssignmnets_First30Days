package Hooks;

import Driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Log;

public class Hooks {
    @Before
    public void driverSetUp(){
        Log.info("Setting the Browser");
        Log.info("Navigating to page");
        Driver.getDriver().navigate().to("https://parabank.parasoft.com/parabank/index.htm");
    }
    @After
    public void driverCleanUp(){
        Log.info("Closing the driver");
        Driver.getDriver().close();
        Driver.getDriver().quit();
    }
}
