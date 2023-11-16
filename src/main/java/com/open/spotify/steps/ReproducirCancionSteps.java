package com.open.spotify.steps;

import com.open.spotify.pageObject.ReproducirCancionPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class ReproducirCancionSteps {

    @Page
    ReproducirCancionPage reproducirCancionPage;
    @Step("Clic btn buscar cancion")
    public void clicBuscar(){
        reproducirCancionPage.getDriver().findElement(reproducirCancionPage.getBtnBuscar())
                .click();
    }
    @Step("Escribir nombre canción")
    public void escribirCancion(){
        reproducirCancionPage.getDriver().findElement(reproducirCancionPage.getTxtNombreCan())
                .sendKeys("say yes to haven lana del rey");
    }
    @Step("Reproducir cancion")
    public void reprodCancion(){
        reproducirCancionPage.getDriver().findElement(reproducirCancionPage.getBtnPlayCan())
                .click();
    }
}
