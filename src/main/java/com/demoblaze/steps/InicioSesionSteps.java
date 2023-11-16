package com.demoblaze.steps;
/*
 * @(#) InicioSesionSteps.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.demoblaze.pageObject.InicioSesionPage;
import com.demoblaze.utils.Data;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class InicioSesionSteps {
    @Page
    InicioSesionPage inicioSesionPage;

    @Step("Ingresar datos usuario")
    public void insertarCredenciales(){

        inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtUsuario())
                .sendKeys(Data.extractTo().get(0).get("Usuario"));

        inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtClave())
                .sendKeys(Data.extractTo().get(0).get("Clave"));
    }

    @Step("Clic btn inicio sesion")
    public void clicInicioSesion(){
        inicioSesionPage.getDriver().findElement(inicioSesionPage.getBtnInicioSesion())
                .click();
    }


}
