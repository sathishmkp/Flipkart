package runnerPackMaplogik;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(  
		
		features ="src/test/resources/feature",
		glue="com.mp.feature_files",
		dryRun = true,
		monochrome = true
		)
	
	

public class RunnerMaplogik {

}
