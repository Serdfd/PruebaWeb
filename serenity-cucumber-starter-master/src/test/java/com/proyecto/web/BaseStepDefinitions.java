package com.proyecto.web;

import com.proyecto.web.steps.*;
import net.thucydides.core.annotations.Steps;

public class BaseStepDefinitions {
    @Steps
    protected LoginSteps loginSteps;
    @Steps
    protected UserHomePageSteps userHomePageSteps;
    @Steps
    protected AddressBookSteps addressBookSteps;
    @Steps
    protected AddressSteps addressSteps;
    @Steps
    protected RegisterAccountSteps registerAccountSteps;
    @Steps
    protected SuccesAccountSteps succesAccountSteps;
}
