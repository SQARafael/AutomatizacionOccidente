package com.open.spotify.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class InicioSesionPage extends PageObject {

    private final By txtUsuario= By.id("login-username");

    private final By txtClave=By.xpath("//input[@id='login-password']");

    private final By bttInicioSesion=By.xpath("//button[@id='login-button']");

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
