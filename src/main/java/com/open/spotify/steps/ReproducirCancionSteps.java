package com.open.spotify.steps;

import com.open.spotify.pageObject.ReproducirCancionPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class ReproducirCancionSteps {



    @Page
    ReproducirCancionPage reproducirCancionPage;

    @Step("Seleccionar Cancion")
    public void seleccionarLista(){
        reproducirCancionPage.getDriver().findElement(reproducirCancionPage.getBttSeleccionLista()).click();

    }

    @Step("Reproduccir cancion")
    public void reproducirCancion() throws InterruptedException {


        reproducirCancionPage.getDriver().findElement(reproducirCancionPage.getBttReproducirCancion()).click();

        Thread.sleep(20000);
    }

}
