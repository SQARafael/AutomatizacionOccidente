package com.open.spotify.steps;

import com.open.spotify.pageObject.InicioSesionSpotifyPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class InicioSesionSpotifySteps {

    @Page
    InicioSesionSpotifyPage inicioSesionSpotifyPage;

    @Step("Ingresar datos usuario")
    public void insertarCredenciales(String mail, String psw){
        inicioSesionSpotifyPage.getDriver().findElement(inicioSesionSpotifyPage.getTxtUsuario())
                .sendKeys(mail);

        inicioSesionSpotifyPage.getDriver().findElement(inicioSesionSpotifyPage.getTxtClave())
                .sendKeys(psw);
    }

    @Step("Clic btn inicio sesion")
    public void clicInicioSesion(){
        inicioSesionSpotifyPage.getDriver().findElement(inicioSesionSpotifyPage.getBtnInicioSesion())
                .click();
    }
}
