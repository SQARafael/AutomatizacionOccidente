package com.spotify.open.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feautres/spotify/LoginSpotify.feature",
        glue = "src/test/java/com/spotify/open/stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class SpotifyRunner {
}
