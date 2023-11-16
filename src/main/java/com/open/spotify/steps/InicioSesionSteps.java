package com.open.spotify.steps;

import com.open.spotify.pageObject.InicioSesionPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class InicioSesionSteps {

    @Page
    InicioSesionPage inicioSesionPage;

        @Step("Ingresar Datos Usuario")
        public void insertarUsuario(String eMail){
            inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtUsuario())
                    .sendKeys(eMail);

        }


    @Step("Ingresar clave Usuario")
    public void insertarClave(String psw){
        inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtClave())
                .sendKeys(psw);
    }



    @Step("Click en boton inicio sesion")
    public void clickInicioSesion(){

        inicioSesionPage.getDriver().findElement(inicioSesionPage.getBtnInicioSesion())
                .click();


    }



}
