package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"src/test/resources/features/login.feature"},
    glue = {"stepDefinitions"},
    plugin = {
        "pretty",
        "html:target/cucumber-reports/login.html"
    },
    monochrome = true
)
public class LoginRunner extends AbstractTestNGCucumberTests {
}
