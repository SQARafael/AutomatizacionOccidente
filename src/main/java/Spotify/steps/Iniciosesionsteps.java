package Spotify.steps;

import Spotify.pageObjectModel.IniciosesionPageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class Iniciosesionsteps {
    @Page
    IniciosesionPageObject iniciosesion;

    @Step("Ingresar datos usuario")
    public void insertarCredenciales(String correo,String Contrasena){

        iniciosesion.getDriver().findElement(iniciosesion.getTxtUsuario())
                .sendKeys(correo);

        iniciosesion.getDriver().findElement(iniciosesion.getTxtClave())
                .sendKeys(Contrasena);
    }

    @Step("Clic btn inicio sesion")
    public void clicInicioSesion(){
        iniciosesion.getDriver().findElement(iniciosesion.getBtnInicioSesion())
                .click();
    }
}
