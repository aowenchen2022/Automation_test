package com.noosh.selenium.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Path;
import java.nio.file.Paths;

public class baseDriver {
    WebElement driver;
    public baseDriver(){
        Path p1 = Paths.get("src","drivers","chromedriver.exe");
        System.setProperty("webdriver.chrome.driver" , p1.toAbsolutePath().toString());

    }
}
