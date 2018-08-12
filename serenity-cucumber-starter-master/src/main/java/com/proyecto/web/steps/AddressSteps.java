package com.proyecto.web.steps;

import com.proyecto.web.models.Address;
import com.proyecto.web.models.SelectOption;
import com.proyecto.web.pages.AddressPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.stepdata.CSVTestDataSource;
import net.thucydides.core.steps.stepdata.TestDataSource;
import java.io.IOException;

public class AddressSteps {
    private AddressPage addressPage;

    @Step
    public void addAddress(){
        try {
            addressPage.addNewAddress(getAddress());
        }
        catch (IOException ex){
            System.out.printf("Error reading the csv file!");
        }
    }

    private Address getAddress() throws IOException {
        TestDataSource dataSource = new CSVTestDataSource("/external-data/address.csv",',');

        Address address = new Address();
        address.setFirstName(dataSource.getData().get(0).get("FIRSTNAME"));
        address.setLastName(dataSource.getData().get(0).get("LASTNAME"));
        address.setCompany(dataSource.getData().get(0).get("COMPANY"));
        address.setAddress1(dataSource.getData().get(0).get("ADDRESS1"));
        address.setAddress2(dataSource.getData().get(0).get("ADDRESS2"));
        address.setCity(dataSource.getData().get(0).get("CITY"));
        address.setPostCode(dataSource.getData().get(0).get("POSTCODE"));

        SelectOption country = new SelectOption(dataSource.getData().get(0).get("COUNTRY"));
        address.setCountry(country);

        SelectOption zone = new SelectOption(dataSource.getData().get(0).get("ZONE"));
        address.setZone(zone);

        address.setDefaultAddress(Boolean.parseBoolean(dataSource.getData().get(0).get("ISDEFAULTADDRESS")));

        return address;
    }
}
