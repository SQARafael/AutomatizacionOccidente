package com.Spotify.stepDefinitions;

import Spotify.steps.Iniciosesionsteps;
import Spotify.steps.PaginaIniciosteps;
import Spotify.steps.ValidacionPerfilsteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class PaginaInicioSpotifyStepDefinitions {

    @Steps
    PaginaIniciosteps paginainiciosteps;

    Iniciosesionsteps iniciosesionsteps;

    ValidacionPerfilsteps validacionPerfilsteps;
    @Dado("El usuario abre el navegador y de clic al boton login")
    public void elUsuarioAbreElNavegadorYDeClicAlBotonLogin() {
        paginainiciosteps.abrirNavegador();
        paginainiciosteps.clicLogin();
    }
        @Cuando("El usuario ingrese las credenciales correctas usuario {string} y contrasena {string}")
        public void Enviarcredenciales (String Usuario, String Contrasena) {
        iniciosesionsteps.insertarCredenciales(Usuario,Contrasena);
        iniciosesionsteps.clicInicioSesion();
    }
    @Entonces("el usuario podrá ver su perfil")
    public void elUsuarioPodráVerSuPerfil() {
        validacionPerfilsteps.ValidacionLoginexitoso();
    }

}
