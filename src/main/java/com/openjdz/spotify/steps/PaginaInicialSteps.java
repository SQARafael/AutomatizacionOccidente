package com.openjdz.spotify.steps;


import com.openjdz.spotify.pageObject.PaginaInicialPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class PaginaInicialSteps {
    @Page
    PaginaInicialPage paginaInicialPage;
    /*Intanciamos la clase de esta manera, es lo mismo que= PaginaInicialSteps paginaInicialSteps= new PaginaInicialSteps();*/

    @Step("Abrir Navegador")
    public void abrirNavegador(){
        paginaInicialPage.openUrl("https://open.spotify.com/");
    }
    @Step("Hacer Click en inicio de sesion")
    public void clickLogin(){
        paginaInicialPage.lnkLogin.click();

        //getDriver() para que me controle el navegador que aca de abrir
        //finElement(By by) --Busqueme el elemento de tipo By y colocamos el elemento get
    }



}
