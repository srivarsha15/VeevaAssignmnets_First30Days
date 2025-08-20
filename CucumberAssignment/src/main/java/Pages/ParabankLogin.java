package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Driver.Driver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParabankLogin {
    By register_link=By.linkText("Register");
    By forgotIfo_link=By.linkText("Forgot login info?");
    ChromeDriver driver=Driver.getDriver();
    private final By usernameElement=By.cssSelector("input[name='username']");
    private final By passwordElement=By.cssSelector("input[name='password']");
    private final By loginButtonElement=By.cssSelector("input[value='Log In']");
    public void enterUsername(String username){
        driver.findElement(usernameElement).sendKeys(username);
    }
    public void enterPassword(String password){
        driver.findElement(passwordElement).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(loginButtonElement).click();
//        System.out.println("user clicked");
    }
    public void clickRegisterLink(){
        Driver.getDriver().findElement(register_link).click();
    }
    public void clickForgotInfoLink(){
        Driver.getDriver().findElement(forgotIfo_link).click();
    }
}
