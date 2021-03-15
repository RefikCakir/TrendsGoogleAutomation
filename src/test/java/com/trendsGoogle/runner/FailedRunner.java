package com.trendsGoogle.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/trendsGoogle/stepDefinitions",
        features = "@target/rerun.txt",
        publish = false
)
public class FailedRunner {


}
