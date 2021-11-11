package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ChromeLaunch {
	
public static void main(String[] args) throws InterruptedException, IOException, AWTException {
	
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\eclipse-workspace\\Launch\\driver\\chromedriver(1).exe");
  
 WebDriver driver = new ChromeDriver();
    
  driver.get("https://www.amazon.in/");

  driver.manage().window().maximize();
  
  WebElement searchbox  = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")); 
  searchbox.sendKeys("Laptops");
  
  Thread.sleep(2000);
  
  WebElement task = driver.findElement(By.xpath("//input[@type='submit']"));
     task.click();
     
     Thread.sleep(2000);
       
  WebElement  wear = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
  wear.click();
  
  String parentwindow = driver.getWindowHandle();
  System.out.println(parentwindow);
  
  Set<String> allwindows = driver.getWindowHandles();
  System.out.println(allwindows);
  
  for (String x : allwindows) {
	  
  if(!parentwindow.equals(x)) {
	  driver.switchTo().window(x);
	  
  }
  }
  WebElement price = driver.findElement(By.xpath("//span[@id='priceblock_dealprice']"));
  String text = price.getText();
  System.out.println(text);
  
  driver.switchTo().window(parentwindow);
  
  Thread.sleep(2000);
  
WebElement newlaptop = driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'])[1]"));
       newlaptop.click();
  
  Set<String> all2  = driver.getWindowHandles();
  System.out.println(all2);
  
  
  List<String>li = new ArrayList<>();
  
  li.addAll(all2);
  System.out.println();
  
  String x = li.get(2);
  driver.switchTo().window(x);
  
  WebElement laptop2 = driver.findElement(By.xpath("//td[@class='a-span12 a-color-price a-size-base priceBlockSavingsString']"));
  String text2 = laptop2.getText();
  System.out.println(text2);
  
  
  
  
  
  
  
  
  
}
} 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

		
	
	







 

















