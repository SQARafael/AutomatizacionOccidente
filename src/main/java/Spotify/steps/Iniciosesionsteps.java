package Spotify.steps;

import Spotify.pageObjectModel.IniciosesionPageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class Iniciosesionsteps {
    @Page
    IniciosesionPageObject iniciosesion;

    @Step("Ingresar datos usuario")
    public void insertarCredenciales(){

        iniciosesion.getDriver().findElement(iniciosesion.getTxtUsuario())
                .sendKeys("diaztorresjavierdario1@gmail.com");

        iniciosesion.getDriver().findElement(iniciosesion.getTxtClave())
                .sendKeys("Automatizacion2023");
    }

    @Step("Clic btn inicio sesion")
    public void clicInicioSesion(){
        iniciosesion.getDriver().findElement(iniciosesion.getBtnInicioSesion())
                .click();
    }
}
