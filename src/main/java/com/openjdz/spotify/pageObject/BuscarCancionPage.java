package com.openjdz.spotify.pageObject;

import lombok.Data;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class BuscarCancionPage extends PageObject {

    @FindBy(how = How.XPATH, using="//input[@class='Type__TypeElement-sc-goli3j-0 ieTwfQ QO9loc33XC50mMRUCIvf']")
    public WebElementFacade lnkSearch;
    //private final By lnkSearch=By.xpath("//input[@class='Type__TypeElement-sc-goli3j-0 ieTwfQ QO9loc33XC50mMRUCIvf']");
    @FindBy (how =How.XPATH, using="(//button[@class='RfidWIoz8FON2WhFoItU Qs11Fsr_XqTVFDFWWRkQ'])[1]")
    public WebElementFacade btnPlay;

    @FindBy (how =How.XPATH, using="//button[@aria-label='Pausar']")
    public WebElementFacade btnRepro;



    //private final By btnPlay=By.xpath("//button[@aria-label='Reproducir El Ausente, de Pastor Lopez']");


}
