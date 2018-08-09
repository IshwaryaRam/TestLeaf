package myntraPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;

public class SunGlassesPage extends ProjectMethodsForMyntra{

	public SunGlassesPage() {
		PageFactory.initElements(driver, this);
	}

	//select green color
	@FindBy(how=How.XPATH, using="(//label[@class='colour-label'])[4]")
	private WebElement elegreenColor;
	@And("Click on Green color")
	public SunGlassesPage clickGreenColor() {
		click(elegreenColor);
		return this;
	}

	//select 2nd product
	@FindBy(how= How.XPATH, using="(//div[@class='product-brand'])[2]")
	private WebElement eleSecondProduct;
	@And("Select 2nd product")
	public SunGlassesPage SecondProduct() {
		click(eleSecondProduct);
		return this;
	}

	//select 2nd product- for 2nd time
	@FindBy(how= How.XPATH, using="(//span[@class='product-discountedPrice'])[2]")
	private WebElement eleSecondProductClick;
	@And("Select the 2nd product for 2nd time")
	public BuyProductPage clickSecondProduct() {
		click(eleSecondProductClick);
		return new BuyProductPage();
	}



}
