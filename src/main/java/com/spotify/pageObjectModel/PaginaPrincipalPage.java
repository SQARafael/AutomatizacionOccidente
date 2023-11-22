package com.spotify.pageObjectModel;

import lombok.Data;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaPrincipalPage extends PageObject {
    private final By lnkPrincipal=By.xpath("//button[@aria-label='Alejandrop']");

    public By getLnkPrincipal() {
        return lnkPrincipal;
    }
}
