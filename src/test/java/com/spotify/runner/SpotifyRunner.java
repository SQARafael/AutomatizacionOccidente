package com.spotify.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/feautres/spotify/LoginSpotify.feature",
        glue = "com.spotify.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class SpotifyRunner {

}
