package com.spotify.open.stepDefinitions;

import com.spotify.accounts.steps.AccountPageSteps;
import com.spotify.open.steps.PaginaInicialSteps;
import com.spotify.open.steps.PrincipalPageSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class loginSpotifySetepdefinitions {
    @Steps
    PaginaInicialSteps paginaInicialSteps;
    PrincipalPageSteps principalPageSteps;
    AccountPageSteps accountPageSteps;
    @Dado("que el usuario abre al navegador inicial e ingrese a login")
    public void que_el_usuario_abre_al_navegador_inicial_e_ingrese_a_loginn() {
        paginaInicialSteps.abrirNavegador();
        paginaInicialSteps.clickIniciarsesion();

    }
    @Cuando("Ingrese al login se abrira el navegador de inicio de sesion")
    public void ingrese_al_login_se_abrira_el_navegador_de_inicio_de_sesion() {
        // Write code here that turns the phrase above into concrete actions
        accountPageSteps.abrirPaginaInicioSesion();
    }
    @Cuando("Ingrese el usuario")
    public void Ingrese_el_usuario() {
        accountPageSteps.insertarUserName();
        
    }
    @Cuando("Ingrese la contraseña")
    public void Ingrese_la_contraseña() {
        accountPageSteps.insertarPass();
        
    }

    @Cuando("de click en Iniciar Sesion")
    public void de_click_en_iniciar_sesion() {
        accountPageSteps.clickIniciarsesion();
        
    }
    @Entonces("podra ver la bienvenida del perfil")
    public void podra_ver_la_bienvenida_del_perfil(){
        principalPageSteps.abrirPaginaPrincipal();

    }



}
