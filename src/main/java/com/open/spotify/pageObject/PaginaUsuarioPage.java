package com.open.spotify.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaUsuarioPage extends PageObject {

    //a[@class='link-subtle UYeKN11KAw61rZoyjcgZ']/span[@class='Type__TypeElement-sc-goli3j-0 bkjCej']
    //private final By bttRepoduccion=By.xpath("//button[@aria-label='Reproducir This Is Megadeth']/span[@class='ButtonInner-sc-14ud5tc-0 bbkSuf encore-bright-accent-set']");

    private final By bttRepoduccion=By.xpath("//a[@class='link-subtle UYeKN11KAw61rZoyjcgZ']/span[@class='Type__TypeElement-sc-goli3j-0 bkjCej']");

    private final By txtCancion= By.xpath("//input[@class='Type__TypeElement-sc-goli3j-0 ieTwfQ QO9loc33XC50mMRUCIvf']");

    //private final By bttReproduccion2=By.xpath("//button[@aria-label='Reproducir Hallowed Be Thy Name - 2015 Remaster, de Iron Maiden']");

    public By getBttRepoduccion() {
        return bttRepoduccion;
    }

    public By getTxtCancion() {
        return txtCancion;
    }

    /*public By getBttReproduccion2() {
        return bttReproduccion2;
    }

     */
}
