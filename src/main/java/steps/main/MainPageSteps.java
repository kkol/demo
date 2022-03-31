package steps.main;

import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import pages.MainPage;

import steps.CucumberSpringConfiguration;

import static com.codeborne.selenide.Selenide.open;

public class MainPageSteps extends CucumberSpringConfiguration {

    @Given("^open google page$")
    public void openBrowser() {
        open("/");
    }

}
