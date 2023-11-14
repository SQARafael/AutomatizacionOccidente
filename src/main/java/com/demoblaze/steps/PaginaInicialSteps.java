package com.demoblaze.steps;

import com.demoblaze.pageObject.PaginaInicialPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class PaginaInicialSteps {
    // PaginaInicialPage paginaInicialPage= new PaginaInicialPage(); --Instancia de la clase de forma tradicional

    //Hacemos una instancia de la clase PaginaInicialPage por medio de @Page
    @Page
    PaginaInicialPage paginaInicialPage;

    @Step("Abrir el navegador") //Este método Step nunca retorna nada
    public void abrirNavegador(){
        paginaInicialPage.openUrl("https://demoblaze.com");
    }
    @Step("Clic boton Login")
    public void clicLogin(){
        paginaInicialPage.getDriver().findElement(paginaInicialPage.getLnkLogin()).click();
    }
}
