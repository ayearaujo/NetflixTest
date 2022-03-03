package com.project.POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	protected WebDriver driver;
	
	public Base (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver chromeDriverConection() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
		driver = new ChromeDriver ();
		return driver;
	}
	

	public WebElement findElement (By locator) {
		return driver.findElement(locator);
	}
	
	@SuppressWarnings("unchecked")
	public List <WebElement> findElements(By locator) {
		return (List<WebElement>) driver.findElement(locator);
	}
		
	public String getTest(WebElement element) {
		return element.getText();
	}
	
	
	public String getTest(By locator) {
		return driver.findElement(locator).getText();
	}
	
	
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	
		public void click(By locator) {
		driver.findElement(locator).click();
		
	}
	
		public boolean isDisplayed(By locator) {
			try {
				return driver.findElement (locator).isDisplayed();
			} catch(org.openqa.selenium.NoSuchElementException e) {
				return false;
			}
		} 
		
	
		public void visit(String url) {
			driver.get(url);
		}
}
