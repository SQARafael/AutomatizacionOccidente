package com.alkomprar.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CrearUser extends PageObject {


    private By txtFirstName = By.id("register.firstName");
    public By getTxtFirstName() {
        return txtFirstName;
    }


    private By txtApellido = By.id("register.lastName");
    public By getTxtApellido() {
        return txtApellido;
    }



    private By txtTelefono = By.id("register.mobileNumber");
    public By getTxtTelefono() {
        return txtTelefono;
    }



    private By btnAutorizaDatos = By.id("registerChkTermsConditions");
    public By getBtnAutorizaDatos() {
        return btnAutorizaDatos;
    }


    private By btnContinuar = By.id("registerChkTermsConditions");
    public By getBtnContinuar() {
        return btnContinuar;
    }

}
