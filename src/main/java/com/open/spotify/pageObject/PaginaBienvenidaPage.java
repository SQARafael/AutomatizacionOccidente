package com.open.spotify.pageObject;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaBienvenidaPage extends PageObject {

    private final By lnkPerfil = By.xpath(" //button[@class='Button-sc-1dqy6lx-0 grWQsc encore-over-media-set SFgYidQmrqrFEVh65Zrg']");


    public By getLnkPerfil() {
        return lnkPerfil;
    }
}
