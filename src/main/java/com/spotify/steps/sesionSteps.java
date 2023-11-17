package com.spotify.steps;

import com.spotify.pages.IniciarSesion;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
public class sesionSteps {


    @Page
    IniciarSesion iniciarSesion;

    @Step("Abrir el Navegador")
    public void abrirNavegador(){
        iniciarSesion.openUrl("https://accounts.spotify.com/");
    }

    @Step("Ingresar usuario")
    public void ingresarUsuario(){
        iniciarSesion.getDriver().findElement(iniciarSesion.getTxtCorreo()).sendKeys("vasquezortizgabriel@gmail.com");
    }
    @Step("Ingresar password")
    public void ingresarPassword(){
        iniciarSesion.getDriver().findElement(iniciarSesion.getTxtPassword()).sendKeys("GaBo715845*Spotify");
    }

    @Step("Dar clic en Boton iniciar sesion")
    public void darClickIniciar(){
        iniciarSesion.getDriver().findElement(iniciarSesion.getBtnInicioSesion()).click();
    }
    @Step("Dar clic en Web Player")
    public void darClickWebPlayer(){
        iniciarSesion.getDriver().findElement(iniciarSesion.getBtnWebPlayer()).click();
    }
}
