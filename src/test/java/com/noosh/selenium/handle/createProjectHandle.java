package com.noosh.selenium.handle;

import com.noosh.selenium.base.DriverBase;
import com.noosh.selenium.page.createProjectPage;
import com.noosh.selenium.page.loginPage;
import org.openqa.selenium.WebElement;

import java.util.List;


public class createProjectHandle {
    public DriverBase driver;
    public createProjectPage cpp;
    public createProjectHandle(DriverBase driver) {
        this.driver = driver;
        cpp = new createProjectPage(driver);
    }
    /**
     * 查找并点击create project
     * */
    public void clickCreateProject(){
        cpp.click(cpp.findCreateProjectButton());
    }
    /**
     * 输入project name
     * */
    public void sendKeysProjectName(String projectName){
        cpp.sendKeys(cpp.getProjectName(),projectName);
    }

//    /**
//     * 点击contacts
//     * */
//    public void clickContacts(){
//        cpp.click(cpp.clickContacts());
//    }

//    /**
//     * 选中client
//     * */
//    public void selectClient(){
//        cpp.click(cpp.selectClient());
//    }
//
//    /**
//     * 点击done
//     * */
//
//    public void clickDone(int n){
//        cpp.clickList(cpp.clickDoneButton(),n);
//    }

    /**
     * 点击创建按钮
     * */
    public void clickCreateProjectButton(int n){
        cpp.clickList(cpp.clickCreateProjectButton(),n);
    }

}
