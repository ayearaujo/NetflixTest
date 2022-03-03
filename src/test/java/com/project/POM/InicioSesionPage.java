package com.project.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InicioSesionPage extends Base {

	public InicioSesionPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	By singInbutton = By.xpath("//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[1]/div/a");
	By loginTitle = By.xpath("//title[text()='Netflix')]");
	By iniciarSesionText = By
			.xpath("#appMountPoint > div > div.login-body > div > div > div.hybrid-login-form-main > h1");
	By facebookLogin = By.linkText("Iniciar sesión con Facebook");

	public void startSessionPageTest() throws Exception {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		click(singInbutton);

		if (isDisplayed(loginTitle)) {
			throw new Exception("Error: No se cambió el título");
		}
		if (isDisplayed(iniciarSesionText)) {
			throw new Exception("Error: No se visualiza el inicio dentro de los h1");
		}
		if (isDisplayed(facebookLogin)) {
			throw new Exception("Error: No se visualiza el inicio de Facebook");
		}
	}

}