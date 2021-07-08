import org.junit.runner.RunWith;
import cucumber.api.junit.*;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(format={"pretty",
        "html:build/test-results/test-report"},
        features={"src/test/resources/features"})
@CucumberOptions(plugin = {"pretty", "json:target/cucumber-json-report2.json"})

public class TestRunner { }
