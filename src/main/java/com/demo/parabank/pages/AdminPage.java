package com.demo.parabank.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AdminPage extends CommonHeaderPage {
    private static final String CLEAN_DB = "[value='CLEAN']";

    public SelenideElement cleanDb() {
        return $(CLEAN_DB);
    }
}
