package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class AddToCart extends AbstractPage {

    @FindBy(css = "#navigation-wrapper > div > ul > li:nth-child(6) > a")
    private WebElement home;
    @FindBy(xpath = "//*[@id=\"categoryProducts\"]/article[2]/figure/a/img")
    private WebElement przescieradloSi;
    @FindBy(xpath = "//*[@id=\"quantity-section\"]/button/span/span[1]")
    private WebElement addToCart;

    public AddToCart(WebDriver driver) {
        super(driver);
    }

    public void clickToHome() {
        this.home.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("home"));
    }
    public void clickToPrzescieradloSi() {
    this.przescieradloSi.click();
    new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("przescieradlo-si"));
    }
    public void clickToAddToCart (){
        this.addToCart.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("addToCart"));
    }
}

