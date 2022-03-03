package test;

import org.testng.annotations.Test;

import com.project.POM.FakeEmailPage;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class FakeEmailTest {
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
