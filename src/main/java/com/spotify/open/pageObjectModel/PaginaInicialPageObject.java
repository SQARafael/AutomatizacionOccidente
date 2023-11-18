package com.spotify.open.pageObjectModel;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicialPageObject extends PageObject {
    private final By btnlogin=By.xpath("//button[@data-testid='login-button']");

    public By getBtnlogin() {
        return btnlogin;
    }
}
