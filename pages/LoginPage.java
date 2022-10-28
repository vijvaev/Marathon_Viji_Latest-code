package com.marathon.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.marathon.base.ProjectSpecificationMethods;

public class LoginPage extends ProjectSpecificationMethods {
	
	public LoginPage(ChromeDriver driver,Properties prop) {
		this.driver=driver;
		this.prop=prop;
	}
	
	public LoginPage enterUserName() {
		driver.findElement(By.id("user_name")).sendKeys(prop.getProperty("username"));
		return this;
			}
	
	public LoginPage enterPassword() {
		driver.findElement(By.id("user_password")).sendKeys(prop.getProperty("password"));
		return this;
	}
	
	public ServiceNowPage clickonLogin() {
		driver.findElement(By.id("sysverb_login")).click();	
		return new ServiceNowPage();
		
		
	}

	
}
