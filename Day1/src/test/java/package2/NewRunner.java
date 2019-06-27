package package2;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

//@CucumberOptions(monochrome=true,plugin={"pretty","html:htmlcucumber-reports"})
//@CucumberOptions(monochrome=true,plugin={"pretty","junit:newcucumber-reports.xml"})
//@CucumberOptions(monochrome=true,plugin={"pretty","newjson:cucumber-reports.json"})
//@CucumberOptions(monochrome=true,tags="@Tag1,@Tag2")
@CucumberOptions(monochrome=true,tags={" @outlines"})

public class NewRunner {

}
