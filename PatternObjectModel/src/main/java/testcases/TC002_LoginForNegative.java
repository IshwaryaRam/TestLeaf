package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_LoginForNegative extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC002_LoginForNegative";
		testDescription="Login For Failer";
		testNodes="Leads";
		category="Smoke";
		authors="Ishwarya";
		browserName="chrome";
		dataSheetName="TC002";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void loginAndLogoutNegativeFlow(String uName,String pwd,String errMsg) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogInForFailer()
		.verifyErrorMsg(errMsg);
				
	}

}
