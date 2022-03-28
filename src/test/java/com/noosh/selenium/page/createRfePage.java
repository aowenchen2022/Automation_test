package com.noosh.selenium.page;

import com.noosh.selenium.base.DriverBase;
import com.noosh.selenium.util.getByLocator;
import org.openqa.selenium.WebElement;


public class createRfePage extends BasePage {

    public createRfePage(DriverBase driver) {
        super(driver);

    }


    /**
     * 点击 Estimates on the left nav var
     */
    public WebElement clickEstimate() {
        return element(getByLocator.getLocator("clickEstimates"));
    }






    /**
     *点击Create RFE button
     * */
    public WebElement clickCreateRfe() {
        return element(getByLocator.getLocator("createRfe"));
    }

    /**
     * 获取estimate due date输入框
     * */
    public WebElement getEstimateDueDate(){
        return element(getByLocator.getLocator("getEstimateDueDate"));
    }

    /**
     * 获取order completion date输入框
     * */

    public WebElement getOrderCompletionDate(){
        return element(getByLocator.getLocator("getOrderCompletionDate"));
    }

    /**
     * 获取QTY 1输入框
     * */
    public WebElement getQty1(){
        return element(getByLocator.getLocator("getQty1"));
    }

    /**
     * 点击Contacts
     * */
    public WebElement clickRfeContacts(){
        return element(getByLocator.getLocator("clickRfeContacts"));
    }

    /**
     * 获取supplier CheckBox
     * */
    public WebElement selectSupplier(){
        return element(getByLocator.getLocator("supplier"));
    }

    /**
     * 获取add contact button
     * */

    public WebElement addContact(){
        return element(getByLocator.getLocator("addContact"));
    }

    /**
     * 点击send rfe button
     * */

    public WebElement clickSendRfe(){
        return element(getByLocator.getLocator("sendRfe"));
    }

}
