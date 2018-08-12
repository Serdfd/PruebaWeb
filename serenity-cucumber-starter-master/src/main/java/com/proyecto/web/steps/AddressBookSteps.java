package com.proyecto.web.steps;

import com.proyecto.web.pages.AddressBookPage;
import net.thucydides.core.annotations.Step;

public class AddressBookSteps {

    private AddressBookPage addressBookPage;

    @Step
    public void addNewAddress(){
        addressBookPage.addNewAddress();
    }

    @Step
    public void checkNewAddresStatus(){
        addressBookPage.checkNewAddresStatus();
    }

}
