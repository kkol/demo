package steps;

import framework.FrameworkConfig;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = {FrameworkConfig.class})
public class CucumberSpringConfiguration {
}
