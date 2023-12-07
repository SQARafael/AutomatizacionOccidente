package com.openjdz.spotify.pageObject;

import lombok.Data;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
@Data
public class PaginaInicialPage extends PageObject {

    @FindBy(how = How.XPATH, using="//button[@data-testid='login-button']")
    public WebElementFacade lnkLogin;
    //private final By lnkLogin = By.xpath("//button[@data-testid='login-button']");


}