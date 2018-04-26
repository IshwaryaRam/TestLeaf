package testcases;

import org.testng.annotations.*;

import pages.CreateLeadsPage;
import pages.FindLeadsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeadsPage;
import pages.ViewLeadsPage;
import wdMethods.ProjectMethods;

public class TC009_AllLeadsPages extends ProjectMethods{

	@BeforeTest
	public void setData() {
		testCaseName="TC008_MergeLeads";
		testDescription="Merge leads from lead and to lead";
		testNodes="Leads";
		category="sanity";
		authors="Ishwarya";
		browserName="chrome";
		dataSheetName="TC008_MergeLeadData";


	}

	@Test(dataProvider="fetchData")
	public void MergeLeads(String uName,String pwd, String cName, String fName, String lName, String firstNameLead,
			String phNo, String updateCName, String updateFName, String updateLName, /*String firstNameLead*/
			String fromLead, String toLead) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLeads()    //create lead
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLeadButton();
		/*.clickFindLeads()  //find leads
		.enterLeadFirstName(firstNameLead)
		.clickFindLeadsButton()
		.clickFirstResult()
		.clickFindLeads()   //edit lead
		.clickPhone()
		.enterPhoneNumber(phNo)
		.clickFindLeadsButton()
		.clickFirstResult()
		.clickEditLeadButton()
		.enterUpdateCompanyName(updateCName)
		.enterUpdateFirstName(updateFName)
		.enterUpdateLastName(updateLName)
		.clickUpdateButton()
		.verifyCompanyName(updateCName)
		.verifyFirstName(updateFName)
		.verifyLastName(updateLName)
		.clickFindLeads() //duplicate leads
		.enterLeadFirstName(firstNameLead)
		.clickFindLeadsButton()
		.clickFirstResult()
		.clickDuplicateLead()
		.clickCreateLeadButton()  //delete leads
		.clickFindLeads()
		.enterLeadFirstName(firstNameLead)
		.clickFindLeadsButton()
		.clickFirstResult()
		.clickDeleteLead();
		.clickMergeLeads()  //merge leads
		.clickFromLeadIcon()
		.enterFindFromLeadID1(fromLead)
		.clickFindLeadsButton1()
		.getTextFromLeadFirstResult1()
		.clickFirstFromLeadResult1()
		.clickToLeadIcon1()
		.enterFindToLeadID1(toLead)
		.clickFindLeadsButton1()
		.getTextToLeadFirstResult1()
		.clickFirstToLeadResult1()
		.clickMergeLeadButton()
		.acceptAlert();
		
*/
	}


}

