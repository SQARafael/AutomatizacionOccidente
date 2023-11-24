package com.open.spotify.steps;

import com.open.spotify.pageObject.InicioSesionSpotifyPage;
import com.open.spotify.utils.Data;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class InicioSesionSpotifySteps {

    @Page
    InicioSesionSpotifyPage inicioSesionSpotifyPage;
    @Step("Ingresar datos usuario")
    public void insertarCredenciales(){

        inicioSesionSpotifyPage.getDriver().findElement(inicioSesionSpotifyPage.getTxtUsuario())
                .sendKeys(Data.extractTo().get(0).get("Usuario"));

        inicioSesionSpotifyPage.getDriver().findElement(inicioSesionSpotifyPage.getTxtClave())
                .sendKeys(Data.extractTo().get(0).get("Clave"));
    }
    @Step("Clic btn inicio sesion")
    public void clicInicioSesion(){
        inicioSesionSpotifyPage.getDriver().findElement(inicioSesionSpotifyPage.getBtnInicioSesion())
                .click();
    }


}
