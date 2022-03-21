package com.noosh.selenium.testCase;

import com.noosh.selenium.base.DriverBase;
import com.noosh.selenium.business.createProjectPro;
import com.noosh.selenium.business.createSpecPro;
import com.noosh.selenium.business.loginPro;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.After;
import org.testng.annotations.*;
import com.noosh.selenium.common.commonModel;
import java.util.concurrent.TimeUnit;


public class createProjectCase{
    public DriverBase driver;
    public createProjectPro cpp;
    public loginPro loginPro;
    public createSpecPro csp;
    commonModel c = new commonModel();

    @BeforeClass
    public void BeforeClass() {
        this.driver = new DriverBase("chrome");
        driver.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        c.sleep(20);
        driver.get("https://nooshauth.qa2.noosh.com/login");
        loginPro = new loginPro(driver);
        cpp = new createProjectPro(driver);
        loginPro.login("dgo1g1mgr1", "noosh123");
        csp = new createSpecPro(driver);

    }

    @Test
    public void createProjectPage(){

        cpp.createProject("QA project "+c.randomInt(),2);
    }

    @Test
    public void createSpec(){
        csp.createSpec("spec01");
    }

    @AfterClass
    public void afterClass() {
        c.sleep(30);
        driver.driver.quit();

    }





}