package com.noosh.selenium.handle;

import com.noosh.selenium.base.DriverBase;
import com.noosh.selenium.page.createSpecPage;

public class createSpecHandle {
    public DriverBase driver;
    public createSpecPage csp;
    public createSpecHandle(DriverBase driver) {
        this.driver = driver;

    }

        /**
         * 点击Specs
         * */
        public void clickSpecs(){
            csp.click(csp.clickSpecs());
        }

        /**
         * 点击create spec
         * */
        public void clickCreateSpec(){
            csp.click(csp.clickCreateSpec());
        }

        /**
         * Select spec Type
         * */

        public void selectSpecType(){
            csp.click(csp.selectSpecType());
        }

        /**
         *点击 continue 按钮
         * */

        public void clickContinueButton(){
            csp.click(csp.clickContinueButton());
        }

        /**
         * 输入spec name
         * */

        public void enterSpecName(String specName){
            csp.sendKeys(csp.getSpecName(),specName);
        }

        /**
         * 点击update spec button
         * */
        public void clickUpdateSpecButton(){
            csp.clickUpdateSpec();
        }

    }

