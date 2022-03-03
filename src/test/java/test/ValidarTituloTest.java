package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.project.POM.ValidarTituloPage;

public class ValidarTituloTest {
	private WebDriver driver;
	ValidarTituloPage validarTituloPage;

	@Test
	public void test() throws Exception {
		validarTituloPage.validarTituloTest();
	}

	@BeforeTest
	public void beforeTest() {
		validarTituloPage = new ValidarTituloPage(driver);
		driver = validarTituloPage.chromeDriverConection();
		validarTituloPage.visit("https://www.netflix.com/ar");

	}

	@AfterTest
	public void afterTest() {
		driver.quit(); 
	}
}