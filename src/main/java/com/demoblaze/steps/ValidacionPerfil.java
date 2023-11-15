package com.demoblaze.steps;
/*
 * @(#) ValidacionPerfil.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.demoblaze.pageObject.PaginaInicialPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class ValidacionPerfil {
    @Page
    PaginaInicialPage paginaInicialPage;

    @Step("Validacion del enlace del perfil")
    public void validacionPerfil(){
        Assert.assertTrue(
                paginaInicialPage.getDriver().findElement(
                        paginaInicialPage.getLnkProfile()
                ).isDisplayed()
        );
    }

}
