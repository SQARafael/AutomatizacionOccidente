package com.open.spotify.steps;

import com.open.spotify.pageObject.PaginaInicialSpotifyPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class PaginaInicialSpotifySteps {

    @Page
    PaginaInicialSpotifyPage paginaInicialSpotifyPage;
    @Step("Abrir el navegador")
    public void abrirNavegador(){
        paginaInicialSpotifyPage.openUrl("https://open.spotify.com/");
    }
    @Step("Clic boton Login")
    public void clicLogin(){
        paginaInicialSpotifyPage.getDriver().findElement(paginaInicialSpotifyPage.getBtnIniciarSesion()).click();
    }


    }
