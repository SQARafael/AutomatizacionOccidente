package com.open.spotify.stepDefinitions;

import com.open.spotify.pageObject.PaginaBienvenidaPage;
import com.open.spotify.steps.InicioSesionSteps;
import com.open.spotify.steps.PaginaInicialSteps;
import com.open.spotify.steps.ValidacionPerfil;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class PlaySpotifyStepdefinitions {

    @Steps
    PaginaInicialSteps paginaInicialSteps;
    @Steps
    InicioSesionSteps inicioSesionSteps;

    @Steps
    ValidacionPerfil validacionPerfil;


    @Dado("que el usuario abre el navegador y de clic al boton login")
    public void queElUsuarioAbreElNavegadorYDeClicAlBotonLogin() {
        paginaInicialSteps.abrirNavegador();
        paginaInicialSteps.clickLogin();
            }
    @Cuando("el usuario ingrese las credenciales correctas usario {string} clave {string}")
    public void enviarCredenciales(String usuario, String clave) {


        inicioSesionSteps.insertarUsuario(usuario);
        inicioSesionSteps.insertarClave(clave);
        inicioSesionSteps.clickInicioSesion();

    }
    @Entonces("el usuario podrá ver su perfil")
    public void elUsuarioPodráVerSuPerfil() {

        validacionPerfil.validacionPerfil();

    }


}
