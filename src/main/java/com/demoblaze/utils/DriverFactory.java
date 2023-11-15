package com.demoblaze.utils;
/*
 * @(#) DriverFactory.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import com.demoblaze.enums.Browser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class DriverFactory {

    public WebDriver get(Browser browser){
        if(Browser.chrome== browser){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
        if(Browser.firefox== browser){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
        if(Browser.edge== browser){
            WebDriverManager.edgedriver().setup();
            return new EdgeDriver();
        }
        throw new IllegalArgumentException("Browser not found: "+browser);


    }
}
