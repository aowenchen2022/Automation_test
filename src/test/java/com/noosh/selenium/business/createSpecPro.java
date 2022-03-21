package com.noosh.selenium.business;

import com.noosh.selenium.base.DriverBase;
import com.noosh.selenium.handle.createSpecHandle;

public class createSpecPro {
    public createSpecHandle csh;
    public DriverBase driver;
    public createSpecPro(DriverBase driver){
        this.driver = driver;
        csh = new createSpecHandle(driver);
    }
    public void createSpec(String specName){
        csh.clickSpecs();
        csh.clickCreateSpec();
        csh.selectSpecType();
        csh.enterSpecName(specName);
        csh.clickUpdateSpecButton();
    }

}
