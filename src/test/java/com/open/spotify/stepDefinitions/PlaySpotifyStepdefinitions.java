package com.open.spotify.stepDefinitions;

import com.open.spotify.steps.InicioSesionSteps;
import com.open.spotify.steps.PaginaInicialSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class PlaySpotifyStepdefinitions {

    @Steps
    PaginaInicialSteps paginaInicialSteps;
    @Steps
    InicioSesionSteps inicioSesionSteps;
    @Dado("que el usuario abre el navegador y de clic al boton login")
    public void queElUsuarioAbreElNavegadorYDeClicAlBotonLogin() {
        paginaInicialSteps.abrirNavegador();
        paginaInicialSteps.clickLogin();
            }
    @Cuando("el usuario ingrese las credenciales correctas")
    public void elUsuarioIngreseLasCredencialesCorrectas() {

        inicioSesionSteps.insertarUsuario();
        inicioSesionSteps.insertarClave();
        inicioSesionSteps.clickInicioSesion();

    }
    @Entonces("el usuario podrá ver su perfil")
    public void elUsuarioPodráVerSuPerfil() {

    }


}
