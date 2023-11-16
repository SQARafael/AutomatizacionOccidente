package com.open.spotify.steps;

import com.open.spotify.pageObject.PaginaBienvenidaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class ValidacionPerfil {

    @Page
    PaginaBienvenidaPage paginaBienvenidaPage;

    @Step("validacion del icono del perfil")
    public void validacionPerfil(){

        Assert.assertTrue(
                paginaBienvenidaPage.getDriver().findElement(paginaBienvenidaPage.getLnkPerfil()).isDisplayed()
        );

    }
}
