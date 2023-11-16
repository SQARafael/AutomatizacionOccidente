package com.alkomprar.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feautres/RegistroDeUsuario.feature",
        glue = "com.alkomprar.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class Runner {
}
