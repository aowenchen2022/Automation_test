package com.noosh.selenium.handle;

import com.noosh.selenium.base.DriverBase;
import com.noosh.selenium.page.createRfePage;


public class createRfeHandle {
    public DriverBase driver;
    public createRfePage crp;
    public createRfeHandle(DriverBase driver){
        this.driver = driver;
        crp = new createRfePage(driver);

    }
    /**
     * 点击Estimates
     * */
    public void clickEstimates(){
        crp.click(crp.clickEstimate());
    }


    /**
     * 点击createRFE button
     * */
    public void clickCreateRfe(){
        crp.click(crp.clickCreateRfe());
    }

    /**
     * 输入estimate due date
     * */
    public void enterEstimateDueDate(String estimateDate){
        crp.sendKeys(crp.getEstimateDueDate(),estimateDate);
    }

    /**
     * 输入order completion date
     * */
    public void enterOrderCompletionDate(String orderCompletionDate){
        crp.sendKeys(crp.getOrderCompletionDate(),orderCompletionDate);
    }

    /**
     * 输入Qty
     * */
    public void enterQty1(int Qty1){
        crp.sendKeys(crp.getQty1(), String.valueOf(Qty1));
    }

    /**
     * 点击Contacts
     * */
    public void clickContacts(){
        crp.click(crp.clickRfeContacts());
    }

    /**
     * 选择supplier
     * */

    public void selectSupplier(){
        crp.click(crp.selectSupplier());
    }

    /**
     * 点击Add contact button
     * */
    public void clickAddContact(){
        crp.click(crp.addContact());
    }

    /**
     * 点击Add send RFE button
     * */
    public void clickSendRfe(){
        crp.click(crp.clickSendRfe());
    }

}
