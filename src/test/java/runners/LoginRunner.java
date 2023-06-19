package runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(strict =true,
        features= "C:\\Users\\clara\\eclipse-selenium\\cucumber2012\\src\\test\\resources\\features",
        glue= "stepdefinition",
       tags =  {"@Skybluefeature"},
        monochrome= true,
      // dryRun =false,
        plugin= {
        		"pretty",
        		"html:target/reports/cucumber.html",
        		"json:target/reports/cucumber.json"
        		
        }

)
public class LoginRunner {

	
	
	}
	
	
	
	


