package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class OpenTapsCRMPage extends ProjectMethods{
	
	public OpenTapsCRMPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	
@FindBy(how=How.XPATH, using= "(//input[@class='smallSubmit'])[1]")
private WebElement eleUpdateButton;

@And("Click on Update button")
public ViewLeadsPage clickUpdateButton() {
	click(eleUpdateButton);
	return new ViewLeadsPage();
}

@FindBy(how= How.ID,using = "updateLeadForm_companyName")
private WebElement eleUpdateCompanyName;

@And("Enter new company name as (.*)")
public OpenTapsCRMPage enterUpdateCompanyName( String data) {
	type(eleUpdateCompanyName,data);
	return this;
}	
	
@FindBy(how= How.ID,using = "updateLeadForm_firstName")
private WebElement eleUpdateFirstName;

@And("Enter new first name")
public OpenTapsCRMPage enterUpdateFirstName( String data) {
	type(eleUpdateFirstName,data);
	return this;
}	

@FindBy(how= How.ID,using = "updateLeadForm_lastName")
private WebElement eleUpdateLastName;

@And("Enter new last name")
public OpenTapsCRMPage enterUpdateLastName( String data) {
	type(eleUpdateLastName,data);
	return this;
}	
	
	
	

}
