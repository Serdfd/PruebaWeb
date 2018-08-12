package com.proyecto.web.pages;

import com.proyecto.web.models.User;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://tutorialsninja.com/demo/index.php?route=account/login")
public class LoginPage extends PageObject {

    @FindBy (id = "input-email")
    private WebElementFacade email;

    @FindBy(id = "input-password")
    private WebElementFacade password;

    @FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input")
    private WebElementFacade loginButton;

    public void setLoginData(User user)
    {
        this.email.sendKeys(user.getEmail());
        this.password.sendKeys(user.getPassword());
    }

    public void login()
    {
        this.loginButton.submit();
    }
}
