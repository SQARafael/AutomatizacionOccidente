package com.alkomprar.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {

        private By btnMicuenta = By.xpath("//li[@id=\"js-myaccount-header\"]/a");

        public By getBtnMicuenta() {
            return btnMicuenta;
        }
}
