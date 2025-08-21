package runner;
 
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(
    features = "src/test/resources/features/login.feature",   // Path to your .feature files
    glue = "stepDefinition",                             // Step definitions package
    plugin = {"pretty", "html:target/cucumber-reports.html"},
    monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}