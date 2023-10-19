package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions (features = "C:\\Users\\tharini.murugesan\\eclipse-workspace\\TestDemoworkshop\\src\\test\\resources\\Feature\\scenario1.feature",
                  glue = "org.scenario1",
                  monochrome = true,
                  plugin = {"pretty","html:target/cucumber-reports/report.html"}
                  )
public class TestRunner {

}
