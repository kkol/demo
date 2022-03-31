package com.main;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features/Google.feature",
        glue = {"steps"},
        plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"})
public class GoogleTest {
}
