package com.noosh.selenium.testCase;

import com.noosh.selenium.base.DriverBase;
import com.noosh.selenium.business.tabIconPro;
import com.noosh.selenium.common.commonModel;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class tabIconTestCase {
    public DriverBase driver;
    public tabIconPro tip;
    commonModel c = new commonModel();

    @BeforeClass
    public void BeforeClass(){
        this.driver = new DriverBase("chrome");
        driver.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        c.sleep(5);
    }
    @Test
    public void tabIcon(){
        tip = new tabIconPro(driver);
        c.sleep(2);
    }

    @AfterClass
    public void afterClass(){
        c.sleep(30);
        driver.driver.quit();
    }
}
