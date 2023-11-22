package com.spotify.steps;

import com.spotify.pageObjectModel.InicioSesionPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class InicioSesionSteps {
    @Page
    InicioSesionPage inicioSesionPage;
    @Step("Ingresar datos de usuario")
    public void insertarCredenciales(){
        inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtUsuario())
                .sendKeys("alejandrop758@gmail.com");
        inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtClave())
                .sendKeys("Alejandrop758");
    }
    @Step("clic Login")
    public void clicIniciarSesion() {
        inicioSesionPage.getDriver().findElement(inicioSesionPage.getBtnInicioSesion()).click();
    }

}
