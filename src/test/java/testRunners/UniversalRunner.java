package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@test",
        plugin = {"html:target/cucumber", "json:target/cucumber.json"},
        features = {"src/test/resources/features/"},
        glue = {"stepDefinitions"}
)

public class UniversalRunner {
}
