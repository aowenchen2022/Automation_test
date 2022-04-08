package com.noosh.selenium.handle;

import com.noosh.selenium.base.DriverBase;
import com.noosh.selenium.page.tabIconPage;

public class tabIconHandle {
    public DriverBase driver;
    public tabIconPage tp;
    public tabIconHandle(DriverBase driver){
        this.driver = driver;
        tp = new tabIconPage(driver);
    }
    /**
     * 输入用户名
     */
    public void sendKeysUser(String username) {
        tp.sendKeys(tp.getUserElement(), username);
    }

    /**
     * 输入密码
     */
    public void sendKeysPassword(String password) {
        tp.sendKeys(tp.getPasswordElement(), password);
    }

    /**
     * 点击登陆
     */
    public void clickLoginButton() {
        tp.click(tp.getLoginButtonElement());
    }

    /**
     * 查看My Desk的tab icon
     * */
    public boolean assertAngularPageIcon(){
        return tp.assertElement(tp.getAngularFavicon());
    }

    /**
     * 点击workspace
     * */
    public void clickWorkspace(){
        tp.click(tp.clickWorkspace());
    }

    /**
     * 查看Project manager的tab icon
     * */
    public boolean assertReactPageIcon(){
        return tp.assertElement(tp.getAngularFavicon());
    }
}
