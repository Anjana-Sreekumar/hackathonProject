package com.hackathon.insurance.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.hackathon.insurance.base.BasicAutomation;
import com.hackathon.insurance.base.HomePage;
import com.hackathon.insurance.base.InsuranceList;
import com.hackathon.insurance.base.MainPageForm;
import com.hackathon.insurance.base.PageBaseClass;

public class TestClass extends BasicAutomation {
//	@Test
//	public void testCaseOne() {
//		logger = report.createTest("Test Case One");
//		invokeBrowser("chrome");
//		PageBaseClass pageClass = new PageBaseClass(driver,logger);
//		HomePage homePage = pageClass.openWebsite();
//		MainPageForm mainPage = homePage.clickIns();
//		mainPage.selectCountry("france");
//		mainPage.addTraveller("21 yrs","22 yrs");
//		mainPage.selectDate("25/05/2021","25/06/2021");
//		InsuranceList insList = mainPage.enterPhoneDetails();
//		insList.sortList();
//		insList.selectTopThree();
//
//	}
	
	/*@Test
	public void TC001() {
		logger = report.createTest("Test Case One");
		invokeBrowser("chrome");
		PageBaseClass pageClass = new PageBaseClass(driver,logger);
		HomePage homePage = pageClass.openWebsite();
		MainPageForm mainPage = homePage.clickIns();
		addWait(10);
		mainPage.isElementPresent("getQuote_Btn_Xpath");
		mainPage.verifyPageTitle("PolicyBazaar Travel Insurance");
	}*/
	
	
	@Test
	public void TC020() {
		logger = report.createTest("Test Case Twenty");
		invokeBrowser("chrome");
		PageBaseClass pageClass = new PageBaseClass(driver,logger);
		HomePage homePage = pageClass.openWebsite();
		MainPageForm mainPage = homePage.clickIns();
		mainPage.selectCountry("france");
		mainPage.addTraveller("21 yrs","22 yrs");
		mainPage.selectDate("25/05/2021","25/06/2021");
		InsuranceList insList = mainPage.enterPhoneDetails();
		mainPage.elementClick("getQuote_Btn_Xpath");
		insList.selectEditCountrySearch("Germany");
		insList.elementClick("editApply_Xpath");
	}
	public void TC021() {
		logger = report.createTest("Test Case TwentyOne");
		invokeBrowser("chrome");
		PageBaseClass pageClass = new PageBaseClass(driver,logger);
		HomePage homePage = pageClass.openWebsite();
		MainPageForm mainPage = homePage.clickIns();
		mainPage.selectCountry("france");
		mainPage.addTraveller("21 yrs","22 yrs");
		mainPage.selectDate("25/05/2021","25/06/2021");
		InsuranceList insList = mainPage.enterPhoneDetails();
	
	}
	public void TC022() {
		logger = report.createTest("Test Case TwentyTwo");
		invokeBrowser("chrome");
		PageBaseClass pageClass = new PageBaseClass(driver,logger);
		HomePage homePage = pageClass.openWebsite();
		MainPageForm mainPage = homePage.clickIns();
		mainPage.selectCountry("france");
		mainPage.addTraveller("21 yrs","22 yrs");
		mainPage.selectDate("25/05/2021","25/06/2021");
		InsuranceList insList = mainPage.enterPhoneDetails();
	}
	@Test
	public void TC023() {
		logger = report.createTest("Test Case TwentyThree");
		invokeBrowser("chrome");
		PageBaseClass pageClass = new PageBaseClass(driver,logger);
		HomePage homePage = pageClass.openWebsite();
		MainPageForm mainPage = homePage.clickIns();
		mainPage.selectCountry("france");
		mainPage.addTraveller("21 yrs","22 yrs");
		mainPage.selectDate("25/05/2021","25/06/2021");
		InsuranceList insList = mainPage.enterPhoneDetails();
		mainPage.elementClick("getQuote_Btn_Xpath");
		insList.sortList();
		insList.selectTopThree();
	}
}