package com.seleniumwoerk.com.seleniumbasicz;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.dirver", "D:\\New folder\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.softwaretestingmaterial.com");
		
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		
		System.out.println("No of links are "+ alllinks.size());
		for(WebElement link :alllinks)
		{
		String eachlink=link.getAttribute("href");
		if(eachlink==null || eachlink.isEmpty())
		{
		continue;
		}

	}

	}}
