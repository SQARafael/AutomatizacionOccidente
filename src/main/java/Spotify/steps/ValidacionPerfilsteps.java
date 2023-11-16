package Spotify.steps;

import Spotify.pageObjectModel.PaginaInicioPageObject;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class ValidacionPerfilsteps {
    @Page
    PaginaInicioPageObject paginainiciopageobject;

    @Step ("validacion exitosa del inicio de seccion")
    public void ValidacionLoginexitoso(){
        Assert.assertTrue(
              paginainiciopageobject.getDriver().findElement(paginainiciopageobject.getBtnperfil()).isDisplayed()
        );
    }
}
