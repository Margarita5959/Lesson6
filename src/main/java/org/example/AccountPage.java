package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends AbstractPage {

    @FindBy (xpath = "//*[@id=\"headerWrapper\"]/div/div[3]/button[1]")
    private WebElement exit;

    public AccountPage(WebDriver driver){
        super(driver);

    }


    public void logOut(){
        this.exit.click();

    }

}
