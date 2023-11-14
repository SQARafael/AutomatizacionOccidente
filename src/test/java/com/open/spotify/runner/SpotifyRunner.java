package com.open.spotify.runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "src/test/resources/feautres/spotify/LoginSpotify.feature",
        glue = "com.open.spotify.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class SpotifyRunner {
}
