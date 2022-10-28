package com.marathon.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.marathon.base.ProjectSpecificationMethods;
import com.marathon.pages.LoginPage;

public class TC001_CreateNewIncident extends ProjectSpecificationMethods {
	
	@BeforeTest
	public void setData() {
		fileName = "TestData_CreateIncident";
	}
	
	@Test(dataProvider="fetchData")
	public void runCreateNewIncident(String short_description) throws InterruptedException {
		new LoginPage(driver,prop).enterUserName()
		.enterPassword()
		.clickonLogin()
		.clikonAll()
		.selectIncident()
		.clickonNewButton()
		.getTextofNewIncident()
		.shortDescription(short_description)
		.clickonSubmit()
		.verifyNewlyCreatedIncident()
		.getNewlyCreatedIncident()
		.verifyNewlyCreatedIncidentViewPg();
		

		
		
		
	}
	

}
