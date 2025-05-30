package com.msme.runner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\soubhagyalaxmi\\eclipse-workspace\\MSME_cucumberProject\\src\\test\\resources\\FeatureFile",
    glue = "stepdefinition",
    plugin = {
            "pretty",
            "html:target/cucumber-reports.html",
            "json:target/cucumber-reports/cucumber.json",
            "junit:target/cucumber-reports/cucumber.xml"
        },
        monochrome = true
)
public class TestRunner extends 	AbstractTestNGCucumberTests {
	
}


