package com.demoblaze.stepDefinitions;
/*
 * @(#) LoginBlazeStepdefinitions.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.demoblaze.steps.InicioSesionSteps;
import com.demoblaze.steps.PaginaInicialsteps;
import com.demoblaze.steps.ValidacionPerfil;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class LoginBlazeStepdefinitions {
    @Steps
    PaginaInicialsteps paginaInicialsteps; //automatizacion reconozca que es un paso a paso
    @Steps
    InicioSesionSteps inicioSesionSteps;
    @Steps
    ValidacionPerfil validacionPerfil;
    @Dado("que el usuario abre l navegador e ingrese a login")
    public void queElUsuarioAbreLNavegadorEIngreseALogin() {
        paginaInicialsteps.abrirNavegador();
        paginaInicialsteps.clicLogion();
    }
    @Cuando("el usuario ingrese las credenciales usuario {string} y clave {string}")
public void enviarCredenciales(String usuario, String clave) {
        //String mail="alejandrop758@gmail.com"; se borran por que ya no se usa de esta manera
        //String psw="Alejandrop758";
        inicioSesionSteps.insertarCredenciales(usuario,clave);
        inicioSesionSteps.clicIniciarSesion();


    }
    @Entonces("el usuario podrá ver la bienvenida del perfil")
    public void elUsuarioPodráVerLaBienvenidaDelPerfil() {
        validacionPerfil.validacionperfil();

    }
}
