 package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/resources/Feature",
		 glue= {"stepDefinitions","baseinit"},
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:test-output/RerunCases/rerun.txt","json:test-output/cucumber-JSON-report/JSONReport.json","junit:test-output/cucumber-XML-report/XMLReport.xml","json:target/cucumber.json"},
		 monochrome = true,
		 dryRun = false
		 ,tags = {"@Dashboard3"}
 )

public class RunnerTest {
	
	
	}
