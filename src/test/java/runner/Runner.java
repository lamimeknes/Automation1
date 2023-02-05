package runner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(

     //   plugin ={"json:target/cucumber.json", "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@RTB-1",
        dryRun =false
)


public class Runner {


}
