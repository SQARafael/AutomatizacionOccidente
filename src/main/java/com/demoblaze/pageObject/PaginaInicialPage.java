package com.demoblaze.pageObject;
import lombok.Data;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
/*
 * @(#) PaginaInicial.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

@Data
public class PaginaInicialPage extends PageObject {
    private final By lnkLogin= By.xpath("//a[@id='login2']");
    private final By lnkProfile= By.xpath("//a[@id='nameofuser']");
}

