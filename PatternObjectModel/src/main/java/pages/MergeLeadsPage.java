package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods{

	public MergeLeadsPage() {		
		PageFactory.initElements(driver,this);
	}	

	//from lead icon
	@FindBy(how= How.XPATH, using="(//img[@alt='Lookup'])[1]")
	private WebElement eleFromLeadIcon;

	@And("Click on from lead icon")
	public SwitchWindow clickFromLeadIcon() {
		clickWithNoSnap(eleFromLeadIcon);
		switchToWindow(1);
		return new SwitchWindow();
	}

	//to lead icon
	@FindBy(how= How.XPATH, using= "(//img[@alt='Lookup'])[2]")
	private WebElement eleToLeadIcon1;

	@And("Click on to lead icon")
	public SwitchWindow clickToLeadIcon1(){
		clickWithNoSnap(eleToLeadIcon1);
		switchToWindow(1);
		return new SwitchWindow();
	}

	//merge button
	@FindBy(how=How.XPATH, using="//a[@class='buttonDangerous']")
	private WebElement eleMergeLeadBtn;

	@And("Click on merge button")
	public MergeLeadsPage clickMergeBtn(){
		clickWithNoSnap(eleMergeLeadBtn);
		return this;
	}

	//accept alert
	@And("Click on confirm alert")
	public ViewLeadsPage confirmAlert(){
		acceptAlert();
		return new ViewLeadsPage();
	}

	
	
}
