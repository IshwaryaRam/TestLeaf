package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.*;

import pages.CreateLeadsPage;
import pages.FindLeadsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeadsPage;
import pages.SwitchWindow;
import pages.ViewLeadsPage;
import wdMethods.ProjectMethods;

public class TC008_MergeLeads extends ProjectMethods{

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
	public void MergeLeads(String uName,String pwd, String fromLead, String toLead) {
		String fromLeadID = new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCRMSFA()
		.clickLeads()
		.clickMergeLeads()
		.clickFromLeadIcon()
		.enterSwitchLeadID(fromLead)
		.clickFindLeadsBtn1()
		.getTextFirstFromLead1();
		String toLeadID = new SwitchWindow()
		.clickFirstLeadResult1()
		.clickToLeadIcon1()
		.enterSwitchLeadID(toLead)
		.clickFindLeadsBtn1()
		.getTextFirstToLead1();
		new SwitchWindow()
		.clickFirstLeadResult1()
		.clickMergeBtn()
		.acceptAlert();
		
		

	}


}

