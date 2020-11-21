package com.syntax.class28;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumTest {
    public static void main(String[] args){

     System.setProperty("webdriver.chrome.driver","/Users/sergiiles/Desktop/chrome/chromedriver");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.amazon.com");

    }

}
