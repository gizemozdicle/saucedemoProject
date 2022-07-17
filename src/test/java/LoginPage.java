import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

    WebDriver driver;

    By userName = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.id("login-button");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        
    }

    public void typeUserName(String uID) {
        driver.findElement(userName).sendKeys(uID);
    }

    public void typePassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }


}