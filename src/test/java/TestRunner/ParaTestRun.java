package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature\\parameter.feature", glue= {"StepDefinition"}, plugin= {"html:target/cucumber11.html"})
public class ParaTestRun {

}
