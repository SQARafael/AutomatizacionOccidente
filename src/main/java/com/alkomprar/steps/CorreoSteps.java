package com.alkomprar.steps;

import com.alkomprar.pages.ValidacionCorreo;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class CorreoSteps {

    @Page
    ValidacionCorreo correo;
    @Step("Ingresar correo")
    public void ingresarCorreo(){
        correo.getDriver().findElement(correo.getTxtEmail()).sendKeys("pedro@gmail.com");
    }
    @Step("Dar clic en Boton Continuar")
    public void darClicContinuar(){
        correo.getDriver().findElement(correo.getBtnContinuar()).click();
    }
}
