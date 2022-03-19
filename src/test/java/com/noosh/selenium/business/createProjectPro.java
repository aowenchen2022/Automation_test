package com.noosh.selenium.business;

import com.noosh.selenium.base.DriverBase;
import com.noosh.selenium.handle.createProjectHandle;


public class createProjectPro {
    public createProjectHandle lph;
    public DriverBase driver;
    public createProjectPro(DriverBase driver){
        this.driver = driver;
        lph = new createProjectHandle(driver);
    }
    public void createProject(String projectName,int n){
        lph.clickCreateProject();
        lph.sendKeysProjectName(projectName);
        lph.clickCreateProjectButton(n);
    }
}




