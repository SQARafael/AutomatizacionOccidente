package com.open.spotify.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ReproducirCancionPage extends PageObject {

    //private final By bttReproducirCancion= By.xpath("//button[@class='RfidWIoz8FON2WhFoItU' and @aria-label='Reproducir Hallowed Be Thy Name - 2015 Remaster, de Iron Maiden']");

    private final By bttSeleccionLista= By.xpath("//div[text()='Hallowed Be Thy Name - 2015 Remaster']");

    //private final By bttReproducirCancion= By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 fGgTkO encore-bright-accent-set']");


    private final By bttReproducirCancion= By.xpath("//button[@class='Button-sc-qlcn5g-0 hCReiC']");


    public By getBttSeleccionLista() {
        return bttSeleccionLista;
    }

    public By getBttReproducirCancion() {
        return bttReproducirCancion;
    }


}
