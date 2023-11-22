package com.spotify.stepDefinitions;

import com.spotify.steps.InicioSesionSteps;
import com.spotify.steps.PaginaInicialsteps;
import com.spotify.steps.ValidacionPerfil;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class LoginSpotifyStepdefinitions {
    @Steps
    PaginaInicialsteps paginaInicialsteps;
    @Steps
    InicioSesionSteps inicioSesionSteps;
    @Steps
    ValidacionPerfil validacionPerfil;
    @Dado("que el usuario abre el navegador y de clic al boton login")
    public void queElUsuarioAbreElNavegadorYDeClicAlBotonLogin() {

        paginaInicialsteps.abrirNavegador();
        paginaInicialsteps.clicLogion();
    }
   @Cuando("el usuario ingrese las credenciales correctas Usuario {string} y Clace {string}")
public void el_usuario_ingrese_las_credenciales_correctas_usuario_y_clace(String usuario, String clave) {
        inicioSesionSteps.insertarCredenciales();
        inicioSesionSteps.clicIniciarSesion();

    }
    @Entonces("el usuario podrá ver su perfil")
    public void elUsuarioPodráVerSuPerfil() {
        validacionPerfil.validacionperfil();

    }

}
