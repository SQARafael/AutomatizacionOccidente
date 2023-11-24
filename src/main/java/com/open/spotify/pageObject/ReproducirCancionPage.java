package com.open.spotify.pageObject;

import lombok.Data;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@Data
public class ReproducirCancionPage extends PageObject {
    private final By btnBuscar= By.xpath("//a[@aria-label='Buscar']");
    private final By txtNombreCan= By.xpath("//input[@data-testid='search-input']");
    private final By btnPlayCan= By.xpath("//button[@aria-label='Reproducir Say Yes To Heaven de Lana Del Rey']/*[name()='svg' and @data-encore-id='icon']");
}
