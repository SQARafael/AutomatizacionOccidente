package com.open.spotify.pageObject;

import lombok.Data;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
@Data
public class PaginaInicialSpotifyPage extends PageObject {
    private final By btnIniciarSesion= By.xpath("//button[@data-testid='login-button']");
    private final By lnkProfile= By.xpath("//button[@data-testid='user-widget-link']");

}
