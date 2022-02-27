package org.example;

import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class AddToCartTest extends AbstractTest {

    @Test
    @Description(value = "Проверка добавления товара в корзину")
    void AddToCart() {
        new AddToCart(getWebDriver()).clickToHome();
        WebElement webElement = webDriver.findElement(By.xpath(".//div[@class='close']"));
        webElement.click();
        new AddToCart(getWebDriver()).clickToPrzescieradloSi();

    }
}

