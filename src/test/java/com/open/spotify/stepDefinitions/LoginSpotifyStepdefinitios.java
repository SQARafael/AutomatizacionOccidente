package com.open.spotify.stepDefinitions;

import com.open.spotify.pageObject.InicioSesionSpotifyPage;
import com.open.spotify.steps.InicioSesionSpotifySteps;
import com.open.spotify.steps.PaginaInicialSpotifySteps;
import com.open.spotify.steps.ValidacionPerfilSpotify;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class LoginSpotifyStepdefinitios {
    @Steps
    PaginaInicialSpotifySteps paginaInicialSpotifySteps;
    @Steps
    InicioSesionSpotifySteps inicioSesionSpotifySteps;
    @Steps
    ValidacionPerfilSpotify validacionPerfilSpotify;

    @Dado("que el usuario abre el navegador y de clic al boton login")
    public void queElUsuarioAbreElNavegadorYDeClicAlBotonLogin() {
        paginaInicialSpotifySteps.abrirNavegador();
        paginaInicialSpotifySteps.clicLogin();
    }
    @Cuando("el usuario ingrese las credenciales correctas usuario {string} y clave {string}")
    public void elUsuarioIngreseLasCredencialesCorrectasUsuarioYClave(String usuario, String clave) {
        inicioSesionSpotifySteps.insertarCredenciales(usuario,clave);
        inicioSesionSpotifySteps.clicInicioSesion();
    }
    @Entonces("el usuario podrá ver su perfil")
    public void elUsuarioPodráVerSuPerfil() {
    validacionPerfilSpotify.validacionPerfil();
    }
}
