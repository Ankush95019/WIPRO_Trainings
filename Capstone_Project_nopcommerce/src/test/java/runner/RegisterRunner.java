package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"src/test/resources/features/register.feature"},
    glue = {"stepDefinitions"},
    plugin = {
        "pretty",
        "html:target/cucumber-reports/register.html"
    },
    monochrome = true
)
public class RegisterRunner extends AbstractTestNGCucumberTests {
}
