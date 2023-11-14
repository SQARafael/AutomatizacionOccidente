package com.demoblaze.steps;

import com.demoblaze.pageObject.InicioSesionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fluentlenium.core.annotation.Page;

public class InicioSesionSteps {

    @Page
    InicioSesionPage inicioSesionPage;

    @Step("Ingresar datos usuario")
    public void insertarCredenciales(){
        inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtUsuario())
                .sendKeys("carl@mail.com");

        inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtClave())
                .sendKeys("1234");
    }

    @Step("Clic boton inicio sesion")
    public void clicInicioSesion(){
        inicioSesionPage.getDriver().findElement(inicioSesionPage.getBtnInicioSesion())
                .click();
    }

}
