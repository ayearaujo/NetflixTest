package com.project.POM;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginNetflixPage extends Base {

	public LoginNetflixPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	By userBoxLocator =By.id("id_userLoginId");
	By passBoxLocator = By.id("id_password");
	By registerBtnLocator = By.xpath("//button[text()='Iniciar sesión']");
	By checkRememberMe = By.id("bxid_rememberMe_true");
	By checkRememberMe2 = By.className("login-remember-me-label-text");
	By mesaggePassIncorrect = By.className("class=\"ui-message-container ui-message-error\"");
	
	public void loginToNetflixErrorTest() throws Exception {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait (3, TimeUnit.SECONDS);
		type("maxivalenzano@gmail.com",userBoxLocator);
		type("holamundo",passBoxLocator);
		click(checkRememberMe2);
		driver.manage().timeouts().implicitlyWait (3, TimeUnit.SECONDS);
		click(registerBtnLocator);
		
		if(isDisplayed(mesaggePassIncorrect)){
			throw new Exception("Error: No se emitió el mensaje de contraseña");
		}	
		
		if (isDisplayed(checkRememberMe)){
			throw new Exception("Error: El checkbox no está tildado.");
			
		}
	}

	
		
	}