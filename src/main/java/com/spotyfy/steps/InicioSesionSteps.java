package com.spotyfy.steps;

import com.spotyfy.pegeObject.InicioSesionPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class InicioSesionSteps {
    @Page
    InicioSesionPage inicioSesionPage;

    @Step("Ingresar datos usuario")
    public void insertarCredenciales(){
        inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtUsuario())
                .sendKeys("osdelrio@gmail.com");
        inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtUsuario())
                .sendKeys("ASdf1234*");
    }
    @Step("Clic btn inicio sesion")
    public void clicInicioSesion(){
        inicioSesionPage.getDriver().findElement(inicioSesionPage.getBtnInicioSesion())
                .click();
    }
}
