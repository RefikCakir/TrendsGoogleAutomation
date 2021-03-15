package com.trendsGoogle.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "rerun:target/rerun.txt",
                "json:target/cucumber.json",
                "timeline:target/timeline-report",
                "pretty","json:target/cucumber-json/cucumber.json"
        },
        features = {
                "src/test/resources/features"
        },

        glue = "com/trendsGoogle/stepDefinitions",
        dryRun = false,
        tags = "@TrendsGoogle"

)
    public class TestRunner {

    }

