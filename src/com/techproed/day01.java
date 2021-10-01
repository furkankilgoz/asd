package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/fou/Documents/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        // driver.close();

        driver.navigate().to("https://amazon.com");
        driver.navigate().back();
        driver.navigate().forward();



    }
}
