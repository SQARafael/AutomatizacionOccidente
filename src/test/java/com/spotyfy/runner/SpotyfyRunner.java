package com.spotyfy.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feautres/LoginSpotyfy.feature",
        glue = "com.spotyfy.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class SpotyfyRunner {
}
