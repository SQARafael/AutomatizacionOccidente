package com.spotify.steps;
import com.spotify.pages.IniciarSesion;
import com.spotify.pages.ReproducirCancion;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
public class ReproducirSteps {
    @Page
    ReproducirCancion reproducirCancion;

    @Step("Dar clic en Boton Buscar Cancion")
    public void darClickBuscar(){
        reproducirCancion.getDriver().findElement(reproducirCancion.getBtnBuscar()).click();
    }
    @Step("Ingresar Cancion")
    public void ingresarCancion(){
        reproducirCancion.getDriver().findElement(reproducirCancion.getTxtCancion()).sendKeys("Imagine Dragons Thunder");

    }
    @Step("Dar clic reproducir")
    public void darClickReproducir(){
        reproducirCancion.getDriver().findElement(reproducirCancion.getBtnClickReproducir()).click();
    }
}
