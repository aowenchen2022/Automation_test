package com.noosh.selenium.page;

import com.noosh.selenium.base.DriverBase;
import com.noosh.selenium.util.getByLocator;
import org.openqa.selenium.WebElement;

public class tabIconPage extends BasePage{
    public tabIconPage(DriverBase driver){
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

    /**
     * 获取my desk-angular 的tab icon
     * */
    public WebElement getAngularFavicon(){
        return element(getByLocator.getLocator("TabIcon"));
    }

    /**
     * 点击Workspace
     * */

    public WebElement clickWorkspace(){
        return element(getByLocator.getLocator("Workspace"));
    }
    /**
     * 获取react 页面的tab icon
     * */
    public WebElement getReactFavicon(){
        return element(getByLocator.getLocator("TabIcon"));
    }

//    /**
//     * 鼠标移动到my profile
//     * */
//
//    public WebElement hoverOnProfile(){
//        return element(getByLocator.getLocator("Profile"));
//    }
//
//    /**
//     * 点击My Group
//     * */
//
//    public WebElement clickMyGroup(){
//        return element(getByLocator.getLocator("MyGroup"));
//    }
//
//    /**
//     * 获取enterprise页面的tab icon
//     * */
//    public WebElement getEnterpriseFavicon(){
//        return element(getByLocator.getLocator(""));
//    }



}



