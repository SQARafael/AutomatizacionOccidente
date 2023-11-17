package com.open.spotify.steps;

import com.open.spotify.pageObject.PaginaInicialPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class PaginaInicialSteps    {


    @Page
    PaginaInicialPage paginaInicialPage;

    @Step("Abrir el navegador")
    public void abrirNavegador(){
        paginaInicialPage.
                openUrl("https://open.spotify.com/intl-es");
    }

    @Step("Click en boton Login")
    public void clickLogin(){
        paginaInicialPage.getDriver().
                findElement(paginaInicialPage.getLnkLogin()).click();
    }

}
