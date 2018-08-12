package com.proyecto.web.steps;

import com.proyecto.web.pages.SuccesAccountPage;
import net.thucydides.core.annotations.Step;

public class SuccesAccountSteps {

    private SuccesAccountPage succesAccountPage;

    @Step
    public void checkNewUserStatus(){
        succesAccountPage.checkNewUserStatus();
    }
}
