package com.noosh.selenium.page;

import com.noosh.selenium.base.DriverBase;
import com.noosh.selenium.util.getByLocator;
import org.openqa.selenium.WebElement;

public class createSpecPage extends BasePage {
    public createSpecPage(DriverBase driver) {
        super(driver);
    }
    /**
     * Spec List点击specs
     * */

    public WebElement clickSpecs(){
        return element(getByLocator.getLocator("clickSpecs"));
    }

    /**
     * 获取create Spec element
     * */

    public WebElement clickCreateSpec(){
        return element(getByLocator.getLocator("createSpec"));

    }
    /**
     * 点击envelope的radio button
     * */
    public WebElement selectSpecType(){
        return element(getByLocator.getLocator("specRadioButton"));
    }

    /**
     * 点击continue button
     * */
    public WebElement clickContinueButton(){
        return element(getByLocator.getLocator("continueButton"));
    }
    /**
     * 获取输入spec name输入框
     * */
    public WebElement getSpecName(){
        return element(getByLocator.getLocator("specName"));
    }

    /**
     * 点击Update spec button
     * */
    public WebElement clickUpdateSpec(){
        return element(getByLocator.getLocator("updateSpec"));
    }

}
