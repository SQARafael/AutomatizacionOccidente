package com.demoblaze.steps;

import com.demoblaze.pageObjectModel.InicioSesionPageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class InicioSesionSteps {
    @Page
    InicioSesionPageObject inicioSesionPageObject;

    @Step("Ingresar datos de usuario")
    public void insertarCredenciales(String mail, String psw) {
        inicioSesionPageObject.getDriver().findElement(inicioSesionPageObject.getTxtUsuario())
                .sendKeys(mail);
        inicioSesionPageObject.getDriver().findElement(inicioSesionPageObject.getTxtClave())
                .sendKeys(psw);
    }

    @Step("clic Login")
    public void clicIniciarSesion() {
        inicioSesionPageObject.getDriver().findElement(inicioSesionPageObject.getBtnInicioSesion()).click();

    }
}
