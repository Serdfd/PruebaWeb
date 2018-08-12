package com.proyecto.web.pages;

import com.proyecto.web.util.Constants;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.MatcherAssert;

@DefaultUrl("http://tutorialsninja.com/demo/index.php?route=account/success")
public class SuccesAccountPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"content\"]/p[1]")
    private WebElementFacade notification;

    public void checkNewUserStatus()
    {
        MatcherAssert.assertThat("Error creating user",notification.getText().equals(Constants.USER_SUCCESSFULLY_CREATE));
    }
}
