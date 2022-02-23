package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogininTest extends AbstractTest {

    @Test
    void loginIn(){

        new MainPage(getWebDriver()).goToAccountPage();
        new LoginPage(getWebDriver()).setLogin("weffugrecrozo-9512@yopmail.com").setPassword("Лена3333").loginIn();


    }



    @AfterEach
    void logout(){
        new MainPage(getWebDriver()).goToAccountPage();

        new AccountPage(getWebDriver()).logOut();
        new WebDriverWait(getWebDriver(),Duration.ofSeconds(5));

    }






}


