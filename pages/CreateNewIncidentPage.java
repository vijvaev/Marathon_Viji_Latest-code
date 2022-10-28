package com.marathon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.marathon.base.ProjectSpecificationMethods;

public class CreateNewIncidentPage extends ProjectSpecificationMethods {
	public CreateNewIncidentPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateNewIncidentPage getTextofNewIncident() {
		String text2 = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
		System.out.println("Inident NUmber"+text2);
		return this;
	}
	
	
	public CreateNewIncidentPage shortDescription(String short_description) {
		driver.findElement(By.id("incident.short_description")).sendKeys(short_description);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.switchTo().defaultContent();
		return this;
	}
	
	public ViewIncidentsPage clickonSubmit() {
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.switchTo().defaultContent();
		return new ViewIncidentsPage(driver);
	}
	
	
	

}
