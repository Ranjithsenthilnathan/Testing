package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App 
{
    public static <JavascriptExecutor> void main( String[] args ) throws InterruptedException
    {
//    WebDriverManager.edgedriver().setup();
//   WebDriver driver = new EdgeDriver();
//     driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
//    driver.manage().window().maximize();
//    driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("sample");
//   driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("name");
//     driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("sample@gmail.com");
//      driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("123456");
//     driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
//    	
      WebDriverManager.edgedriver().setup();
		WebDriver driver1= new EdgeDriver();
		String url="https://demo.opencart.com/";
		driver1.navigate().to(url);
		driver1.manage().window().maximize();
		WebElement search=driver1.findElement(By.name("search"));
		search.sendKeys("mobiles");
		
		//to scroll down
		JavascriptExecutor js = (JavascriptExecutor)driver1;
		((RemoteWebDriver) js).executeScript("window.scrollBy(0,4500)", "");
		Thread.sleep(3000);
		((RemoteWebDriver) js).executeScript("window.scrollBy(0,4500)", "");
		//return
		WebElement returns =driver1.findElement(By.linkText("Returns"));
		  returns.click();
		  driver1.navigate().back();
		  driver1.quit();
    }
}
