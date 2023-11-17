package com.open.spotify.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicialPage extends PageObject {

    private final By lnkLogin= By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 bzuYkS encore-inverted-light-set']");

    private final By lnkProfile= By.xpath("//button[@class='Button-sc-1dqy6lx-0 grWQsc encore-over-media-set SFgYidQmrqrFEVh65Zrg']");

    public By getLnkLogin() {
        return lnkLogin;
    }

    public By getLnkProfile() {
        return lnkProfile;
    }
}

