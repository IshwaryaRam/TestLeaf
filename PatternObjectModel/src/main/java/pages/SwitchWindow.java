package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class SwitchWindow extends ProjectMethods {

	public SwitchWindow() {		
		PageFactory.initElements(driver,this);
	}


	//switchWindow- Lead id
	@FindBy(how= How.XPATH, using = "//input[@name='id']")
	private WebElement eleSwitchLeadID;

	@And("Enter lead id as (.*) in switchWindow page")
	public SwitchWindow enterSwitchLeadID(String data){
		type(eleSwitchLeadID, data);
		return this;
	}

	//switchWindow- last name
	@FindBy(how=How.XPATH, using="//input[@name='lastName']")
	private WebElement eleLastName1;

	@And("Enter last name as (.*) in switchWindow page")
	public SwitchWindow enterLastName1(String lName1) {
		type(eleLastName1,lName1);
		return this;
	}

	//switchWindow- first name
	@FindBy(how=How.XPATH, using="//input[@name='firstName']")
	private WebElement eleFirstName1;

	@And("Enter first name as (.*) in switchWindow page")
	public SwitchWindow enterFirstName1(String fName1) {
		type(eleFirstName1,fName1);
		return this;
	}

	//switchWindow- phone tab
	@FindBy(how= How.XPATH, using= "//span[text()='Phone']")
	private WebElement elePhoneTab1;

	@And("Click on phone tab from SwitchWindow page")
	public SwitchWindow clickPhone1() {
		click(elePhoneTab1);
		return this;
	}

	@FindBy(how= How.XPATH, using = "//input[@name='phoneNumber']")
	private WebElement elePhoneNumber1;

	@And("Enter the phone value as (.*) from SwitchWindow page")
	public SwitchWindow enterPhoneNumber1(String data) {
		type(elePhoneNumber1,data);
		return this;
	}	



	//click on find Leads button
	@FindBy(how= How.XPATH, using= "//button[text()='Find Leads']")
	private WebElement eleClickFindLeadsBtn;

	@And("Click on Find leads button")
	public SwitchWindow clickFindLeadsBtn1(){
		click(eleClickFindLeadsBtn);
		return this;
	}

	//click on 1st search result
	@FindBy(how=How.XPATH, using= "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement eleFirstLeadResult1;

	@And("Click on 1st search result from Merge Leads page")
	public MergeLeadsPage clickFirstLeadResult1(){
		clickWithNoSnap(eleFirstLeadResult1);
		switchToWindow(0);
		return new MergeLeadsPage();
	}


	//getText of 1st search result- from lead
	@FindBy(how=How.XPATH, using= "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement eleFirstFromLead;

	@And("Get the 1st search result id for from lead from SwitchWindow page")
	public String getTextFirstFromLead1(){

		return getText(eleFirstFromLead);
	}

	//getText of 1st search result- to lead
	@FindBy(how=How.XPATH, using= "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement eleFirstToLead;

	@And("Get the 1st search result id for to lead from SwitchWindow page")
	public String getTextFirstToLead1(){
	
		return getText(eleFirstToLead);
	}


}
