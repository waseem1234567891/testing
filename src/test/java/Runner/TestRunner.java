package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/featchers/login1.feature", // Path to your feature files
        glue = "test.Steps",dryRun = false
)
public class TestRunner {
}
