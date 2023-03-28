package testRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions

(
	features=".//medicarefeature/med.feature",
			glue="stepdefination",
			
					plugin={"pretty","html:test-output"}
)

public class runner
{
	
}