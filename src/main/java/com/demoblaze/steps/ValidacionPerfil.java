package com.demoblaze.steps;

import com.demoblaze.pageObject.PaginaInicialPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class ValidacionPerfil {
    @Page
    PaginaInicialPage paginaInicialPage;

    @Step("Validación del enlace del perfil")
    public void validacionPerfil(){
        Assert.assertTrue(paginaInicialPage.getDriver()
                .findElement(paginaInicialPage.getLnkProfile())
                .isDisplayed());
    }
}
