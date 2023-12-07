package com.openjdz.spotify.pageObject;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;



public class InicioSesionPage extends PageObject {
    @FindBy (how =How.XPATH, using="//input[@id='login-username']")
    public WebElementFacade txtUsuario;

    @FindBy (how =How.XPATH, using="//input[@id='login-password']")
    public WebElementFacade txtClave;

    @FindBy (how =How.XPATH, using="//button[@id='login-button']")
    public WebElementFacade btnInicioSesion;


    /*private final By txtUsuario=By.xpath("//input[@id='login-username']");
    private final By =By.xpath("//input[@id='login-password']");
    private final By btnInicioSesion=By.xpath("//button[@id='login-button']");
*/

}
