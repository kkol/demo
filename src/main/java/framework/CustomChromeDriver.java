package framework;

import com.codeborne.selenide.Browser;
import com.codeborne.selenide.Config;
import com.codeborne.selenide.webdriver.ChromeDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class CustomChromeDriver extends ChromeDriverFactory {
    private static final Map<String, Object> deviceMetrics = new HashMap<String, Object>() {
        {
            put("width", 1920);
            put("height", 1080);
            put("pixelRatio", 1.0);
        }
    };

    private static final Map<String, Object> mobileEmulation = new HashMap<String, Object>() {
        {
            put("deviceMetrics", deviceMetrics);
        }
    };

    private static final Map<String, Object> prefs = new HashMap<String, Object>() {
        {
            put("profile.default_content_settings.popups", 0);
        }
    };

    @Nonnull
    @CheckReturnValue
    @Override
    public WebDriver create(@Nonnull Config config, @Nonnull Browser browser, @Nullable Proxy proxy, @Nullable File browserDownloadsFolder) {
        WebDriverManager.chromedriver().setup();

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
        chromeOptions.setExperimentalOption("prefs", prefs);

        return new ChromeDriver(chromeOptions);
    }
}
