package com.demo.parabank.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import lombok.NonNull;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$;

@Component
public class RegisterPage extends CommonHeaderPage {


    private static final String FIRST_NAME = "customer.firstName";
    private static final String LAST_NAME = "customer.lastName";
    private static final String ADDRESS = "customer.address.street";
    private static final String CITY = "customer.address.city";
    private static final String STATE = "customer.address.state";
    private static final String ZIP_CODE = "customer.address.zipCode";
    private static final String PHONE = "customer.phoneNumber";
    private static final String SSN = "customer.ssn";
    private static final String USERNAME = "customer.username";
    private static final String PASSWORD = "customer.password";
    private static final String CONFIRM = "repeatedPassword";
    private static final String REGISTER_BUTTON = "[value='Register']";

    public SelenideElement firstName() {
        return $(By.id(FIRST_NAME));
    }

    public SelenideElement lastName() {
        return $(By.id(LAST_NAME));
    }

    public SelenideElement address() {
        return $(By.id(ADDRESS));
    }

    public SelenideElement city() {
        return $(By.id(CITY));
    }

    public SelenideElement state() {
        return $(By.id(STATE));
    }

    public SelenideElement zipCode() {
        return $(By.id(ZIP_CODE));
    }

    public SelenideElement phone() {
        return $(By.id(PHONE));
    }

    public SelenideElement ssn() {
        return $(By.id(SSN));
    }

    public SelenideElement username() {
        return $(By.id(USERNAME));
    }

    public SelenideElement password() {
        return $(By.id(PASSWORD));
    }

    public SelenideElement confirmPassword() {
        return $(By.id(CONFIRM));
    }

    static Map<String, String> errorsMapping = new HashMap<String, String>() {{
        put("First Name", "customer.firstName.errors");
        put("Last Name", "customer.lastName.errors");
        put("Address", "customer.address.street.errors");
        put("City", "customer.address.city.errors");
        put("State", "customer.address.state.errors");
        put("Zip Code", "customer.address.zipCode.errors");
        put("SSN", "customer.ssn.errors");
        put("Username", "customer.username.errors");
        put("Password", "customer.password.errors");
        put("Confirm", "repeatedPassword.errors");
    }};

    public SelenideElement validationErrorByLabel(@NonNull final String label) {
        return $(By.id(errorsMapping.get(label))).shouldBe(Condition.visible, Duration.ofSeconds(3));
    }

    public SelenideElement confirmPasswordError() {
        return $(By.id(CONFIRM));
    }

    public SelenideElement registerButton() {
        return $(REGISTER_BUTTON);
    }

}
