package com.demoblaze.steps;
/*
 * @(#) PaginaInicialSteps.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */
import com.demoblaze.pageObject.PaginaInicialPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class PaginaInicialSteps {
    @Page
    PaginaInicialPage paginaInicialPage;
    /*PaginaInicialPage paginaInicialPage= new PaginaInicialPage();*/

    @Step("Abrir el navegador")
    public void abrirNavegador(){
        paginaInicialPage.openUrl("https://www.demoblaze.com/");
    }

    @Step("Clic btn login")
    public void clicLogin(){
        paginaInicialPage.getDriver().findElement(paginaInicialPage.getLnkLogin())
                .click();
    }

}
