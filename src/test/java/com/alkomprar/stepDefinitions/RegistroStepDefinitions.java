package com.alkomprar.stepDefinitions;

import com.alkomprar.steps.CorreoSteps;
import com.alkomprar.steps.HomeSteps;
import com.alkomprar.steps.NewUserSteps;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class RegistroStepDefinitions {

    @Steps
    HomeSteps homeSteps;
    @Steps
    CorreoSteps correo;
    @Steps
    NewUserSteps crearUser;


    @Dado("que el usuario abre la pagina de alkomprar")
    public void queElUsuarioAbreLaPaginaDeAlkomprar() {
        homeSteps.abrirNavegador();

    }
    @Dado("pulsa el boton de mi cuenta")
    public void pulsaElBotonDeMiCuenta() {
        homeSteps.darClicCuenta();

    }
    @Cuando("el usuario ingresa la informacion de registro")
    public void elUsuarioIngresaLaInformacionDeRegistro() {
        correo.ingresarCorreo();
        correo.darClicContinuar();

    }
    @Entonces("vera el panel de perfil de usuario")
    public void veraElPanelDePerfilDeUsuario() {
        crearUser.ingresarNombre();
        crearUser.ingresarApellido();
        crearUser.ingresarTelefono();
        crearUser.darClicAutorizacion();
        crearUser.darClicContinuar();

    }

}
