package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextInputAutomation {
    public static void main(String[] args) throws InterruptedException {
        //WebDriver setup
        System.setProperty("webdriver.chrome.driver",
                "C:\\Program Files\\Selenium\\Chrome WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //URL of the web page
        driver.get("http://www.continuouslearningacademy.guru/resources/2/forms/");
        WebElement element = driver.findElement(By.name("uname"));
        element.sendKeys("Test Message");
        Thread.sleep(2000);
        driver.close();
    }
}
