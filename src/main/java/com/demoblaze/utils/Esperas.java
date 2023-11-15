package com.demoblaze.utils;
/*
 * @(#) Esperas.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * @autor Rafael Chica
 * @Fecha: --o--
 */
public class Esperas {

    public static void espera1(WebDriver webDriver, By by){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(
                ExpectedConditions.elementToBeClickable(by)
        );

    }
}
