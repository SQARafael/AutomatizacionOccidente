package Spotify.pageObjectModel;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicioPageObject extends PageObject {
    private  final By lnkLogin= By.xpath("//button[@data-testid='login-button']");

    public By getLnkLogin() {
        return lnkLogin;
    }
}
