package com.noosh.selenium.page;

import com.noosh.selenium.base.DriverBase;
import com.noosh.selenium.util.getByLocator;
import org.openqa.selenium.WebElement;

public class loginPage extends BasePage {
    public loginPage(DriverBase driver){
        super(driver);
    }
    /**
     * 获取用户输入框
     * */
    public WebElement getUserElement(){
        return element(getByLocator.getLocator("username"));
    }
    /**
     * 获取输入密码输入框Element
     * */
    public WebElement getPasswordElement(){
        return element(getByLocator.getLocator("userpass"));
    }
    /**
     * 获取输入登录按钮element
     * */
    public WebElement getLoginButtonElement(){
        return element(getByLocator.getLocator("loginbutton"));
    }


}
