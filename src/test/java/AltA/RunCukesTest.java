package test.java.AltA;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"},
		features = "C:\\workspace\\CucumberSetup\\src\\test\\resources\\AltA"
		)
public class RunCukesTest {
}