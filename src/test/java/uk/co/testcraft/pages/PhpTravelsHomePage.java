package uk.co.testcraft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PhpTravelsHomePage extends AbstractPage {

    private static final String URL = "https://www.phptravels.net/";

    public PhpTravelsHomePage(final WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        this.driver.get(URL);
    }

    public void clickSignUp() {
        driver.findElements(By.xpath("//*[@id=\"li_myaccount\"]/a")).get(1).click();
        driver.findElements(By.xpath("//*[@id=\"li_myaccount\"]/ul/li[2]/a")).get(1).click();
    }

}
