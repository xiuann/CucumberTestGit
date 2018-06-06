package cucumberRunner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(  monochrome = true,
features = "src/test/java/feature/",
dryRun = false,
plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
		"junit:target/cucumber-reports/Cucumber.xml",
		"html:target/cucumber-reports"},
glue = "stepDefinition" )



public class CucumberRunner {

	
	
	
	
	

}
