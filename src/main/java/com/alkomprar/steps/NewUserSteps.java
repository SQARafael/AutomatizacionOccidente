package com.alkomprar.steps;

import com.alkomprar.pages.CrearUser;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class NewUserSteps {
    @Page
    CrearUser crearUser;
    @Step("Ingresar nombre")
    public void ingresarNombre(){
        crearUser.getDriver().findElement(crearUser.getTxtFirstName()).sendKeys("Juan");
    }
    @Step("Ingresar apellido")
    public void ingresarApellido(){
        crearUser.getDriver().findElement(crearUser.getTxtApellido()).sendKeys("Martinez");
    }
    @Step("Ingresar telefono")
    public void ingresarTelefono(){
        crearUser.getDriver().findElement(crearUser.getTxtTelefono()).sendKeys("3125163456");
    }
    @Step("Dar clic en Autorizacion")
    public void darClicAutorizacion(){
        crearUser.getDriver().findElement(crearUser.getBtnAutorizaDatos()).click();
    }
    @Step("Dar clic en Continuar")
    public void darClicContinuar(){
        crearUser.getDriver().findElement(crearUser.getBtnContinuar()).click();
    }
}
