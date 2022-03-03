package com.project.POM;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class loginNetflixTest {
	private WebDriver driver;
	LoginNetflixPage loginNetflixPage; 
	
  @Test
  public void test() throws Exception {
	  loginNetflixPage.loginToNetflixErrorTest();
  }
  
  @BeforeTest
  public void beforeTest() {
	  loginNetflixPage = new LoginNetflixPage(driver);
	  driver = loginNetflixPage.chromeDriverConection();
	  loginNetflixPage.visit("https://www.netflix.com/ar/Login");
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }


}