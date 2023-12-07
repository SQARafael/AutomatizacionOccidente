package com.openjdz.spotify.stepDefinitions;

import com.openjdz.spotify.steps.BuscarCancionSteps;
import com.openjdz.spotify.steps.InicioSesionSteps;
import com.openjdz.spotify.steps.PaginaInicialSteps;
import com.openjdz.spotify.steps.ValidacionIngresoSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class LoginSpotifyStepdefinitions {
    @Steps
    PaginaInicialSteps paginaInicialSteps;
    @Steps
    InicioSesionSteps inicioSesionSteps;

    @Steps
    ValidacionIngresoSteps validacionIngresoSteps;
    @Steps
    BuscarCancionSteps buscarCancionSteps;


    @Dado("que el usuario abre el navegador y de clic al boton iniciar sesión")
    public void queElUsuarioAbreElNavegadorYDeClicAlBotonIniciarSesión() {
        paginaInicialSteps.abrirNavegador();
        paginaInicialSteps.clickLogin();

    }
    @Cuando("el usuario ingrese las credenciales correctas usuario {string} y contraseña {string}")
    public void elUsuarioIngreseLasCredencialesCorrectasUsuarioYContraseña(String usuario, String clave) {
        inicioSesionSteps.insertarUsuario();
        inicioSesionSteps.insertarClave();
        inicioSesionSteps.btnClickInicioSesion();
        validacionIngresoSteps.ValidacionPerfil();
        buscarCancionSteps.BuscarCancion();


    }
    @Entonces("el usuario podrá ver su perfil")
    public void elUsuarioPodráVerSuPerfil() throws InterruptedException {
        buscarCancionSteps.btnClickplay();


    }
}
