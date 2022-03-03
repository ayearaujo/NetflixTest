package com.project.POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidarTituloPage extends Base{

	public ValidarTituloPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
		
		By initTitle = By.xpath("/html/head/title");
		
			
		public void validarTituloTest() throws Exception {
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait (3, TimeUnit.SECONDS);
			
						
			if(!isDisplayed(initTitle)){
				System.out.println("El título de la página es el correcto.");
			}	
			if (isDisplayed(initTitle)) {
				System.out.println("No se encuentra el título especificado.");
			}	
			
	}

}
