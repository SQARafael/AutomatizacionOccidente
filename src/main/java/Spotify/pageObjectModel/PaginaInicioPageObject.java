package Spotify.pageObjectModel;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicioPageObject extends PageObject {
    private  final By lnkLogin= By.xpath("//button[@data-testid='login-button']");
    private final By btnperfil=By.xpath("//button[@class=\"Button-sc-1dqy6lx-0 grWQsc encore-over-media-set SFgYidQmrqrFEVh65Zrg\"]");
    public By getLnkLogin() {
        return lnkLogin;
    }

    public By getBtnperfil() {
        return btnperfil;
    }
}
