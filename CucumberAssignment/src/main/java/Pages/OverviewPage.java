package Pages;

import Driver.Driver;
import org.openqa.selenium.By;



public class OverviewPage {

    private final By billPaymentLinkElement= By.linkText("Bill Pay");
    public void clickBillPaymentLink(){
        Driver.getDriver().findElement(billPaymentLinkElement).click();
    }
}
