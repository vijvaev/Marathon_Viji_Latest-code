package com.marathon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.marathon.base.ProjectSpecificationMethods;

import io.github.sukgu.Shadow;

public class ServiceNowPage extends ProjectSpecificationMethods{
	
	public ServiceNowPage clikonAll() {
		shadow = new Shadow(driver);
		shadow.setImplicitWait(30);
		shadow.findElementByXPath("//div[@id='all']").click();
		return this;
	}
	
	public ViewIncidentsPage selectIncident() {
		shadow.setImplicitWait(30);
		//Click  Incidents in Filter navigator
		shadow.findElementByXPath("//span[text()='Incidents']").click();
		return new ViewIncidentsPage(driver);
	}
	
	
	
	

}
