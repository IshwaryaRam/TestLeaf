package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.When;
import wdMethods.ProjectMethods;

public class DuplicateLeadsPage extends ProjectMethods{
	
	public DuplicateLeadsPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	
	//create lead button in duplicateLeads page
	@FindBy(how= How.NAME,using ="submitButton")
	private WebElement eleCreateLeadBtn;
	
	@When("Click on create lead button to add duplicate record")
	public ViewLeadsPage clickCreateLeadBtn() {
		click(eleCreateLeadBtn);
		return new ViewLeadsPage();
	}
	
	
	
	
	
	
	

}
