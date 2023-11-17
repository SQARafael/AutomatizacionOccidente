package com.open.spotify.stepDefinition;
import com.open.spotify.steps.*;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class LoginSpotifyStepdefinitions {

    @Steps
    PaginaInicialSteps paginaInicialSteps;

    @Steps
    InicioSesionSteps inicioSesionSteps;

    @Steps
    PaginaUsuarioSteps paginaUsuarioSteps;

    @Steps
    ValidacionPerfil validacionPerfil;

    @Steps
    ReproducirCancionSteps reproducirCancionSteps;

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
    public void elUsuarioPodráVerSuPerfil() throws InterruptedException {
        validacionPerfil.validacionPerfil();
        paginaUsuarioSteps.clickReproductor();
        paginaUsuarioSteps.buscarCancion();
        paginaUsuarioSteps.seleccionarCancion();
        reproducirCancionSteps.seleccionarLista();
        reproducirCancionSteps.reproducirCancion();

    }
}
