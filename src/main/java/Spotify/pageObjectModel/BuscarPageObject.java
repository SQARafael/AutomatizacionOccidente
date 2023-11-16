package Spotify.pageObjectModel;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class BuscarPageObject extends PageObject {
    private final By txtbusqueda= By.xpath("//input[@class='Type__TypeElement-sc-goli3j-0 ieTwfQ QO9loc33XC50mMRUCIvf' and @data-testid='search-input']");

    public By getTxtbusqueda() {
        return txtbusqueda;
    }
}
