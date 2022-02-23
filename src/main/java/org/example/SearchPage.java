package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"headerWrapper\"]/div/div[3]/div[1]/div/div/input")
    private WebElement search;
    private WebElement click;

    @FindBy(xpath = "//*[@id=\"algoliaContainer\"]/div/div[1]/div[2]/div/div[2]/input")
    private WebElement search2;
    @FindBy(xpath = "//*[@id=\"algoliaContainer\"]/div/div/div[3]/div[1]/div/span")
    private WebElement enter;


    public SearchPage(WebDriver driver) {

        super(driver);
    }
    public SearchPage setSearch(String search){
        this.search.click ();
        return this;
    }

    public SearchPage setSearch2(String search2){
        this.search2.click();
        return this;
    }

    public void searchIn(String search2){

        Actions searchIn = new Actions(getDriver());
        searchIn
                .click(this.search)
                .click(this.search2)
                .sendKeys(search2)
                .click(this.enter)
                .build()
                .perform();
    }
}
