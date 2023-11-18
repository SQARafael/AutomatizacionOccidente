package com.spotify.accounts.steps;

import com.spotify.accounts.pageObjectModel.AccountPageObject;
import com.spotify.open.pageObjectModel.PrincipaPageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class AccountPageSteps {
    @Page
    AccountPageObject accountPageObject;
    @Step("Abrir navegador inicio sesion")
    public void abrirPaginaInicioSesion(){
        accountPageObject.openUrl("https://accounts.spotify.com/es/login?continue=https%3A%2F%2Fopen.spotify.com%2Fintl-es");

    }
    @Step("Ingresar usuario")
    public void insertarUserName(){
        accountPageObject.getDriver().findElement(accountPageObject.getTxtUsername()).sendKeys("meochoa@unbosque.edu.co");

    }
    @Step("Ingresar contraseña")
    public void insertarPass(){
        accountPageObject.getDriver().findElement(accountPageObject.getTxtPass()).sendKeys("chicoFc8Am@");

    }
    @Step("Click Iniciar sesion")
    public void clickIniciarsesion(){
        accountPageObject.getDriver().findElement(accountPageObject.getBtnInicioSesion()).click();

    }
}
