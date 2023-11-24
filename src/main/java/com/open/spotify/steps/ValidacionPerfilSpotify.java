package com.open.spotify.steps;

import com.open.spotify.pageObject.PaginaInicialSpotifyPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

import static com.demoblaze.utils.Esperas.espera1;

public class ValidacionPerfilSpotify {
    @Page
    PaginaInicialSpotifyPage paginaInicialSpotifyPage;
    @Step("Validacion del enlace del perfil")
    public void validacionPerfil(){
        espera1(paginaInicialSpotifyPage.getDriver(),paginaInicialSpotifyPage.getLnkProfile());
        Assert.assertTrue(
                paginaInicialSpotifyPage.getDriver().findElement(
                        paginaInicialSpotifyPage.getLnkProfile()
                ).isDisplayed()
        );
    }

}
