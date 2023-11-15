package Spotify.steps;

import Spotify.pageObjectModel.PaginaInicioPageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class PaginaIniciosteps {

    @Page
    PaginaInicioPageObject paginainiciopageobject;

    @Step("Abrir el navegador")
    public void abrirNavegador(){
        paginainiciopageobject.openUrl("https:spotify.com");
    }
    @Step("Clic btn login")
    public void clicLogin(){
        paginainiciopageobject.getDriver().findElement(paginainiciopageobject.getLnkLogin())
                .click();
    }
}
