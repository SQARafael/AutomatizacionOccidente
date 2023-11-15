package com.open.spotify.steps;

import com.demoblaze.pageObject.PaginaInicialPage;
import com.open.spotify.pageObject.PaginaInicialPageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class PaginaInicialSteps {


    @Page
    PaginaInicialPageObject paginaInicialPageObject;
    // PaginaInicialPageObject paginaInicialPageObject = new PaginaInicialPageObject();

    @Step("Abrir navegador")
    public void abrirNavegador(){

        paginaInicialPageObject.openUrl("https://open.spotify.com/");
    }

    @Step("Click boton LogIn")
    public void clickLogin(){

        paginaInicialPageObject.getDriver().findElement(paginaInicialPageObject.getLnkLogin())
                .click();

    }



}
