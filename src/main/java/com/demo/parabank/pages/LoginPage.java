package com.demo.parabank.pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;

@Component
public class LoginPage extends CommonHeaderPage {

    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";
    private static final String LOGIN_BUTTON = "[value='Log In']";
    private static final String REGISTER_BUTTON = "Register";

    public SelenideElement username() {
        return $(By.name(USERNAME));
    }

    public SelenideElement password() {
        return $(By.name(PASSWORD));
    }

    public SelenideElement logIn() {
        return $(LOGIN_BUTTON);
    }

    public SelenideElement register() {
        return $(By.linkText(REGISTER_BUTTON));
    }


}
