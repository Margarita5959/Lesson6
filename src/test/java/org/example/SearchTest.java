package org.example;

import io.qameta.allure.Description;
import org.junit.jupiter.api.Test;



public class SearchTest extends AbstractTest {
    @Test
    @Description(value = "Проверка поля поиска")
    void searchIn(){

        new MainPage(getWebDriver()).goToSearchPage();
        new SearchPage(getWebDriver()).setSearch2("платья");


    }


}
