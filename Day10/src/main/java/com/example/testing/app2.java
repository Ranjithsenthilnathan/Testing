package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class app2 {
    public static void main( String[] args )
    {
    	WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        //launching the url
        driver.get("https://demo.opencart.com/");
        //maximizing the webpage
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"content\"]/h3"));
    	JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
        
    }
}