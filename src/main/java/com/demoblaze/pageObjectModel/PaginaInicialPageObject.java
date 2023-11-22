package com.demoblaze.pageObjectModel;

import lombok.Data;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
//@Getter forma adicional // TAMBIEN SI QUIEREN REVISAR QUE HAY EN PageObject CONTROL + CLICK

public class PaginaInicialPageObject extends PageObject {

    //se  puede utilziar varios
//    Solo getter y no constructor

    private final By lnkLogin=By.xpath("//a[@id='login2']");
    private final By lnkProfile=By.xpath("//a[@id='nameofuser']");

    public By getLnkLogin() {
        return lnkLogin;
    }

    public By getLnkProfile() {
        return lnkProfile;
    }
}
