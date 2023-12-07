package com.openjdz.spotify.steps;

import com.openjdz.spotify.pageObject.ValidacionIngresoPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

import static com.openjdz.spotify.utils.Esperas.espera1;

public class ValidacionIngresoSteps {
    @Page
    ValidacionIngresoPage validacionIngresoPage;

    @Step("Validación Ingreso Spotify")
    public void ValidacionPerfil(){
        espera1(validacionIngresoPage.getDriver(),validacionIngresoPage.lnkInicio);
        Assert.assertTrue(
                validacionIngresoPage.lnkInicio.isDisplayed()
        );
        validacionIngresoPage.lnkBuscar.click();

        /*espera1(validacionIngresoPage.getDriver(),validacionIngresoPage.getLnkInicio());
        validacionIngresoPage.getDriver().findElement(
                validacionIngresoPage.getLnkInicio()
        ).click();
        espera1(validacionIngresoPage.getDriver(),validacionIngresoPage.getLnkInicio());
    */
    }
}
