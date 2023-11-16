package com.open.spotify.stepDefinition;
import com.open.spotify.steps.InicioSesionSteps;
import com.open.spotify.steps.PaginaInicialSteps;
import com.open.spotify.steps.PaginaUsuarioSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class LoginSpotifyStepdefinitions {

    @Steps
    PaginaInicialSteps paginaInicialSteps;

    @Steps
    InicioSesionSteps inicioSesionSteps;

    @Steps
    PaginaUsuarioSteps paginaUsuarioSteps;


   @Dado("que el usuario abre el navegador y de clic al boton login")
    public void queElUsuarioAbreElNavegadorYDeClicAlBotonLogin() {
        paginaInicialSteps.abrirNavegador();
        paginaInicialSteps.clickLogin();
    }
    @Cuando("el usuario ingrese las credenciales usuario {string} y clave <{string}>")
    public void ingresoCredenciales(String string, String string2) {
        inicioSesionSteps.insertarUsuario();
        inicioSesionSteps.insertarClave();
        inicioSesionSteps.clickInicioSpotify();
    }
    @Entonces("el usuario podrá ver su perfil")
    public void elUsuarioPodráVerSuPerfil() {
        paginaUsuarioSteps.clickReproductor();
        paginaUsuarioSteps.buscarCancion();
        //paginaUsuarioSteps.reproduccirCancion();

    }
}
