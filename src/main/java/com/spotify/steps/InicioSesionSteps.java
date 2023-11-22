package com.spotify.steps;

import com.spotify.pageObjectModel.InicioSesionPage;
import com.spotify.utils.Data;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class InicioSesionSteps {
    @Page
    InicioSesionPage inicioSesionPage;



    //public void insertarCredenciales}(String mail,String psw){ refacorizado
//metodo para agregar el usuario por excel
// String correo= Data.extractTo().get(0).get("Usuario");
// String pss= Data.extractTo().get(0).get("Clave");

    @Step("Ingresar datos de usuario")
    public void insertarCredenciales(){



        inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtUsuario())
                .sendKeys(Data.extractTo().get(0).get("Usuario"));
        inicioSesionPage.getDriver().findElement(inicioSesionPage.getTxtClave())
                .sendKeys(Data.extractTo().get(0).get("Clave"));
    }
    @Step("clic Login")
    public void clicIniciarSesion() {
        inicioSesionPage.getDriver().findElement(inicioSesionPage.getBtnInicioSesion()).click();
    }

}
