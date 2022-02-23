package org.example;

import org.junit.jupiter.api.Test;



public class SearchTest extends AbstractTest {
    @Test
    void searchIn(){

        new MainPage(getWebDriver()).goToSearchPage();
        new SearchPage(getWebDriver()).setSearch2("платья");


    }


}
