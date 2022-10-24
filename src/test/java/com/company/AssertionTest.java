package com.company;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertionTest {
    public static void main(String[] args) throws InterruptedException {
        //WebDriver setup
        System.setProperty("webdriver.chrome.driver",
                "C:\\Program Files\\Selenium\\Chrome WebDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //URL of the web page
        driver.get("http://www.continuouslearningacademy.guru/resources/2/assertions/");
        try{
            Assert.assertEquals("Cool Tile", driver.getTitle()); // <head><title>Assertions with Selenium</title></head>
            System.out.println(driver.getTitle());
            System.out.println("[Test PASS]. Web page has the expected title!");
        }
        catch(AssertionError ase){
            System.out.println(ase); // org.junit.ComparisonFailure: expected:<[Cool Tile]> but was:<[Assertions with Selenium]>
            System.out.println("[Test FAIL]. Page title is not as expected");
        }

        try{
            Assert.assertTrue(driver.getPageSource().contains("assertion result"));
            System.out.println(driver.getPageSource());
            System.out.println("[Test PASS]. The text is found in the web page");
        }
        catch(AssertionError ase){
            System.out.println("[Test FAIL]. The text is not found in the web page");
        }

        driver.close();
    }
}
