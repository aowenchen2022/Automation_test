package com.noosh.selenium.business;

import com.noosh.selenium.base.DriverBase;
import com.noosh.selenium.handle.loginPageHandle;

public class loginPro {
    public loginPageHandle lph;
    public DriverBase driver;
    public loginPro(DriverBase driver){
        this.driver = driver;
        lph = new loginPageHandle(driver);
    }
    public void login(String username,String password) {
        if(lph.assertLoginPage()){
            lph.sendKeysUser(username);
            lph.sendKeysPassword(password);
            lph.clickLoginButton();
        }else{
            System.out.println("页面不存在或者状态不正确。");
        }
    }
}
