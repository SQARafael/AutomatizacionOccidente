package com.openjdz.spotify.pageObject;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;



//@Data//genera el constructor por debajo, no es necesario colocarlo
public class ValidacionIngresoPage extends PageObject {

    @FindBy(how = How.XPATH, using="//*[@href='/intl-es']")
    public WebElementFacade lnkInicio;

    @FindBy(how = How.XPATH, using="//*[@href='/search']")
    public WebElementFacade lnkBuscar;
//    private final By lnkInicio=By.xpath("//*[@href='/intl-es']");//*[@href='/search']");




    //private final By lnkBuscar=By.xpath("//*[@href='/search']");


}
