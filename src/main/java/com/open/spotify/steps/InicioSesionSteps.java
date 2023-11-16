package com.open.spotify.steps;

import com.open.spotify.pageObject.InicioSesionPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class InicioSesionSteps {

    @Page
    InicioSesionPage inicioSesionPage;

    public void insertarUsuario(){
        inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtUsuario()).
                sendKeys("lmgarzon.lis@hotmail.com");
    }

    @Step("Ingresar clave")
    public void insertarClave(){
        inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtClave()).
                sendKeys("L1n4L1s85*");
    }

    @Step("Click en boton inicio Spotify")
    public void clickInicioSpotify(){
        inicioSesionPage.getDriver().findElement(inicioSesionPage.getBttInicioSesion()).click();
    }
}
