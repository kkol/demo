package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import static com.codeborne.selenide.Selenide.$;

@Component
public class MainPage {

    private static final String INPUT = "q";

    public SelenideElement input(){
        return $(By.name(INPUT));
    }
}
