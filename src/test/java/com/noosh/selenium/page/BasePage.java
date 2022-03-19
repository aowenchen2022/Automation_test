package com.noosh.selenium.page;

import com.noosh.selenium.base.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.sql.Driver;
import java.util.List;

public class BasePage {
    public DriverBase driver;
    public BasePage(DriverBase driver){
        this.driver = driver;
    }
    /**
     * 定位Element
     * */
    public WebElement element(By by){
        WebElement element = driver.findElement(by);
        return element;

    }

    public List<WebElement> elements(By by){
        List<WebElement> elements = driver.findElements(by);
        return elements;

    }
    /**
     * 封装点击
     * */
    public void click(WebElement element) {
        if (element != null) {
            element.click();
        } else {
            System.out.println("元素没有定位到，点击失败");
        }

    }

    public void clickList(List<WebElement> elements,int n) {
        WebElement ele = elements.get(n-1);
        ele.click();
    }




    public void js_click(WebElement element) {
        if (element != null) {
            ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
        } else {
            System.out.println("元素没有定位到，点击失败");
        }

    }







    /**
     * 封装输入
     * */
    public void sendKeys(WebElement element,String value){
        if (element != null) {
            element.sendKeys(value);
        }else {
            System.out.println(element+"元素没有定位到，输入失败"+value);
        }
    }

    /**
     * 判断元素是否显示
     * */
    public boolean assertElement(WebElement element){
        return element.isDisplayed();
    }

}