package com.spotyfy.pegeObject;
import lombok.Data;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@Data

public class PaginaInicialPage extends PageObject{
    private final By lnkLogin= By.xpath("(//button[@class='Button-sc-qlcn5g-0 fyugtm'])[2]");
    private final By lnkProfile= By.xpath("//div[@class='KdxlBanhDJjzmHfqhP0X Q4hOdDPRDHPhfou2xbDg m95Ymx847hCaxHjmyXKX']");

}
