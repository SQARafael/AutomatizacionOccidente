package com.spotify.accounts.pageObjectModel;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class AccountPageObject extends PageObject {
    private final By txtUsername=By.xpath("//input[@data-testid='login-username']");
    private final By txtPass=By.xpath("//input[@id='login-password']");
    private final By btnInicioSesion=By.xpath("(//button[starts-with(@id,@data-testid)])[1]");


    public By getTxtUsername() {
        return txtUsername;
    }

    public By getTxtPass() {
        return txtPass;
    }

    public By getBtnInicioSesion() {
        return btnInicioSesion;
    }
}
