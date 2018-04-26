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

public class TC005_EditLeads extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC005_EditLeads";
		testDescription="Edit leads from find leads page";
		testNodes="Leads";
		category="sanity";
		authors="Ishwarya";
		browserName="chrome";
		dataSheetName="TC005_EditLeadData";


	}

	@Test(dataProvider="fetchData")
	public void editLeads(String uName,String pwd, String cName, String fName, String lName, String firstNameLead, 
			String phNo, String updateCName, String updateFName, String updateLName) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
	.clickCRMSFA()
	.clickLeads()
	.clickFindLeads()
	.clickPhone()
	.enterPhoneNumber(phNo)
	.ClickFindLeadsBtn()
	.clickFirstResult()
	.clickEditLeadButton()
	.enterUpdateCompanyName(updateCName)
	.enterUpdateFirstName(updateFName)
	.enterUpdateLastName(updateLName)
	.clickUpdateButton()
	.verifyCompanyName(updateCName)
	.verifyFirstName(updateFName)
	.verifyLastName(updateLName);
	
	
	}


}

