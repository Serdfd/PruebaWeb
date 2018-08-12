package com.proyecto.web.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://tutorialsninja.com/demo/index.php?route=account/account")
public class UserHomePage extends PageObject {

    @FindBy(xpath = "//*[@id=\"content\"]/ul[1]/li[3]/a")
    private WebElementFacade addressBookOption;

    public void viewAddressBooks(){
        this.addressBookOption.click();
    }
}
