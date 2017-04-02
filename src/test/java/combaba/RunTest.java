package combaba;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

       features = ".", tags = "@live", plugin =
        {"pretty","html:target/babacom-html-report", "json:target/babacom_report.json"})

public class RunTest {
}
