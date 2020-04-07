package testRunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/resources/features"},
        glue={"stepDefinition"},
        plugin = {"pretty","html:target/cucumber"},
        tags = "@sanity"

)

public class TestRunner {

}
