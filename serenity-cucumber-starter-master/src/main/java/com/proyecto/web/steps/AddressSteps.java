package com.proyecto.web.steps;

import com.proyecto.web.models.Address;
import com.proyecto.web.pages.AddressPage;
import com.proyecto.web.util.Constants;
import com.proyecto.web.util.HelperCsv;
import net.thucydides.core.annotations.Step;
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
        return HelperCsv.readCsv(Constants.CSV_FILE_PATH);
    }
}
