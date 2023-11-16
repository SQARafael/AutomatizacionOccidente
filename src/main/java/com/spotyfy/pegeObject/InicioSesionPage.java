package com.spotyfy.pegeObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class InicioSesionPage extends PageObject {
    private final By txtUsuario= By.id("login-username");
    private final By txtClave = By.id("login-password");
    private final By btnInicioSesion = By.xpath("(//button[starts-with(@class,'Button')])[6]");

    public By getTxtUsuario() {
        return txtUsuario;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getBtnInicioSesion() {
        return btnInicioSesion;
    }
}

