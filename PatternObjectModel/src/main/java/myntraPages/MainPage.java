package myntraPages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class MainPage extends ProjectMethodsForMyntra{

	public MainPage() {
		PageFactory.initElements(driver,this);
	}

	//search product
	@FindBy(how=How.XPATH,using="//input[@class='desktop-searchBar']")
	private WebElement eleSearch;
	@Given("Launch site and search product as (.*)")
	//@Given("Launch site and search product  as (.*)")
	public MainPage searchProduct(String searchName) {
		type(eleSearch,searchName);
		return this;
	}

	//click on search button
	@FindBy(how=How.XPATH, using="//a[@class='desktop-submit']")
	private WebElement eleSearchButton;
	@And("Click on search button")
	public SunGlassesPage searchButton() {
		click(eleSearchButton);
		return new SunGlassesPage();
	}

}
