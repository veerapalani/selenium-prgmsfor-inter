package com.seleniumwoerk.com.seleniumbasicz;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.dirver", "D:\\New folder\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		String s="//span[@class='btn btn-success fileinput-button']";
		 WebElement browse=driver.findElement(By.xpath(s));
		 browse.click();
		 browse.sendKeys("C:\\Users\\10709946\\Downloads\\Picture1.png");
		 System.out.println("File is Uploaded Successfully");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("URL");// URL OF WEBPAGE HAVING FRAMES
		//First finding the element using any of locator strategy
		WebElement iframeElement = driver.findElement(By.id("iFrameResult"));
		//now using the switch command to switch to main frame.
		driver.switchTo().frame(0);
		//Perform all the required tasks in the frame 0
		//Switching back to the main window
		driver.switchTo().defaultContent();
		driver.quit();
	}

}
