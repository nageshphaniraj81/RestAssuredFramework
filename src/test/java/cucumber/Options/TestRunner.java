package cucumber.Options;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/java/features", glue = { "stepDefinations" }, tags = { "@AddPlace","@DeletePlace"})
@CucumberOptions(features = "src/test/java/features", glue = { "stepDefinations" }, plugin = "json:target/jsonReports/cucumber-report.json")

public class TestRunner {
	

}
