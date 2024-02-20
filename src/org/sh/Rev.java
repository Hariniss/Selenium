package org.sh;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.AllArguments;

public class Rev {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "D:\\Workplace\\Revision\\drivers\\chromedriver.exe");

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
		
		
		String parent = driver.getWindowHandle();
		System.out.println("get parent id :"+parent);
		
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println("get allwindow id :"+allwindow);
		
		for (String winid : allwindow) {
			if (winid !=parent) {
				driver.switchTo().window(winid);
			}
			
		}
		WebElement get = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		String text = get.getText();
		System.out.println("get total amount:"+text);
		
		WebElement add = driver.findElement(By.xpath("//button[text()='Add to cart']"));
		add.click();
		
		
		
	}
}
