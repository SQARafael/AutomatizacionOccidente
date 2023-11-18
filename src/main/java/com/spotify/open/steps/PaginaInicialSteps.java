package com.spotify.open.steps;

import com.spotify.accounts.steps.AccountPageSteps;
import com.spotify.open.pageObjectModel.PaginaInicialPageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class PaginaInicialSteps {
    @Page
    PaginaInicialPageObject paginaInicialPage;
    AccountPageSteps accountPageSteps;
    @Step("Abrir navegador")
    public void abrirNavegador(){
        paginaInicialPage.openUrl("https://open.spotify.com/intl-es");

    }
    @Step("Click Iniciar sesion")
    public void clickIniciarsesion(){
        paginaInicialPage.getDriver().findElement(paginaInicialPage.getBtnlogin()).click();

    }



}
