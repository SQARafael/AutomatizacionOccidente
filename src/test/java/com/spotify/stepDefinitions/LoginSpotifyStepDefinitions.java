package com.spotify.stepDefinitions;
import com.spotify.steps.ReproducirSteps;
import com.spotify.steps.sesionSteps;

import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Y;
import io.cucumber.java.es.Entonces;
public class LoginSpotifyStepDefinitions {
    @Steps
    sesionSteps sesionSteps;
    @Steps
    ReproducirSteps reproducirSteps;
    @Dado("que el usuario abre l navegador")
    public void queElUsuarioAbreLNavegador() {
        sesionSteps.abrirNavegador();
    }
    @Y("el usuario ingrese las credenciales para iniciar sesion")
    public void elUsuarioIngreseLasCredenciales() {
       sesionSteps.ingresarUsuario();
       sesionSteps.ingresarPassword();
       sesionSteps.darClickIniciar();
       sesionSteps.darClickWebPlayer();
    }
    @Entonces("el usuario podrá reproducir una cancion")
    public void elUsuarioPodráReprocir() {


        try {

            reproducirSteps.darClickBuscar();
            reproducirSteps.ingresarCancion();
            reproducirSteps.darClickReproducir();
            // Espera durante 10 segundos antes de cerrar la página
            Thread.sleep(10000); // 5000 milisegundos = 5 segundos
        } catch (InterruptedException e) {
            // Manejo de excepciones si hay interrupción durante el sleep
            e.printStackTrace();
        }

    }

}
