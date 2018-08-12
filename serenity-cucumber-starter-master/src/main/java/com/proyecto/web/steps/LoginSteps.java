package com.proyecto.web.steps;

import com.proyecto.web.models.User;
import com.proyecto.web.pages.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginSteps {

    private LoginPage loginPage;

    @Step
    public void openPage(){
        loginPage.open();
    }

    @Step
    public void login(String email,String password)
    {
        loginPage.setLoginData(getUser(email,password));
        loginPage.login();
    }

    private User getUser(String email,String password){
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);

        return user;
    }
}
