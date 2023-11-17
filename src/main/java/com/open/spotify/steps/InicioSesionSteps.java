package com.open.spotify.steps;

import com.open.spotify.utils.Data;
import com.open.spotify.pageObject.InicioSesionPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class InicioSesionSteps {

    @Page
    InicioSesionPage inicioSesionPage;

    @Step("Ingresar usuario")
    public void insertarUsuario(){
        //inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtUsuario()).sendKeys("lmgarzon.lis@hotmail.com");

        inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtUsuario()).sendKeys(Data.extractTo().get(0).get("Usuario"));

    }

    @Step("Ingresar clave")
    public void insertarClave(){
        //inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtClave()).sendKeys("L1n4L1s85*");

        inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtClave()).sendKeys(Data.extractTo().get(0).get("Clave"));
    }

    @Step("Click en boton inicio Spotify")
    public void clickInicioSpotify(){
        inicioSesionPage.getDriver().findElement(inicioSesionPage.getBttInicioSesion()).click();
    }
}
