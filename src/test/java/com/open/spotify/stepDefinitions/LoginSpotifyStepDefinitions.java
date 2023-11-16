package com.open.spotify.stepDefinitions;

import com.open.spotify.steps.PaginaInicialSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class LoginSpotifyStepDefinitions {
    @Steps
    PaginaInicialSteps paginaInicialSteps;


    @Dado("que el usuario abre el navegador y de clic al boton boton Iniciar Sesión")
    public void queElUsuarioAbreElNavegadorYDeClicAlBotonLogin() {
        paginaInicialSteps.abrirNavegador();
        paginaInicialSteps.clicLogin();

    }
    @Cuando("el usuario ingrese las credenciales correctas")
    public void elUsuarioIngreseLasCredencialesCorrectas() {


    }
    @Entonces("el usuario podrá ver su perfil")
    public void elUsuarioPodráVerSuPerfil() {

    }
}
