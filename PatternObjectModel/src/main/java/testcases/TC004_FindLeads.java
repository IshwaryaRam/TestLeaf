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

public class TC004_FindLeads extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC004_FindLeads";
		testDescription="Finding leads in find leads page";
		testNodes="Leads";
		category="sanity";
		authors="Ishwarya";
		browserName="chrome";
		dataSheetName="TC004_FindLeadData";


	}

	@Test(dataProvider="fetchData")
	public void findLeads(String uName,String pwd, String cName, String fName, String lName, String firstNameLead) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
	.clickCRMSFA()
	.clickLeads()
	.clickFindLeads()
	.enterLeadFirstName(firstNameLead)
	.ClickFindLeadsBtn()
	.clickFirstResult();
	
	}


}

