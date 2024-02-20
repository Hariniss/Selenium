package org.sh;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Failed {

	WebDriver driver = new ChromeDriver();
	JavascriptExecutor j = (JavascriptExecutor) driver;

	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
	search.sendKeys("iphone 15");
	
	Robot r = new Robot();
	
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	WebElement click = driver.findElement(By.xpath("(//img[@class='_396cs4'])[1]"));
	click.click();

}
