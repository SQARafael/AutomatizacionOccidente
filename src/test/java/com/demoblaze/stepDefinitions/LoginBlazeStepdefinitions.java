package com.demoblaze.stepDefinitions;
/*
 * @(#) LoginBlazeStepdefinitions.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.demoblaze.steps.InicioSesionSteps;
import com.demoblaze.steps.PaginaInicialSteps;
import com.demoblaze.steps.ValidacionPerfil;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class LoginBlazeStepdefinitions {

    @Steps
    PaginaInicialSteps paginaInicialSteps;//se realiza una instancia para poder llamar los metodos

    @Steps
    InicioSesionSteps inicioSesionSteps;

    @Steps
    ValidacionPerfil validacionPerfil;

    @Dado("que el usuario abre l navegador e ingrese a login")
    public void queElUsuarioAbreLNavegadorEIngreseALogin() {
        paginaInicialSteps.abrirNavegador();//llamamos el metodo para abrir el navegdor
        paginaInicialSteps.clickLogin();
    }
    @Cuando("el usuario ingrese las credenciales usuario {string} y clave {string}")
    public void enviarCredenciales(String usuario, String clave) {

        //String mail="carl@mail.com";
        //String pssw="1234";
        //inicioSesionSteps.insertarUsuario();
        //inicioSesionSteps.insertarClave();
        inicioSesionSteps.insertarCredenciales();
        inicioSesionSteps.clickInicioSesion();
    }
    @Entonces("el usuario podrá ver la bienvenida del perfil")
    public void elUsuarioPodráVerLaBienvenidaDelPerfil() {
        validacionPerfil.validacionPerfil();
    }


}
