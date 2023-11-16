package com.Spotify.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feautres/Spotify/LoginSpotify.feature",
        glue = "com.Spotify.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class SpotifyRunner {

}
