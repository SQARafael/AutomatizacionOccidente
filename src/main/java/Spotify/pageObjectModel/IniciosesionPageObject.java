package Spotify.pageObjectModel;

import org.apache.xmlbeans.SchemaTypeLoader;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;
public class IniciosesionPageObject extends PageObject {
    private final By txtUsuario= By.id("login-username");


    private final By txtClave= By.id("login-password");


    private final By btnInicioSesion= By.id("login-button");

    public By getTxtUsuario() {
        return txtUsuario;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getBtnInicioSesion() {
        return btnInicioSesion;
    }

}
