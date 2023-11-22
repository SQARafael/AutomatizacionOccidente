package com.spotify.steps;

import com.spotify.pageObjectModel.PaginaInicialPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class PaginaInicialsteps {
    @Page
    PaginaInicialPage paginaInicialPage;
    @Step("Abrir el navegador")
//    metodos step nunca retornan nada si necestitan que retorne no es step

    public void abrirNavegador(){

        paginaInicialPage.openUrl("https://open.spotify.com/intl-es");

    }
    @Step("clic Login")
    public void clicLogion() {
        paginaInicialPage.getDriver().findElement(paginaInicialPage.getLnkLogin()).click();
    }
}
