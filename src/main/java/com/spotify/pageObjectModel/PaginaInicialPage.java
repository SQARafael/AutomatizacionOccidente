package com.spotify.pageObjectModel;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicialPage extends PageObject {

    private final By lnkLogin=By.xpath("(//button[@class='Button-sc-qlcn5g-0 fyugtm'])[2]");

    public By getLnkLogin() {
        return lnkLogin;
    }
}
