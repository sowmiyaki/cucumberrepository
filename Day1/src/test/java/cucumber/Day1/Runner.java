package cucumber.Day1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@CucumberOptions(monochrome=true,plugin={"pretty","html:cucumber-reports"})
//@CucumberOptions(monochrome=true,plugin={"pretty","junit:cucumber-reports.xml"})
@CucumberOptions(monochrome=true,plugin={"pretty","json:cucumber-reports.json"})
public class Runner
{


}
