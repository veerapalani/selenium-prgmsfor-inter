package com.seleniumwoerk.com.seleniumbasicz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsertest {

	public static void main(String[] args) {
		// "org.openqa.selenium.remote.UnreachableBrowserException: Error communicating

	WebDriver webdriver= new ChromeDriver();    
	webdriver.get("https://www.makemytrip.com/");
	webdriver.quit();
	webdriver= new ChromeDriver(); 
	webdriver.get("https://www.makemytrip.com/");

}
}