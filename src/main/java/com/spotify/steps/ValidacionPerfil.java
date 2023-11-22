package com.spotify.steps;

import com.spotify.pageObjectModel.PaginaInicialPage;
import com.spotify.pageObjectModel.PaginaPrincipalPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.spotify.utils.Esperas.espera1;

public class ValidacionPerfil {
    PaginaPrincipalPage paginaPrincipalPage;
    @Step("Validacion del enlace del perfil")
    public  void validacionperfil(){
//        WebDriverWait wait = new WebDriverWait(paginaInicialPageObject.getDriver(), Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.elementToBeClickable(paginaInicialPageObject.getLnkProfile())
//        );

        espera1(paginaPrincipalPage.getDriver(),paginaPrincipalPage.getLnkPrincipal());
        Assert.assertTrue(paginaPrincipalPage.getDriver().findElement(paginaPrincipalPage.getLnkPrincipal()
        ).isDisplayed());
    }
}
