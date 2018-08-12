package com.proyecto.web.pages;

import com.proyecto.web.models.Address;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class AddressPage extends PageObject {

    @FindBy(id = "input-firstname")
    private WebElementFacade firstName;

    @FindBy(id = "input-lastname")
    private WebElementFacade lastName;

    @FindBy(id = "input-company")
    private WebElementFacade company;

    @FindBy(id = "input-address-1")
    private WebElementFacade address1;

    @FindBy(id = "input-address-2")
    private WebElementFacade address2;

    @FindBy(id = "input-city")
    private WebElementFacade city;

    @FindBy(id = "input-postcode")
    private WebElementFacade postCode;

    @FindBy(id = "input-country")
    private WebElementFacade country;

    @FindBy(id = "input-zone")
    private WebElementFacade zone;

    @FindBy(xpath = "//*[@id=\"content\"]/form/fieldset/div[10]/div/label[1]/input")
    private WebElementFacade yesDefaultAddress;

    @FindBy(xpath = "//*[@id=\"content\"]/form/fieldset/div[10]/div/label[2]/input")
    private WebElementFacade noDefaultAddress;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div[2]/input")
    private WebElementFacade continueButton;

    public void addNewAddress(Address address){
        setAddressData(address);
        clickContinue();
    }

    private void clickContinue(){
        continueButton.click();
    }

    private void setAddressData(Address address){
        firstName.sendKeys(address.getFirstName());
        lastName.sendKeys(address.getLastName());
        company.sendKeys(address.getCompany());
        address1.sendKeys(address.getAddress1());
        address2.sendKeys(address.getAddress2());
        city.sendKeys(address.getCity());
        postCode.sendKeys(address.getPostCode());
        country.selectByValue(address.getCountry().getValue());
        zone.selectByValue(address.getZone().getValue());

        if (address.isDefaultAddress()){
            yesDefaultAddress.click();
        }
        else{
            noDefaultAddress.click();
        }
    }

}
