package com.open.spotify.steps;

import com.open.spotify.pageObject.PaginaBienvenidaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.open.spotify.utils.Esperas.*;


public class ValidacionPerfil {

    @Page
    PaginaBienvenidaPage paginaBienvenidaPage;

    @Step("validacion del icono del perfil")
    public void validacionPerfil(){


        espera1(paginaBienvenidaPage.getDriver(),paginaBienvenidaPage.getLnkPerfil());

        //implicita
        espera2(paginaBienvenidaPage.getDriver());

        Assert.assertTrue(
                paginaBienvenidaPage.getDriver().findElement(paginaBienvenidaPage.getLnkPerfil()).isDisplayed()
        );

    }
}
