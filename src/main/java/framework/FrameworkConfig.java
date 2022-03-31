package framework;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.selenide.AllureSelenide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan("com")
@PropertySource("classpath:environment/${spring.profiles.active:dev}.properties")
public class FrameworkConfig {

    @Autowired
    public FrameworkConfig(Environment env) {
        com.codeborne.selenide.Configuration.baseUrl = env.getProperty("frontend.url");
        com.codeborne.selenide.Configuration.browser = env.getProperty("browser");
        com.codeborne.selenide.Configuration.timeout = 10;
        com.codeborne.selenide.Configuration.startMaximized = true;
        com.codeborne.selenide.Configuration.savePageSource = false;
        com.codeborne.selenide.Configuration.screenshots = false;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));

        WebDriverManager.chromedriver().setup();

    }
}
