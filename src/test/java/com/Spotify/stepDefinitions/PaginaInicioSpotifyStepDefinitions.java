package com.Spotify.stepDefinitions;

import Spotify.steps.PaginaIniciosteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class PaginaInicioSpotifyStepDefinitions {

    @Steps
    PaginaIniciosteps paginainiciosteps;

    @Dado("El usuario abre el navegador y de clic al boton login")
    public void elUsuarioAbreElNavegadorYDeClicAlBotonLogin() {
        paginainiciosteps.abrirNavegador();
        paginainiciosteps.clicLogin();
    }
    @Cuando("El usuario ingrese las credenciales correctas")
    public void elUsuarioIngreseLasCredencialesCorrectas() {

    }
    @Entonces("el usuario podrá ver su perfil")
    public void elUsuarioPodráVerSuPerfil() {

    }

}
