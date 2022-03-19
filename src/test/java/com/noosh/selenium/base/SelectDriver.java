package com.noosh.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.nio.file.Path;
import java.nio.file.Paths;

public class SelectDriver {
    public WebDriver driverName(String browser) {
        if (browser.equalsIgnoreCase("fireFox")) {
            Path p1 = Paths.get("src", "drivers", "geckodriver.exe");
            System.setProperty("webdriver.fireFox.driver", p1.toAbsolutePath().toString());
            return new FirefoxDriver();
        } else {
            Path p1 = Paths.get("src", "drivers", "chromedriver.exe");
            System.setProperty("webdriver.chrome.driver", p1.toAbsolutePath().toString());
            return new ChromeDriver();
        }
    }
}
