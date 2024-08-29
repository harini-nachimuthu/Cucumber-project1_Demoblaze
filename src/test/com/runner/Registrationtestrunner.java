package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\harin\\eclipse-workspace\\Cucumberproject\\src\\main\\resources\\Features",
    glue = "stepdefinitions" 
)
public class Registrationtestrunner {
    // This class will be empty. Its purpose is to serve as the entry point for your Cucumber tests.
}
