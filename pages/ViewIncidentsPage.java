package com.marathon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.marathon.base.ProjectSpecificationMethods;

public class ViewIncidentsPage extends ProjectSpecificationMethods {
	
	public ViewIncidentsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public CreateNewIncidentPage clickonNewButton() {
		WebElement eleFrame= shadow.findElementByXPath(("//iframe[@title='Main Content']"));
		driver.switchTo().frame(eleFrame);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		return new CreateNewIncidentPage(driver);
	}
	public ViewIncidentsPage verifyNewlyCreatedIncident() {
		WebElement eleFrame2 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(eleFrame2);
		WebElement numberDropDown = driver.findElement(By.xpath("//select[@class='form-control default-focus-outline']"));
		Select numberDD=new Select(numberDropDown);
		numberDD.selectByVisibleText("Number");
		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys(text2,Keys.ENTER);
		driver.switchTo().defaultContent();
		return this; 
	}
	
	public ViewIncidentsPage getNewlyCreatedIncident() {
		WebElement eleframe3 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(eleframe3);
		String text = driver.findElement(By.xpath("//a[text()='Number']/following::a[@class='linked formlink']")).getText();
		System.out.println(text); 
		return this;
	}
	public ViewIncidentsPage verifyNewlyCreatedIncidentViewPg() throws InterruptedException {
		Thread.sleep(3000);
		WebElement eleframe3 = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(eleframe3);
		String text = driver.findElement(By.xpath("//a[text()='Number']/following::a[@class='linked formlink']")).getText();
		System.out.println(text);
		return this;
		

	}
}
