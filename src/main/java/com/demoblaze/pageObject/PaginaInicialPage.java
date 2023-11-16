package com.demoblaze.pageObject;

import lombok.Data;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@Data
public class PaginaInicialPage extends PageObject {

    //private final By lnkLogin= By.id("login2");
    private final By lnkLogin= By.xpath("//a[@id='login2']");//accion sobre el boton eleccion

    private final By lnkProfile= By.xpath("//a[@id='nameofuser']");

    public By getLnkLogin() {// siempre se crea el get
        return lnkLogin;
    }

    public By getLnkProfile() {
        return lnkProfile;
    }
}
