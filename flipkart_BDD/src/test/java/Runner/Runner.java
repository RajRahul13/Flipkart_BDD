package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",
glue= {"step_Definitions"},
monochrome = true,
tags = "",
plugin = {"pretty","html:target/cucumber","json:target/cucumber.json"}
)

public class Runner {

}
