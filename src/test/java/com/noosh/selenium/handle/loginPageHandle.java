package com.noosh.selenium.handle;

import com.noosh.selenium.base.DriverBase;
import com.noosh.selenium.page.loginPage;

public class loginPageHandle {
    public DriverBase driver;
    public loginPage lp;

    public loginPageHandle(DriverBase driver) {
        this.driver = driver;
        lp = new loginPage(driver);
    }

    /**
     * 输入用户名
     */
    public void sendKeysUser(String username) {
        lp.sendKeys(lp.getUserElement(), username);
    }

    /**
     * 输入密码
     */
    public void sendKeysPassword(String password) {
        lp.sendKeys(lp.getPasswordElement(), password);
    }

    /**
     * 点击登陆
     */
    public void clickLoginButton() {
        lp.click(lp.getLoginButtonElement());
    }
    /**
     * 判断是否是登陆页面
     * */
    public boolean assertLoginPage(){
        return lp.assertElement(lp.getUserElement());
    }
}


