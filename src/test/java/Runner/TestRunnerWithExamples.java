package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/featchers/loginWithExamples.feature", // Path to your feature files
        glue = {"Steps","Hooks"},
        plugin = {"pretty", "html:target/HTMLReports.html"})
public class TestRunnerWithExamples {
}
