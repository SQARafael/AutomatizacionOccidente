package com.demoblaze.steps;


import com.demoblaze.pageObject.InicioSesionPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import com.demoblaze.utils.Data;

public class InicioSesionSteps {

    @Page
    InicioSesionPage inicioSesionPage;

   /* @Step("Ingresar datos Usuario")
    public void insertarUsuario(){
        inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtUsuario()).
                sendKeys("carl@mail.com");
    }

    @Step("Ingresar clave")
    public void insertarClave(){
        inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtClave()).
                sendKeys("1234");
    }
    */

    @Step("Ingresar datos usuario")
    public void insertarCredenciales(){

        //String nombre= Data.extractTo().get(0).get("Usuario");

       //inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtUsuario()).sendKeys("carl@mail.com");
        //inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtClave()).sendKeys("1234");

        inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtUsuario()).sendKeys(Data.extractTo().get(0).get("Usuario"));

       inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtClave()).sendKeys(Data.extractTo().get(0).get("Clave"));

    }

    @Step("Click en boton inicio")
    public void clickInicioSesion(){
        inicioSesionPage.getDriver().findElement(inicioSesionPage.getBttInicioSesion()).click();
    }

}
