package com.open.spotify.steps;

import com.open.spotify.pageObject.InicioSesionPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class InicioSesionSteps {

    @Page
    InicioSesionPage inicioSesionPage;

        @Step("Ingresar Datos Usuario")
        public void insertarUsuario(){
            inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtUsuario())
                    .sendKeys("tavodres@gmail.com");

        }


    @Step("Ingresar clave Usuario")
    public void insertarClave(){
        inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtClave())
                .sendKeys("02173086c");
    }



    @Step("Click en boton inicio sesion")
    public void clickInicioSesion(){

        inicioSesionPage.getDriver().findElement(inicioSesionPage.getBtnInicioSesion())
                .click();


    }



}
