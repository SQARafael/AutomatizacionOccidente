package com.open.spotify.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicialSpotifyPage extends PageObject {
    private final By btnIniciarSesion= By.xpath("//button[@data-testid='login-button']");

    public By getBtnIniciarSesion() {
        return btnIniciarSesion;
    }
}
