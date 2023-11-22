package com.demoblaze.steps;

import com.spotify.pageObjectModel.PaginaInicialPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class PaginaInicialsteps {

//    instancia @page
    @Page
PaginaInicialPage paginaInicialPage;
//    @step le digo que es un paso
    @Step("Abrir el navegador")
//    metodos step nunca retornan nada si necestitan que retorne no es step


    public void abrirNavegador(){

        paginaInicialPage.openUrl("https://www.demoblaze.com/");

    }
    @Step("clic Login")
    public void clicLogion(){
        paginaInicialPage.getDriver().findElement(paginaInicialPage.getLnkLogin()).click();

    }



}
