package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.*;

import pages.CreateLeadsPage;
import pages.FindLeadsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeadsPage;
import pages.ViewLeadsPage;
import wdMethods.ProjectMethods;

public class TC007_DeleteLeads extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC007_DeleteLeads";
		testDescription="Delete leads from find leads page";
		testNodes="Leads";
		category="sanity";
		authors="Ishwarya";
		browserName="chrome";
		dataSheetName="TC007_DeleteLeadData";


	}

	@Test(dataProvider="fetchData")
	public void deleteLeads(String uName,String pwd, String firstNameLead) {
		
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
	.clickDeleteLead();
	/*.clickFindLeads()
	.enterLeadFirstName(firstNameLead)
.clickFindLeadsButton()
*/
		
		
	/*	
		FindLeadsPage flp= new LoginPage(driver, test)
				.enterUserName(uName)
						.enterPassword(pwd)
		new LoginPage()
		.clickLogIn()
	.clickCRMSFA()
	.clickLeads()
	.clickFindLeads();
			.enterLeadFirstName(firstNameLead)
	.clickDuplicateLead()
	.clickCreateLeadButton()
	.clickDeleteLead()
	.clickFindLeads()
	//.captureLeadID(firstResLeadId) //enter deleted id
	.clickFindLeadsButton();
		//flp.clickFirstResult()
	//.enterLeadId(captureLeadID1)
	.verifyfirstname("No Records to display");
	
		enterLeadfirstName(firstNameLead)
		.clickFindLeadsButton()
		int captureLeadID1= flp.getFirstSearchResult()
		flp.clickFirstResult()*/

	
	
	
	}


}

