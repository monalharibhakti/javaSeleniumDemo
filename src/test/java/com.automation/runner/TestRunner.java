package com.automation.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:featureFiles"},
        glue = {"com.automation.stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-html-report"},
        tags = "@test",
        monochrome = true
)
public class TestRunner {
}
