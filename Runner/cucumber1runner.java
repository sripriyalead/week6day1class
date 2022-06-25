package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Feature", glue="Steps",monochrome=true, publish=true)
public class cucumber1runner extends AbstractTestNGCucumberTests {

	
}