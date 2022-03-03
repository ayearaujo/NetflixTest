package com.project.POM;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class fakeEmailTest {
	private WebDriver driver;
	FakeEmailPage fakeEmailTest; 
	
  @Test
  public void test() throws Exception {
	  fakeEmailTest.fakeEmailTest();
  }
  
  @BeforeTest
  public void beforeTest() {
	  fakeEmailTest = new FakeEmailPage(driver);
	  driver = fakeEmailTest.chromeDriverConection();
	  fakeEmailTest.visit("https://www.netflix.com/ar");
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

  }
