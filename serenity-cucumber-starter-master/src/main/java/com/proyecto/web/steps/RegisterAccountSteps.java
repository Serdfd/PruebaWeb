package com.proyecto.web.steps;

import com.proyecto.web.models.User;
import com.proyecto.web.pages.RegisterAccountPage;
import net.thucydides.core.annotations.Step;

public class RegisterAccountSteps {
    private RegisterAccountPage registerAccountPage;

    @Step
    public void openPage(){
        registerAccountPage.open();
    }

    @Step
    public void addUser(){
        registerAccountPage.addNewAddress(getUser());
    }

    //TODO:Hardcoded for test
    private User getUser(){
        User user = new User();
        user.setFirstName("First Name");
        user.setLastName("Last Name");
        user.setEmail("test9999@test.com");
        user.setTelephone("123456");
        user.setPassword("123456");
        user.setSubscribed(true);

        return user;
    }
}
