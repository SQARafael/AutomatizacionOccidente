package com.open.spotify.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaUsuarioPage extends PageObject {

    private final By bttRepoduccion=By.xpath("//a[@class='link-subtle UYeKN11KAw61rZoyjcgZ']/span[@class='Type__TypeElement-sc-goli3j-0 bkjCej']");

    private final By txtCancion= By.xpath("//input[@class='Type__TypeElement-sc-goli3j-0 ieTwfQ QO9loc33XC50mMRUCIvf']");

    private final By bttSeleccionarCancion= By.xpath("//button[@class='Chip__ChipComponent-sc-ry3uox-0 kkaqVM']/span[text()='Canciones']");

    public By getBttRepoduccion() {
        return bttRepoduccion;
    }

    public By getTxtCancion() {
        return txtCancion;
    }

    public By getBttSeleccionarCancion() {
        return bttSeleccionarCancion;
    }

}
