package com.company;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //WebDriver setup
        System.setProperty("webdriver.chrome.driver",
                "C:\\Program Files\\Selenium\\Chrome WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //URL of the web page
        driver.get("http://www.continuouslearningacademy.guru/resources/2/first/");
        //Let the user actually see something
        Thread.sleep(1000);
        //search for the desired element in the web page
        WebElement element = driver.findElement(By.xpath("//input[@name='email']"));
        //enter values in the element
        element.sendKeys("test@testorg");
        element.sendKeys(Keys.ENTER);
        //Let the user actually see something
        Thread.sleep(2000);
        //webdriver resource close
        driver.close();
    }
}
