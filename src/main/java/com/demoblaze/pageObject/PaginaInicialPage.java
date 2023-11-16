package com.demoblaze.pageObject;
/*
 * @(#) PaginaInicialPage.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class PaginaInicialPage extends PageObject {
    private final By lnkLogin= By.xpath("//a[@id='login2']");

    public By getLnkLogin() {
        return lnkLogin;
    }
}
