package com.github.Fatmah2saa9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        driver.navigate().to("https://www.github.com");
        driver.navigate().back();
       // WebDriver driver2 = new SafariDriver();
        //driver2.get("https://www.google.com");
    }
}