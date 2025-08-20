package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/Register.feature"},glue = {"StepDefinitions", "Hooks"},
        monochrome = true,
        plugin = {
                "pretty", "html:target/HtmlReports", "json:target/JsonReports/report.json",
                "junit:target/junitReports/report.xml"}
)
public class RegisterRunner {
}
