package com.noosh.selenium.business;

import com.noosh.selenium.base.DriverBase;
import com.noosh.selenium.handle.createRfeHandle;


public class createRfePro {
    public createRfeHandle crh;
    public DriverBase driver;
    public createRfePro(DriverBase driver){
        this.driver=driver;
        crh = new createRfeHandle(driver);
    }
    public void createRfe(){
        crh.clickEstimates();
        crh.clickCreateRfe();
        crh.enterEstimateDueDate("4/30/2022");
        crh.enterOrderCompletionDate("7/6/2022");
        crh.enterQty1(100);
        crh.clickContacts();
        crh.selectSupplier();
        crh.clickAddContact();
        crh.clickSendRfe();
    }
}
