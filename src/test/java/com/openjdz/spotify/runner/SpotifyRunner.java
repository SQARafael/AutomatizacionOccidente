package com.openjdz.spotify.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/spotify/",
        //tags = "@LoginSpotify",
        glue = "com.openjdz.spotify.stepDefinitions",/*"com.openjdz.spotify.stepDefinitions",/*donde voy a guardar mis metodos,
        la lógica de negocio*/
        snippets = CucumberOptions.SnippetType.CAMELCASE



)
public class SpotifyRunner {
}
