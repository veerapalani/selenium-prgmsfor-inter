package com.seleniumwoerk.com.seleniumbasicz;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class testing {
	
	public static void main(String[] args) throws AWTException, IOException {
		String s2;
	System.setProperty("webdriver.chrome.dirver", "D:\\New folder\\chromedriver_win32 (1)\\chromedriver.exe");
			
	WebDriver driver=new ChromeDriver();
	
	driver.manage().deleteAllCookies();
	driver.get("https://www.makemytrip.com/");
//	driver.findElement(By.xpath(null));
    s2="//p[text()='₹ 18,261']";
    driver.findElement(By.xpath(s2));
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C:/Users/10709946/eclipse-workspace/seleniumbasicz/src/test/java/com/seleniumwoerk/com/seleniumbasicz/goog.png"));
	
	Actions action=new Actions(driver); 
	Robot rbt=new Robot();
	
	Alert art=driver.switchTo().alert();
	driver.switchTo().alert().sendKeys("s2");
	
	action.contextClick();
	/*
	 * having a last 6 of experience in that im having a 4 years experience in IT both automation as well as manual ..In that automation 
	 */
	
	
	
	}

}
