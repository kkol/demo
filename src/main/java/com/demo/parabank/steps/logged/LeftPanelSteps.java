package com.demo.parabank.steps.logged;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.demo.parabank.pages.LeftPanelPage;
import io.cucumber.java.en.Then;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;

public class LeftPanelSteps {

    @Autowired
    LeftPanelPage leftPanelPage;

    @Then("^greetings '(.*)' are displayed in left panel$")
    public void greetingsAreDisplayed(@NonNull final String message) {
        leftPanelPage.greetings().shouldHave(Condition.text(message));
    }
}
