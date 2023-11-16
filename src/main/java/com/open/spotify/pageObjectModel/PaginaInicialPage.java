package com.open.spotify.pageObjectModel;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicialPage extends PageObject {
    private final By lnkLogin=By.xpath("//button[@data-testid='login-button']");
    public By getLnkLogin() {
        return lnkLogin;
    }
}

