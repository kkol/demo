package com.demo.parabank.steps.hooks;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void before(Scenario scenario){
        System.out.println("BEFORE!");
    }
}
