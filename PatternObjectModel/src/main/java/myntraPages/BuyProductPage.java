package myntraPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BuyProductPage extends ProjectMethodsForMyntra{

	public BuyProductPage() {
		PageFactory.initElements(driver, this);
	}
	
	//get product name
	@FindBy(how=How.XPATH, using="//h1[@class='pdp-title']")
	private WebElement eleProductName;
	public String productName() {
				return getText(eleProductName);
	}
	
	//get product price
	@FindBy(how=How.XPATH, using="//strong[@class='pdp-price']")
	private WebElement eleProductPrice;
	public String productPrice() {
		return getText(eleProductPrice);
	}
	
	//click on add to bag button
	@FindBy(how= How.XPATH, using="//span[text()='ADD TO BAG']")
	private WebElement eleAddToBag;
	public BuyProductPage clickAddToBag() throws InterruptedException {
		click(eleAddToBag);
		Thread.sleep(2000);
		return this;
	}
	
	//click on go to bag button
	@FindBy(how= How.XPATH, using="//span[text()='GO TO BAG']")
	private WebElement eleGoToBag;
	public ShoppingBagPage clickGoToBag() {
		click(eleGoToBag);
		return new ShoppingBagPage();
	}
}
