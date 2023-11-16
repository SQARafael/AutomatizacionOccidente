package com.spotyfy.stepDefinitions;

import com.spotyfy.steps.InicioSesionSteps;
import com.spotyfy.steps.PaginaInicialSteps;
import com.spotyfy.steps.ValidacionPerfil;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class LoginSpotyfyStepdefinitions {

    @Steps
    PaginaInicialSteps paginaInicialSteps;
    @Steps
    InicioSesionSteps inicioSesionSteps;
    @Steps
    ValidacionPerfil validacionPerfil;

    @Dado("que el usuario abre el navegador y de clic al boton login")
    public void queElUsuarioAbreElNavegadorYDeClicAlBotonLogin() {
        paginaInicialSteps.abrirNavegador();
        paginaInicialSteps.clicLogin();

    }
        @Cuando("el usuario ingrese las credenciales usuario {string} y clave {string}")
        public void enviarCredenciales(String usuario, String clave) {
        inicioSesionSteps.insertarCredenciales(usuario, clave);
        inicioSesionSteps.clicInicioSesion();

    }
    @Entonces("el usuario podrá ver su perfil")
    public void elUsuarioPodráVerSuPerfil() {
        validacionPerfil.validacionPerfil();

    }
}
