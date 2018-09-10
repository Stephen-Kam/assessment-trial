package uk.co.testcraft.stepDefs;

import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import uk.co.testcraft.pages.PhpRegisterPage;
import uk.co.testcraft.pages.PhpTravelsHomePage;

public class PhpTravelStepDefs implements En {

    private WebDriver driver = new ChromeDriver();

    private PhpTravelsHomePage phpTravelsHomePage = new PhpTravelsHomePage(driver);
    private PhpRegisterPage phpRegisterPage = new PhpRegisterPage(driver);


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

        Then("^The user will be on the register page$", () -> {
            phpRegisterPage.checkUrl();
        });

    }
}