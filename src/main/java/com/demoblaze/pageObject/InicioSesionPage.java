package com.demoblaze.pageObject;
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
    private final By txtUsuario= By.id("loginusername");

    private final By txtClave= By.xpath("//input[@id='loginpassword']");
    private final By btnInicioSesion= By.xpath("(//button[starts-with(@class,'btn')])[6]");

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
