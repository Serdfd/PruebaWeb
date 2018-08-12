package com.proyecto.web;

import com.proyecto.web.steps.*;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class StepDefinitions {

    @Steps
    private LoginSteps loginSteps;
    @Steps
    private UserHomePageSteps userHomePageSteps;
    @Steps
    private AddressBookSteps addressBookSteps;
    @Steps
    private AddressSteps addressSteps;
    @Steps
    private RegisterAccountSteps registerAccountSteps;
    @Steps
    private SuccesAccountSteps succesAccountSteps;

    @Given("^I am logged in the Ninja Store page with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iAmLoggedInTheNinjaStorePageWithAnd(String email, String password) throws Throwable {
        loginSteps.openPage();
        loginSteps.login(email,password);
    }

    @When("^I add a new book address$")
    public void i_add_a_new_book_address() throws Exception {
        userHomePageSteps.viewAddressBooks();
        addressBookSteps.addNewAddress();
        addressSteps.addAddress();
    }

    @Then("^I see that the new address was successfully added$")
    public void i_see_that_the_new_address_was_successfully_added() throws Exception {
        addressBookSteps.checkNewAddresStatus();
    }

    @Given("^I dont have a user in the Ninja Store page$")
    public void iDontHaveAUserInTheNinjaStorePage() throws Throwable {
        registerAccountSteps.openPage();
    }

    @When("^I create a new user$")
    public void iCreateANewUser() throws Throwable {
        registerAccountSteps.addUser();
    }

    @Then("^I see that the new user was successfully created$")
    public void iSeeThatTheNewUserWasSuccessfullyCreated() throws Throwable {
        succesAccountSteps.checkNewUserStatus();
    }

    @Given("^I am in the Ninja Store Login page$")
    public void iAmInTheNinjaStoreLoginPage() throws Throwable {
        loginSteps.openPage();
    }

    @When("^I enter the following for login$")
    public void iEnterTheFollowingForLogin(DataTable dataTable) throws Throwable {
        List<List<String>> data = dataTable.raw();
        loginSteps.login(data.get(1).get(0),data.get(1).get(1));
    }

    @Then("^I see the message \"([^\"]*)\"$")
    public void iSeeTheTheMessage(String status) throws Throwable {
        loginSteps.checkInvalidLogin(status);
    }
}
