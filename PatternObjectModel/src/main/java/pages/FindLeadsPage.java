package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{

	public FindLeadsPage() {		
		PageFactory.initElements(driver,this);
	}	

	//lead id in find leads page
	@FindBy(how= How.XPATH,using ="//input[@name='id']")
	private WebElement eleLeadID;

	@And("Enter the lead ID value as (.*) in findLeads page")
	public FindLeadsPage enterLeadId(String leadID) {
		type(eleLeadID, leadID);
		return this;
	}
	
	//first name in find leads
	@FindBy(how= How.XPATH,using ="(//input[@name='firstName'])[3]")
	private WebElement eleLeadfirstName;
	
	@And("Enter the first name as (.*) in findLeads page")
	public FindLeadsPage enterLeadFirstName(String fname) {
		type(eleLeadfirstName, fname);
		return this;
	}

	
	//company name in find leads
	@FindBy(how= How.XPATH, using="(//input[@name='companyName'])[2]")
	private WebElement eleLeadCompanyName;
	
	@And("Enter company name as (.*) in findLeads page")
	public FindLeadsPage enterLeadCompanyName(String cName) {
		type(eleLeadCompanyName, cName);
		return this;
	}
	
	//phone tab
	@FindBy(how= How.XPATH, using= "//span[text()='Phone']")
	private WebElement elePhoneTab;

	@And("Click on phone tab")
	public FindLeadsPage clickPhone() {
		click(elePhoneTab);
		return this;
	}

	@FindBy(how= How.XPATH, using = "//input[@name='phoneNumber']")
	private WebElement elePhoneNumber;

	@And("Enter the phone value as (.*) in findLeads page")
	public FindLeadsPage enterPhoneNumber(String data) {
		type(elePhoneNumber,data);
		return this;
	}	
	
	//click on find lead button	
	@FindBy(how=How.XPATH, using ="//button[text()='Find Leads']")
	private WebElement eleFindLeadsBtn;

	@And("Click on find leads button")
	public FindLeadsPage ClickFindLeadsBtn() {
		click(eleFindLeadsBtn);
		return this;
	}


	@FindBy(how=How.XPATH,using="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleFirstResult;

	@And("Click on 1st search result value in findLeads page")
	public ViewLeadsPage clickFirstResult() {
		clickWithNoSnap(eleFirstResult);
		return new ViewLeadsPage();
	}

	
	@FindBy(how=How.XPATH, using= "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")
	private WebElement eleGetFirstResult;

	@And("Verify the given value in findLeads page")
	public FindLeadsPage getFirstSearchResult() {
		getText(eleGetFirstResult);
		return this;
	}


	public FindLeadsPage captureLeadID(int firstResLeadId) {
		return this;
	}

	/*public FindLeadsPage captureLeadID1() {
		return String;
	}*/

	
	
}
