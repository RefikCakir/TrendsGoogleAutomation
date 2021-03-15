package com.trendsGoogle.stepDefinitions;

import com.trendsGoogle.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.util.concurrent.TimeUnit;

public class Hooks {

    /**
     * Hooks name is not reserved. You may name this class in any way.
     * For example: SuiteSetupAndTearDown
     * Hooks triggered based on tags not class name or their location.
     * These methods can be a part of any step definition class.
     * Common practice is to store them in the separate class.
     */




        @Before
        public void setup(Scenario scenario) {
            System.out.println(":::::: Starting Automation:::::");
            Driver.getDriver().manage().window().maximize();
            Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        }

        @Before("@TrendsGoogle")
        public void features(){

            System.out.println("\n:::Test execution is in the process:::\n");

        }


        @After
        public void tearDown(Scenario scenario) {
            //this is a hook after
            //runs automatically after every test
            if (scenario.isFailed()) {
                byte[] data = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.attach(data, "image/png", scenario.getName());
            }

         //  Driver.closeDriver();
            System.out.println("\n:::(^_^) End of test execution (*_*):::");
        }

}
