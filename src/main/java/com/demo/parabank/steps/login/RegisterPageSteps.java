package com.demo.parabank.steps.login;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.demo.parabank.framework.FrameworkConfig;
import com.demo.parabank.pages.RegisterPage;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

import static com.demo.parabank.helpers.CommonMethods.clearAndSetValue;

public class RegisterPageSteps {

    @Autowired
    RegisterPage registerPage;

    @When("^user provide following data$")
    public void provideRegistryData(Map<String, String> datatable) {
        clearAndSetValue(registerPage.firstName(), datatable.get("First Name"));
        clearAndSetValue(registerPage.lastName(), datatable.get("Last Name"));
        clearAndSetValue(registerPage.address(), datatable.get("Address"));
        clearAndSetValue(registerPage.city(), datatable.get("City"));
        clearAndSetValue(registerPage.state(), datatable.get("State"));
        clearAndSetValue(registerPage.zipCode(), datatable.get("Zip Code"));
        clearAndSetValue(registerPage.phone(), datatable.get("Phone"));
        clearAndSetValue(registerPage.ssn(), datatable.get("SSN"));


        clearAndSetValue(registerPage.username(), datatable.get("Username"));
        clearAndSetValue(registerPage.password(), FrameworkConfig.tempPassword);
        clearAndSetValue(registerPage.confirmPassword(), FrameworkConfig.tempPassword);

    }

    @When("^user click register button$")
    public void clickRegisterButton() {
        registerPage.registerButton().click();
        Selenide.sleep(5000);
    }
}
