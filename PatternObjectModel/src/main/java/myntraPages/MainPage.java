package myntraPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends ProjectMethodsForMyntra{

	public MainPage() {
		PageFactory.initElements(driver,this);
	}

	//search product
	@FindBy(how=How.XPATH,using="//input[@class='desktop-searchBar']")
	private WebElement eleSearch;
	public MainPage searchProduct(String searchName) {
		type(eleSearch,searchName);
		return this;
	}

	//click on search button
	@FindBy(how=How.XPATH, using="//a[@class='desktop-submit']")
	private WebElement eleSearchButton;
	public SunGlassesPage searchButton() {
		click(eleSearchButton);
		return new SunGlassesPage();
	}



}
