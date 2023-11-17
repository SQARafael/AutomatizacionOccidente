package com.spotify.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ReproducirCancion extends PageObject {



    private By btnBuscar = By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/nav/div[1]/ul/li[2]/a/span");
    public By getBtnBuscar() {
        return btnBuscar;
    }

    private By txtCancion = By.xpath("//*[@id=\"main\"]/div/div[2]/div[3]/header/div[3]/div/div/form/input");
    public By getTxtCancion() {
        return txtCancion;
    }




    private By btnClickReproducir = By.xpath("//*[@id=\"searchPage\"]/div/div/section[2]/div[2]/div/div/div/div[2]/div[1]/div/div[1]/div[1]/img");
    public By getBtnClickReproducir() {
        return btnClickReproducir;
    }
}
