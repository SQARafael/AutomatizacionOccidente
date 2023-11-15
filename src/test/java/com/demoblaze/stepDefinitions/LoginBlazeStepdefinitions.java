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
    PaginaInicialSteps paginaInicialSteps;

    @Steps
    InicioSesionSteps inicioSesionSteps;

    @Steps
    ValidacionPerfil validacionPerfil;

    @Dado("que el usuario abre l navegador e ingrese a login")
    public void queElUsuarioAbreLNavegadorEIngreseALogin() {
        paginaInicialSteps.abrirNavegador();
        paginaInicialSteps.clicLogin();

    }
    @Cuando("el usuario ingrese las credenciales")
    public void elUsuarioIngreseLasCredenciales() {
        String mail="carl@mail.com";
        String psw="1234";
        inicioSesionSteps.insertarCredenciales(mail,psw);
        inicioSesionSteps.clicInicioSesion();


    }
    @Entonces("el usuario podrá ver la bienvenida del perfil")
    public void elUsuarioPodráVerLaBienvenidaDelPerfil() {
        validacionPerfil.validacionPerfil();

    }
}
