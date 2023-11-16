package com.open.spotify.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Esperas {

    //explicita
    public static void espera1(WebDriver webDriver, By by){

        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(5));
        wait.until(
                ExpectedConditions.elementToBeClickable(by)
        );

    }


    public static void espera2(WebDriver webDriver){
    //implicita

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }

    public static void espera3(){

        //Explicita



    }



}
