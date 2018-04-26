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

public class TC006_DuplicateLeads extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC006_DuplicateLeads";
		testDescription="Duplicate leads from find leads page";
		testNodes="Leads";
		category="sanity";
		authors="Ishwarya";
		browserName="chrome";
		dataSheetName="TC006_DuplicateLeadData";


	}

	@Test(dataProvider="fetchData")
	public void duplicateLeads(String uName,String pwd, String phNo, String firstNameLead) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
	.clickCRMSFA()
	.clickLeads()
	.clickFindLeads()
	.enterLeadFirstName(firstNameLead)
	.ClickFindLeadsBtn()
	.clickFirstResult()
	.clickDuplicateLead()
	.clickCreateLeadBtn();
	
	
	
	}


}

