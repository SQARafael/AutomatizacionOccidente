package com.open.spotify.pageObject;

import lombok.Data;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@Data
public class InicioSesionSpotifyPage extends PageObject {

    private final By txtUsuario= By.id("login-username");
    private final By txtClave= By.id("login-password");
    private final By btnInicioSesion= By.id("login-button");

}
