package com.open.spotify.pageObjectModel;
/*
 * @(#) InicioSesionPage.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class InicioSesionPage extends PageObject {
    private final By txtUsuario= By.xpath("//input[@id='login-username']");

    private final By txtClave= By.xpath("//input[@id='login-password']");
    private final By btnInicioSesion= By.xpath("(//button[@id='login-button']");

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
