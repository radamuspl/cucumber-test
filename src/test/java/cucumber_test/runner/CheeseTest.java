package cucumber_test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty",
		"html:target/cucumber" }, glue = "com.czeczotka.bdd.steps", features = "classpath:cucumber/GoogleSearch.feature")
public class CheeseTest {

	
}
