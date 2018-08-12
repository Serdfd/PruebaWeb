package com.proyecto.web.pages;

import com.proyecto.web.models.User;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://tutorialsninja.com/demo/index.php?route=account/register")
public class RegisterAccountPage extends PageObject {

    @FindBy(id = "input-firstname")
    private WebElementFacade firstName;

    @FindBy(id = "input-lastname")
    private WebElementFacade lastName;

    @FindBy(id = "input-email")
    private WebElementFacade email;

    @FindBy(id = "input-telephone")
    private WebElementFacade telephone;

    @FindBy(id = "input-password")
    private WebElementFacade password;

    @FindBy(id = "input-confirm")
    private WebElementFacade confirm;

    @FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")
    private WebElementFacade yesSubscribe;

    @FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[3]/div/div/label[2]/input")
    private WebElementFacade noSubscribe;

    @FindBy(name = "agree")
    private WebElementFacade privatePolicy;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[2]")
    private WebElementFacade continueButton;

    public void addNewAddress(User user){
        setUserData(user);
        clickContinue();
    }

    private void clickContinue(){
        continueButton.click();
    }

    private void setUserData(User user){
        firstName.sendKeys(user.getFirstName());
        lastName.sendKeys(user.getLastName());
        email.sendKeys(user.getEmail());
        telephone.sendKeys(user.getTelephone());
        password.sendKeys(user.getPassword());
        confirm.sendKeys(user.getPassword());

        if (user.isSubscribed()){
            yesSubscribe.click();
        }
        else{
            noSubscribe.click();
        }

        privatePolicy.click();
    }

}
