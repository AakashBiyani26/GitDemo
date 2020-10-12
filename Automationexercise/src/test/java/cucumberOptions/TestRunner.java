package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",  // if all test cases i.e. feature files have to be executed
		// then give the complete package Location i.e.src/test/java/features and if only one the test case
		// has to be executed then give location till file level (i.e. the particular Test case)
		
		glue = "stepDefinations", tags="@SeleniumTestOct"
		)
public class TestRunner {
	
}
