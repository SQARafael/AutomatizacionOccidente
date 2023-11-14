package com.demoblaze.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicialPage extends PageObject {
    //private final By lnkLogin= By.id("login2"); --Para mapear un atributo con el id
    //Aquí se mapea conel atributo con el xpath
    private final By lnkLogin= By.xpath("//a[@id='login2']");

    public By getLnkLogin() {
        return lnkLogin;
    }
}

