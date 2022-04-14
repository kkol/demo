package com.demo.parabank.pages;

import com.codeborne.selenide.SelenideElement;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;

@Component
public class LeftPanelPage extends CommonHeaderPage {

    private static final String GREETINGS = "#leftPanel p.smallText";

    public SelenideElement greetings() {
        return $(GREETINGS);
    }
}
