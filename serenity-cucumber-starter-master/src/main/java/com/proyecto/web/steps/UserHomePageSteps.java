package com.proyecto.web.steps;

import com.proyecto.web.pages.UserHomePage;
import net.thucydides.core.annotations.Step;

public class UserHomePageSteps {

    private UserHomePage homePage;

    @Step
    public void viewAddressBooks (){
        homePage.viewAddressBooks();
    }
}
