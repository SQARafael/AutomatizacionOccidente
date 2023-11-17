package com.open.spotify.steps;

import com.open.spotify.pageObject.PaginaUsuarioPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class PaginaUsuarioSteps {

    @Page
    PaginaUsuarioPage paginaUsuarioPage;

    @Step("Click en boton reproduccir")
    public void clickReproductor(){
        paginaUsuarioPage.getDriver().findElement(paginaUsuarioPage.getBttRepoduccion()).click();
    }

   @Step("Buscar Cancion")
    public void buscarCancion(){
        paginaUsuarioPage.getDriver().findElement(paginaUsuarioPage.getTxtCancion()).sendKeys("Iron maiden  Hallowed Be Thy Name");
   }

   @Step("Seleccionar canciones")
   public void seleccionarCancion() {

        paginaUsuarioPage.getDriver().findElement(paginaUsuarioPage.getBttSeleccionarCancion()).click();
   }
}
