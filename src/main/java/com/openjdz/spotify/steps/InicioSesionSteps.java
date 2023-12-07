package com.openjdz.spotify.steps;


import com.openjdz.spotify.pageObject.InicioSesionPage;
import com.openjdz.spotify.utils.Data;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

    public class InicioSesionSteps {
        @Page
        InicioSesionPage inicioSesionPage;
        @Step("Ingresar datos de usuario")
        public void insertarUsuario(){

            inicioSesionPage.txtUsuario.sendKeys(Data.extractTo().get(0).get("Usuario"));
        }
        @Step("Ingresar clave")
        public void insertarClave(){

            inicioSesionPage.txtClave.sendKeys(Data.extractTo().get(0).get("Clave"));
        }
        @Step("Click Inicio de sesion")
        public void btnClickInicioSesion(){
            inicioSesionPage.btnInicioSesion.click();
        }

}
