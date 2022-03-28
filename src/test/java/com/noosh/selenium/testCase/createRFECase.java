package com.noosh.selenium.testCase;

import com.noosh.selenium.base.DriverBase;
import com.noosh.selenium.business.createProjectPro;
import com.noosh.selenium.business.createRfePro;
import com.noosh.selenium.business.createSpecPro;
import com.noosh.selenium.business.loginPro;
import org.testng.annotations.*;
import com.noosh.selenium.common.commonModel;
import java.util.concurrent.TimeUnit;


public class createRFECase {
    public DriverBase driver;
    public createProjectPro cpp;
    public loginPro loginPro;
    public createSpecPro csp;
    public createRfePro crp;
    commonModel c = new commonModel();

    @BeforeClass
    public void BeforeClass() {
        this.driver = new DriverBase("chrome");
        driver.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        c.sleep(3);
        driver.get("https://nooshauth.scdqa.noosh.com/login");
        loginPro = new loginPro(driver);
        cpp = new createProjectPro(driver);
        loginPro.login("dho1g1mgr1", "noosh123");
        csp = new createSpecPro(driver);
        c.sleep(5);
    }

    @Test
    public void createProjectPage(){
        cpp.createProject("QA project "+c.randomInt(),2);
        c.sleep(5);
    }


    @Test
    public void createSpec(){
        csp.createSpec("spec01"+c.randomInt(),1);
    }

    @Test
    public void createRfe(){
        crp.createRfe();

    }

    @AfterClass
    public void afterClass() {
        c.sleep(30);
        driver.driver.quit();

    }


}