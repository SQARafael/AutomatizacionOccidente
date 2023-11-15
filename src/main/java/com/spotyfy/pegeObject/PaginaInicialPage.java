package com.spotyfy.pegeObject;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicialPage extends PageObject{
    private final By lnkLogin= By.xpath("//a[starts-with(@href, 'https://www.spotify.com/co-es/login/?continue=%2Fco-es%2Fpremium%2F%3Futm_source%3Dco-es_brand_contextual-desktop_text%26utm_medium%3Dpaidsearch%26utm_campaign%3Dalwayson_latam_co_premiumbusiness_core_brand%2Bcontextual-desktop%2Btext%2Bexact%2Bco-es%2Bgoogle%26gad%3D1%26gclid%3DCj0KCQiAr8eqBhD3ARIsAIe-buOiCWpuiKIwMBDekDip9t2hOddBmJNEVm4wwv2Izv2fY1BKkvj9MUUaAs1YEALw_wcB%26gclsrc%3Daw.ds%26flow_ctx%3D7450002b-4e86-4939-8cbb-ddc36e69d7b6%253A1699951290')]");

    public By getLnkLogin() {
        return lnkLogin;
    }
}
