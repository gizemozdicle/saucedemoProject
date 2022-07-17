import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginTest {


    @Test
    public void successLogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        LoginPage login = new LoginPage(driver);

        login.typeUserName("standard_user");
        login.typePassword("secret_sauce");
        login.clickLoginButton();


        driver.close();
    }
}
