package stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		monochrome = true,
		plugin = {"pretty","html:target/html-cucumber","json:target/cucumber.json"},	
		features ="src/test/java/features",
		glue ="stepdefs",
		//tags= {"@Sanity"}, to run all the sanity scenarios
		//tags = {"@WIP"}, to run a work in progress scenario
		//tags = {"@Regression or @Sanity"}// either Regression or Sanity
		//tags = {"@Regression or @Sanity"}// both the tags should be there
		//a tag can be applied on top of a scenario s well as on top of a feature
		//tags = {"@Calculator"} //feature level tag
		//tags = {"not @WIP"}//run all the scenarios except WIP
		tags = {"@Browser and not @WIP"}//run all the browser scenarios except WIP
		)

public class TestRunner {
	
	

}
