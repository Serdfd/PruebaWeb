package com.proyecto.web.util;

import com.proyecto.web.models.Address;
import com.proyecto.web.models.SelectOption;
import net.thucydides.core.steps.stepdata.CSVTestDataSource;
import net.thucydides.core.steps.stepdata.TestDataSource;

import java.io.IOException;

public final class HelperCsv {
    public static Address readCsv(String path) throws IOException {
        Address address = new Address();

        TestDataSource dataSource = new CSVTestDataSource("/external-data/address.csv",',');

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
