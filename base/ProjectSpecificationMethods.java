package com.marathon.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

import com.marathon.utils.ReadExcelData;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class ProjectSpecificationMethods {
	
	public ChromeDriver driver;
	public String fileName;
	public Properties prop;
	public Shadow shadow;
	public static String text2;
	
	public void precondition() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		prop =  new Properties();		
		FileInputStream fis = new FileInputStream("./src/test/resources/config.properties");
		prop.load(fis);
		String url = prop.getProperty("url");
		driver.get(url);
		
		/*
		 * String lang = prop.getProperty("lang");
		 * 
		 * prop1 = new Properties(); FileInputStream fis1= new
		 * FileInputStream("./src/test/resources/Englis.properties"); prop1.load(fis1);
		 */
		
					
		//3. Click All
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//div[@id='all']").click();
		
		//4.Click  Incidents in Filter navigator
		shadow.findElementByXPath("//span[text()='Incidents']").click();

	}
	@DataProvider(name="fetchData")
	public String[][] testData() throws IOException {
		return ReadExcelData.data(fileName);
	}

}
