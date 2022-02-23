package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends AbstractPage {

    @FindBy(css = "#navigation-wrapper > div > ul > li:nth-child(7) > a")
    private WebElement beauty;

    @FindBy(css = "#navigation-wrapper > div > ul > li:nth-child(6) > a")
    private WebElement home;

    @FindBy(xpath = "//*[@id=\"navigation-wrapper\"]/div/ul/li[3]/a")
    private WebElement forhim;

    @FindBy(xpath = "//*[@id=\"navigation-wrapper\"]/div/ul/li[1]/a")
    private WebElement NEW;

    @FindBy(xpath = "//*[@id=\"headerWrapper\"]/div/div[3]/button[1]")
    private WebElement signIn;
    @FindBy (xpath = "//*[@id=\"headerWrapper\"]/div/div[3]/div[1]/div/div/input")
    private WebElement search;


    public MainPage(WebDriver driver) {
        super(driver);

    }
    public void goToSearchPage (){
        search.click ();
    new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("sinsay.com/ru/ru/"));
}
    public void goToAccountPage() {
        signIn.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("sinsay.com/ru/ru/customer/account/login/#login"));

    }

    public void navigateToBeauty() {
        this.beauty.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("beauty"));
    }

    public void navigateToHome() {
        this.home.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("home"));
    }

    public void navigateToForHim() {
        this.forhim.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("for-him"));

    }

    public void navigateToNEW() {
        this.NEW.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("new"));
    }
}