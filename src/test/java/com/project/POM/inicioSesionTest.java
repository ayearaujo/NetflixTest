package com.project.POM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class inicioSesionTest {
	private WebDriver driver;
	InicioSesionPage inicioSesionPage; 

	@Test
	public void test() throws Exception {
		inicioSesionPage.startSessionPageTest();
	}

	@BeforeTest
	public void beforeTest() {
		inicioSesionPage = new InicioSesionPage(driver);
		driver = inicioSesionPage.chromeDriverConection();
		inicioSesionPage.visit("https://www.netflix.com/ar/");

	}

	@AfterTest
	public void afterTest() {
		 driver.quit(); 
	}

}