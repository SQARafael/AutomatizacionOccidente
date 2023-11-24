package com.demoblaze.steps;
import com.demoblaze.pageObject.InicioSesionPage;
import com.demoblaze.utils.Data;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

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
