package com.demo.parabank.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public abstract class CommonHeaderPage {
    private static final String TOP_PANEL_LOGO = "#topPanel .logo";
    private static final String TOP_PANEL_CREDO = "#topPanel p";
    private static final String ADMIN_PAGE = "Admin Page";

    public SelenideElement topPanelLogo() {
        return $(TOP_PANEL_LOGO);
    }

    public SelenideElement topPanelCredo() {
        return $(TOP_PANEL_CREDO);
    }

    public SelenideElement adminPage(){
        return $(By.linkText(ADMIN_PAGE));
    }
}