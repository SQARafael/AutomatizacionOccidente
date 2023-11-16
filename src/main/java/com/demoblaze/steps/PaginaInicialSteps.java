package com.demoblaze.steps;

import com.demoblaze.pageObject.PaginaInicialPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class PaginaInicialSteps {

    //PaginaInicialPage paginaInicialPage = new PaginaInicialPage();
    @Page
    PaginaInicialPage paginaInicialPage;

    @Step("Abrir el navegador")
    public void abrirNavegador(){//donde vamos a ingresar la url a ingresar
        paginaInicialPage.openUrl("https://demoblaze.com/");
    }

    @Step("Click en boton Login")
    public void clickLogin(){// se toma control de driver y busco el elemento a dar click y luego doy click

        paginaInicialPage.getDriver().findElement(paginaInicialPage.getLnkLogin()).click();
    }


}
