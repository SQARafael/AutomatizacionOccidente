package com.demoblaze.steps;

import com.demoblaze.pageObjectModel.PaginaInicialPageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.demoblaze.utils.Esperas.espera1;
import static org.openqa.selenium.support.ui.ExpectedCondition.*;

public class ValidacionPerfil {
    PaginaInicialPageObject paginaInicialPageObject;

    @Step("Validacion dl enlace del perfil")
    public  void validacionperfil()  {
//        Espera no es recomendable  Trewad.sleep
//        Thread.sleep(5000);
//        Espera indicada

        espera1(paginaInicialPageObject.getDriver(),paginaInicialPageObject.getLnkProfile());

//        en el asserTru debes de devolver un boleano
        Assert.assertTrue(paginaInicialPageObject.getDriver().findElement(paginaInicialPageObject.getLnkProfile()
        ).isDisplayed());
    }

}
