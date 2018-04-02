package framework;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		
        features = "/Users/fatemaislam/Documents/workspace/ups.com/features/login.feature",
        // Specify tags to be executed
       // tags = {"@regression-1"},
        //Specify step definition package name (Note: make sure to have this package on current directory) 
        glue = {"stepdefinition"}
)
public class TestRunner {
	
}
