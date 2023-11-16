package com.spotyfy.steps;

import com.spotyfy.pegeObject.InicioSesionPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class InicioSesionSteps {
    @Page
    InicioSesionPage inicioSesionPage;

    @Step("Ingresar datos usuario")
    public void insertarCredenciales(String mail, String psw){
        inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtUsuario())
                .sendKeys(mail);
        inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtClave())
                .sendKeys(psw);
    }
    @Step("Clic btn inicio sesion")
    public void clicInicioSesion(){
        inicioSesionPage.getDriver().findElement(inicioSesionPage.getBtnInicioSesion())
                .click();
    }
}
