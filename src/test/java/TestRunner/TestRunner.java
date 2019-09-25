package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature\\Demo1.Feature", glue= {"StepDefinition"}, plugin= {"html:target/cucumber.html"})
public class TestRunner {

}
