package test;

import org.testng.annotations.Test;

import com.project.POM.LoginNetflixPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class LoginNetflixTest {
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