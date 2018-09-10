package uk.co.testcraft.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhpRegisterPage extends AbstractPage {

    private static final String URL = "https://www.phptravels.net/";

    @FindBy(css = "div[class='panel-heading']")
    private WebElement signUpPanel;

    @FindBy(name = "firstname")
    private WebElement firstName;

    @FindBy(name = "lastname")
    private WebElement lastName;

    @FindBy(name = "phone")
    private WebElement phoneNumber;

    @FindBy(name = "email")
    private WebElement email;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(name = "confirmpassword")
    private WebElement confirmPassword;

    @FindBy(css = "button[class='signupbtn btn_full btn btn-action btn-block btn-lg']")
    private WebElement signUpButton;

    public PhpRegisterPage(final WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        this.driver.get(URL);
    }

    public void checkUrl() {
        Assert.assertTrue("Sign up box was not displayed", signUpPanel.isDisplayed());
    }

    public void fillFirstName(String name){ firstName.sendKeys(name);}
    public void fillLastName(String name){ lastName.sendKeys(name);}
    public void fillPhoneNumber(String number){ phoneNumber.sendKeys(number);}
    public void fillEmailAddress(String emailAddress){ email.sendKeys(emailAddress);}
    public void fillPassword(String aPassword){ password.sendKeys(aPassword);}
    public void fillPasswordConfirm(String aPassword){ confirmPassword.sendKeys(aPassword);}

    public void fillInValidDetails(String firstName, String lastName, String phoneNumber, String emailAddress, String aPassword) {
        fillFirstName(firstName);
        fillLastName(lastName);
        fillPhoneNumber(phoneNumber);
        fillEmailAddress(emailAddress);
        fillPassword(aPassword);
        fillPasswordConfirm(aPassword);
    }

    public void clickSignUp(){signUpButton.click();}

}
