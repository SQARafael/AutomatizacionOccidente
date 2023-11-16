package com.open.spotify.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicialPage extends PageObject {


    private final By lnkLogin= By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 bzuYkS encore-inverted-light-set']");

    public By getLnkLogin() {
        return lnkLogin;
    }
}

