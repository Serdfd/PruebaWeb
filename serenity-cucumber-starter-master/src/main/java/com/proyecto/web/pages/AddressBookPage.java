package com.proyecto.web.pages;

import com.proyecto.web.util.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.MatcherAssert;

@DefaultUrl("http://tutorialsninja.com/demo/index.php?route=account/address")
public class AddressBookPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/a")
    private WebElementFacade newAddressButton;

    @FindBy(xpath = "//*[@id=\"account-address\"]/div[1]")
    private WebElementFacade notification;

    public void addNewAddress(){
        this.newAddressButton.click();
    }

    public void checkNewAddresStatus(){
        MatcherAssert.assertThat("Error creating address", notification.getText().equals(Constants.ADDRESS_SUCCESSFULLY_ADDED));
    }
}
