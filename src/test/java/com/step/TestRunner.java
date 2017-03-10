package com.step;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by mhasan on 3/10/17.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/mhasan/IdeaProjects/Cucumber/src/Feature"
        , glue={"/Users/mhasan/IdeaProjects/Cucumber/src/test/java/com/step"}
        ,dryRun = true
        , monochrome = true

        //tags,strict,
        )

public class TestRunner
{





}
