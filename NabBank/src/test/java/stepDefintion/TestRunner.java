package stepDefintion;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
        (
        		plugin = {"pretty", "html:target/cucumberHtmlReport",
        			     "html:target/cucumberHtmlReport", //  for html result 
        				 "pretty:target/cucumber-json-report.json" // for json result
        		        
        			     },
		features = "src/test/resources/features",
		glue="stepDefinations",stepNotifications = true,monochrome =true ,dryRun=true
		
        
		)
public class TestRunner {

}
