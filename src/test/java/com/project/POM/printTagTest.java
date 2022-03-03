package com.project.POM;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class printTagTest {

	private WebDriver driver;
	PrintTagPage printTag; 

	@Test
	public void test() throws Exception {
		printTag.printTagsTest();
	}

	@BeforeTest
	public void beforeTest() {
		printTag = new PrintTagPage(driver);
		driver = printTag.chromeDriverConection();
		printTag.visit("https://www.netflix.com/ar/");

	}

	@AfterTest
	public void afterTest() {
		 driver.quit(); 
	}
}
