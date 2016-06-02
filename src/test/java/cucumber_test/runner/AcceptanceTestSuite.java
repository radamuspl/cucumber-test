package cucumber_test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty",
		"html:target/cucumber" }, glue = "cucumber_test.steps", features = {"classpath:cucumber"})
public class AcceptanceTestSuite {

	
}
