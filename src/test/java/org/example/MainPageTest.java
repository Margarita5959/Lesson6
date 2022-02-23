package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MainPageTest extends AbstractTest {

    private WebDriver driver;

    @Test
    void clickToBeauty(){
        new MainPage(getWebDriver()).navigateToBeauty();
        Assertions.assertEquals("https://www.sinsay.com/ru/ru/beauty",getWebDriver().getCurrentUrl());
    }

    @Test
    void clickToHome(){
        new MainPage(getWebDriver()).navigateToHome();
    }

    @Test
    void clickToForHim(){
        new MainPage(getWebDriver()).navigateToForHim();

    }
    @Test
    void clickToNEW(){
        new MainPage(getWebDriver()).navigateToNEW();

    }
}

