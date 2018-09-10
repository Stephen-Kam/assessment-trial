package uk.co.testcraft.stepDefs;

import cucumber.api.java8.En;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import uk.co.testcraft.pages.PhpLoginPage;
import uk.co.testcraft.pages.PhpRegisterPage;
import uk.co.testcraft.pages.PhpTravelsHomePage;

public class PhpTravelStepDefs implements En {

    private WebDriver driver = new ChromeDriver();

    private PhpTravelsHomePage phpTravelsHomePage = new PhpTravelsHomePage(driver);
    private PhpRegisterPage phpRegisterPage = new PhpRegisterPage(driver);
    private PhpLoginPage phpLoginPage = new PhpLoginPage(driver);


    public PhpTravelStepDefs() {

        Given("^A user is on the php travels page$", () -> {
            phpTravelsHomePage.goTo();
        });

        When("^They click on the sign up link$", () -> {
            phpTravelsHomePage.clickSignUp();
        });

        When("^They fill in valid registration details$", () -> {
            phpRegisterPage.fillInValidDetails("Bob", "Dole", "07777777777", "test@test.com", "p2ssword");
        });

        When("^click Sign Up$", () -> {
            // Write code here that turns the phrase above into concrete actions
            phpRegisterPage.clickSignUp();
        });

        When("^They click on the login link$", () -> {
            phpTravelsHomePage.clickLogin();
        });

        When("^They submit valid details$", () -> {
            phpLoginPage.validLogin("test@test.com", "p2ssword");
        });


        Then("^The user will be on the login page$", () -> {
            Assert.assertTrue("Login page is not displayed", driver.findElement(By.cssSelector("div[class='panel-heading']")).isDisplayed());;

        });

        Then("^The user will be on the profile page$", () -> {
            WebElement myDynamicElement = (new WebDriverWait(driver, 5))
                    .until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("h3[class='RTL']")));
            Assert.assertTrue("", driver.findElement(By.cssSelector("h3[class='RTL']")).getText().contentEquals("Hi, Bob Dole"));
        });

    }
}