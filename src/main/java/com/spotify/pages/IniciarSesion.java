package com.spotify.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
public class IniciarSesion extends PageObject{



    private By txtCorreo = By.id("login-username");
    public By getTxtCorreo() {
        return txtCorreo;
    }


    private By txtPassword = By.id("login-password");
    public By getTxtPassword() {
        return txtPassword;
    }

    public By getBtnInicioSesion() {
        return btnInicioSesion;
    }

    private By btnInicioSesion = By.id("login-button");

    public By getBtnWebPlayer() {
        return btnWebPlayer;
    }

    private By btnWebPlayer = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/button[2]/span[2]");



}
