package pages.seid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

    WebDriver driver;
    private WebElement email;
    private WebElement password;
    private WebElement login;

    public Login(WebDriver driver)

    {
        this.driver=driver;
    }

    public void setUsername(String setUsername)
    {
        email=driver.findElement(By.id("login-username"));
        email.sendKeys(setUsername);
    }
    public void setPassword(String setPassword)
    {
        password=driver.findElement(By.id("login-password"));
        password.sendKeys(setPassword);
    }

    public void setLogin()
    {
        login=driver.findElement(By.id("js-login-btn"));
        login.click();
    }






}
