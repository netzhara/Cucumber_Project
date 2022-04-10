package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/Feature/Logn.feature",
                 tags = "@123",
                 // tags = {"@Sanity, @Regression"} using OR
                 // tags = {"@Sanity or @Regression"} using OR
                 // tags = {"@Sanity and @Regression"} using AND
                 // tags = {"@Sanity" , "@Regression"} using AND
                 glue = {"stepDefinition"},
                 plugin = {"pretty","html:target/CucumberReport/cucumber.html",
                		 "json:target/JsonReports/report.json",
                		 "junit:target/JUnitReports/report.xml"}
                  )
public class TestRunner {
	
}
