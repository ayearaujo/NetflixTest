package com.project.POM;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrintTagPage extends Base {

	public PrintTagPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	By tagNameSelector = By.tagName("div");

	public void printTagsTest() throws Exception {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		if (!isDisplayed(tagNameSelector)) {
			System.out.println("No se encuentran elementos con esta etiqueta");
		}	
				
		List<WebElement> list = driver.findElements(tagNameSelector);
		System.out.println("Lista con los elementos que contienen la etiqueta ingresada:" + getTest(tagNameSelector));
		
		
	}
	
	
}
