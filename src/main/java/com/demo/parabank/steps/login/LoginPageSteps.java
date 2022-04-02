package com.demo.parabank.steps.login;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.demo.parabank.pages.CommonHeaderPage;
import com.demo.parabank.pages.LoginPage;
import io.cucumber.java.en.Given;

import com.demo.parabank.steps.CucumberSpringConfiguration;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import static com.codeborne.selenide.Selenide.open;

public class LoginPageSteps extends CucumberSpringConfiguration {

    @Autowired
    private LoginPage loginPage;

    @Given("^user opens Parabank page$")
    public void openBrowser() {
        open("/");
        loginPage.topPanelLogo().shouldBe(Condition.visible);
        loginPage.topPanelCredo().shouldBe(Condition.visible);
    }

    @When("^user clicks register account button$")
    public void clickRegisterButton(){
        loginPage.register().click();
    }


}
