package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.*;

import pages.CreateLeadsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeadsPage;
import pages.ViewLeadsPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLeads extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC003_CreateLeads";
		testDescription="Create new leads";
		testNodes="Leads";
		category="sanity";
		authors="Ishwarya";
		browserName="chrome";
		dataSheetName="TC003_CreateLeadData";


	}

	@Test(dataProvider="fetchData")
	public void createLeads(String uName,String pwd, String cName, String fName, String lName) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
	.clickCRMSFA()
	.clickLeads()
	.clickCreateLeads()
	.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLeadButton();
	
	}


}

