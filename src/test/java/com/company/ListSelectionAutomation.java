package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListSelectionAutomation {
    public static void main(String[] args) throws InterruptedException {
        //WebDriver setup
        System.setProperty("webdriver.chrome.driver",
                "C:\\Program Files\\Selenium\\Chrome WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //URL of the web page
        driver.get("http://www.continuouslearningacademy.guru/resources/2/forms/");
        //search for the desired element in the web page
        Select listLanguage = new Select(driver.findElement(By.name("language")));
        listLanguage.selectByVisibleText("German");
        Thread.sleep(2000);
        driver.close();
    }
}
