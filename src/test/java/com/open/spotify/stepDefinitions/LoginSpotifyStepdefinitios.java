package com.open.spotify.stepDefinitions;

import com.open.spotify.steps.PaginaInicialSpotifySteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class LoginSpotifyStepdefinitios {
    @Steps
    PaginaInicialSpotifySteps paginaInicialSpotifySteps;

    @Dado("que el usuario abre el navegador y de clic al boton login")
    public void queElUsuarioAbreElNavegadorYDeClicAlBotonLogin() {
        paginaInicialSpotifySteps.abrirNavegador();
        paginaInicialSpotifySteps.clicLogin();
    }
    @Cuando("el usuario ingrese las credenciales correctas")
    public void elUsuarioIngreseLasCredencialesCorrectas() {

    }
    @Entonces("el usuario podrá ver su perfil")
    public void elUsuarioPodráVerSuPerfil() {

    }
}
