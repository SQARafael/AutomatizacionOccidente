package com.openjdz.spotify.steps;

import com.openjdz.spotify.pageObject.BuscarCancionPage;
import com.openjdz.spotify.utils.Data;
import net.serenitybdd.screenplay.questions.TheCoordinates;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

import static com.openjdz.spotify.utils.Esperas.*;

public class BuscarCancionSteps {
    @Page
    BuscarCancionPage buscarCancionPage;

    @Step("Buscar Cancion y reproducir")
    public void BuscarCancion(){
        //espera1(buscarCancionPage.getDriver(),buscarCancionPage.getLnkSearch());

        //buscarCancionPage.getDriver().findElement(buscarCancionPage.getLnkSearch()).click();
        buscarCancionPage.lnkSearch.sendKeys(Data.extractTo().get(0).get("Cancion"));
        //buscarCancionPage.getDriver().findElement(buscarCancionPage.getLnkSearch()).sendKeys(Data.extractTo().get(0).get("Cancion"));

    }
    @Step("Click reproducir cancion")
    public void btnClickplay() throws InterruptedException {
        espera1(buscarCancionPage.getDriver(),buscarCancionPage.btnPlay);
        buscarCancionPage.btnPlay.click();
        //buscarCancionPage.getDriver().findElement(buscarCancionPage.getBtnPlay()).click();
        espera1(buscarCancionPage.getDriver(),buscarCancionPage.btnRepro);
        Thread.sleep(10000);


    }

}
