package uk.co.testcraft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhpLoginPage extends AbstractPage {

    @FindBy(name = "username")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(css = "button[class='btn btn-action btn-lg btn-block loginbtn']")
    private WebElement loginBtn;

    public PhpLoginPage(final WebDriver driver) {
        super(driver);
    }

    public void fillUsername(String aUsername) {username.sendKeys(aUsername);}
    public void fillPassword(String aPassword) {password.sendKeys(aPassword);}

    public void validLogin(String username, String password) {
        fillUsername(username);
        fillPassword(password);
        loginBtn.click();

    }

}
