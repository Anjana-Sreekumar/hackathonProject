package com.hackathon.insurance.base;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

public class InsuranceList extends PageBaseClass {
	
	public InsuranceList(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
	}

	public void sortList() {
		selectElementByText("sortList_Xpath","Price: Low to High");
	}
	
	public void selectTopThree() {
		List<WebElement> lowestPrice = getElementsList("priceList_Xpath");
		List<WebElement> insuranceProvider = getElementsList("companyList_Xpath"); 
		Iterator<WebElement> priceIterator = lowestPrice.iterator();
		Iterator<WebElement> providerIterator = insuranceProvider.iterator();
		while (priceIterator.hasNext() && providerIterator.hasNext()) {
			WebElement priceElement = (WebElement) priceIterator.next();
			WebElement providerElement = (WebElement) providerIterator.next();
			System.out.print(providerElement.getAttribute("class").replace("Logo", ""));
			System.out.print(" - "+priceElement.getText().replace("₹ ", ""));
			System.out.println();
		}
		
		
	}
	public void selectEditCountrySearch( String country) {
//		excel = new ReadExcelFile(System.getProperty("user-dir")+"\\test-output\\data-sheet.xlsx");
		//String country = excel.getCellData("Input-data", colNum, rowNum);
		enterText("editCountry_Xpath",  country);
		addWait(10);
		String countryCapitalize = country.substring(0,1).toUpperCase() + country.substring(1);
		driver.findElement(By.xpath(prop.getProperty("editCountry_Xpath").replace("Germany",countryCapitalize))).click();
		
	}
}
