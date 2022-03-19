package com.noosh.selenium.page;

import com.noosh.selenium.base.DriverBase;
import com.noosh.selenium.util.getByLocator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.sql.DriverManager;
import java.util.List;

public class createProjectPage extends BasePage{
    public createProjectPage(DriverBase driver){
        super(driver);
    }

    /**
     * 获取create project button
     * */
    public WebElement findCreateProjectButton(){
        return element(getByLocator.getLocator("findCreateProject"));
    }
    /**
     * 获取输入project name输入框
     * */
    public WebElement getProjectName(){
        return element(getByLocator.getLocator("projectName"));
    }
    /**
     *点击create project button
     * */
    public List<WebElement> clickCreateProjectButton(){
        return elements(getByLocator.getLocator("createProjectButton"));
    }





}
