package com.demoblaze.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class InicioSesionPage extends PageObject {

    private final By txtUsuario= By.id("loginusername");

    private final By txtClave=By.xpath("//input[@id='loginpassword']");

    private final By bttInicioSesion=By.xpath("//button[text()='Log in']");

    public By getTxtUsuario() {
        return txtUsuario;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getBttInicioSesion() {
        return bttInicioSesion;
    }
}
