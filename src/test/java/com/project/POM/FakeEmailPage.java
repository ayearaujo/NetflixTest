package com.project.POM;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FakeEmailPage extends Base {

	public FakeEmailPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public String getSaltString() {
		String SALTCHARS = "abcdefghijklmnopqrstuvwxyz1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 10) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString() + "@gmail.com";
		return saltStr;
	}

	By emailSelector = By.name("email");
	By startBtnSelector = By.className("cta-btn-txt");
	By urlSingUp = By.linkText("nflx://www.netflix.com/signup/registration?locale=es-AR");

	public void fakeEmailTest() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		type(getSaltString(), emailSelector);
		click(startBtnSelector);
		System.out.println("E-mail aleatorio generado: "+ getSaltString());
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		String url = driver.getCurrentUrl();
		int intIndex = url.indexOf("singup");

		if (intIndex == -1) {
			System.out.println("Palabra SingUp encontrada");
		} else {
			System.out.println("Palabra SingUp no encontrada" + intIndex);
		}

	}

};