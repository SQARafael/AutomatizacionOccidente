package com.open.spotify.steps;

import com.open.spotify.pageObject.PaginaInicialPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

import static com.demoblaze.utils.Esperas.espera1;

public class ValidacionPerfil {

    @Page
    PaginaInicialPage paginaInicialPage;

    @Step("Validación de enlace")
    public void validacionPerfil(){

       espera1(paginaInicialPage.getDriver(),paginaInicialPage.getLnkProfile());
       Assert.assertTrue(
               paginaInicialPage.getDriver().findElement(
                       paginaInicialPage.getLnkProfile())
                       .isDisplayed());
    }
}
