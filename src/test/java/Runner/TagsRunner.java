package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/featchers/tags.feature", // Path to your feature files
        glue = {"Steps","Hooks"},
        plugin = {"pretty", "html:target/HTMLReports.html"},
        //tags= "@smoke or @regression"
        //tags = "@smoke and @regression"
        //tags = "(@smoke or @regression) and @important"
        //tags = "@regression and not @smoke"
        //tags = "(@smoke or @regression) and not @important"
        tags = "@mustrun"

        )
public class TagsRunner {
}
