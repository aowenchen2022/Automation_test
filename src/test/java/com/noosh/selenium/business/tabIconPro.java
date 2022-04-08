package com.noosh.selenium.business;

import com.noosh.selenium.base.DriverBase;
import com.noosh.selenium.handle.tabIconHandle;

public class tabIconPro {
    public tabIconHandle tih;
    public DriverBase driver;
    public tabIconPro(DriverBase driver){
        this.driver = driver;
        tih = new tabIconHandle(driver);
    }
    public void tabIcon(){
        tih.sendKeysUser("dho1g1mgr1");
        tih.sendKeysPassword("noosh123");
        tih.assertAngularPageIcon();
        tih.clickWorkspace();
        tih.assertReactPageIcon();
    }
}
