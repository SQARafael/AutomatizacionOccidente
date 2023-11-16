package com.alkomprar.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
public class ValidacionCorreo extends PageObject {



    private By txtEmail = By.id("js-login-email");

    public By getTxtEmail() {
        return txtEmail;
    }



    private By btnContinuar = By.id("js-login-continue");

    public By getBtnContinuar() {
        return btnContinuar;
    }



}
