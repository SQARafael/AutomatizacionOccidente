package com.spotyfy.steps;

import com.spotyfy.pegeObject.PaginaInicialPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class PaginaInicialSteps {
   /* PaginaInicialSteps paginaInicialSteps= new PaginaInicialSteps();*/
    @Page
   PaginaInicialPage paginaInicialPage;
    @Step("Abrir rl navegador")
    public void abrirNavegador(){
        paginaInicialPage.openUrl("https://www.spotify.com/");
    }
    @Step("Clic btn login")
    public void clicLogin(){
        paginaInicialPage.getDriver().findElement(paginaInicialPage.getLnkLogin())
                .click();
    }

}
