package com.spotyfy.steps;

import com.spotyfy.pegeObject.InicioSesionPage;
import com.spotyfy.pegeObject.PaginaInicialPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.spotyfy.utils.Esperas.espera1;

public class ValidacionPerfil {
    @Page
    PaginaInicialPage paginaInicialPage;

    @Step("Validacion del enlace del perfil")
    public void validacionPerfil(){


        espera1(paginaInicialPage.getDriver(), paginaInicialPage.getLnkProfile());
        Assert.assertTrue(
                paginaInicialPage.getDriver().findElement(
                        paginaInicialPage.getLnkProfile()
                ).isDisplayed()
        );
    }
}
