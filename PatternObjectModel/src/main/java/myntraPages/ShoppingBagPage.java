package myntraPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ShoppingBagPage extends ProjectMethodsForMyntra{

	public ShoppingBagPage() {
		PageFactory.initElements(driver, this);
	}
	
	//verify product name
	@FindBy(how= How.XPATH, using ="//a[@class='c-gray']")
	private WebElement eleVerifyProductName;
	public ShoppingBagPage verifyProductName() {
	//verifyExactText(eleVerifyProductName,productName);
		verifyPartialText(eleVerifyProductName, "Carrera Unisex Polarised Oval Sunglasses");
	//	verifyPartialText(eleVerifyProductName, productName);
		return this;
	}
	
	//verify product price
		@FindBy(how= How.XPATH, using ="//div[text() ='Rs. 9,441']")
		private WebElement eleVerifyProductPrice;
		public ShoppingBagPage verifyProductPrice() {
		//	verifyExactText(eleVerifyProductPrice,)
			return this;
		}
}
