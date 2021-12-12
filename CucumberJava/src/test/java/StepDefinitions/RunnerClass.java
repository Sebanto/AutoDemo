package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue= {"StepDefinitions"},
monochrome = true,
plugin = {"pretty", "junit:target/JunitReport/report.xml",
		"json:target/JsonReport/report.json",
		"html:target/HTMLReport/report.html"},
tags = "@Smoke"
		)

public class RunnerClass {

}
