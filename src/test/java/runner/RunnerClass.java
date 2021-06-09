package runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/cucumber1/exercise5.feature",
				glue="stepdef",
				plugin="html:target/HTMLReport")
				//tags={"~@regression,~@login,@search"})

public class RunnerClass {

}
