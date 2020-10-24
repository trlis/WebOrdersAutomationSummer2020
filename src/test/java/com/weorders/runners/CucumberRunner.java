package com.weorders.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(   // to parametrize cucumber test execution
        glue = "com\\weorders\\step_defenitions",
        features = "src\\test\\resources\\features",
        dryRun = true



)
public class CucumberRunner {


}
