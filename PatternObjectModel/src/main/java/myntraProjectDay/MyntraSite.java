package myntraProjectDay;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyntraSite {

	public static void main(String[] args) {
//	public void SearchProduct(){
		System.setProperty("webdriver.chrome.driver", "C:/Selenium_TestLeaf/LearnGit/PatternObjectModel/drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com");
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.titleContains("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra"));
	
	//search sunglasses
		WebElement search = driver.findElementByXPath("//input[@class='desktop-searchBar']");
		search.sendKeys("sunglasses",Keys.ENTER);
		
		//get product name
	/*	String getProduct = driver.findElementByXPath("//div[@class='product-brand']").getText();
		System.out.println("products are: "+getProduct);*/
	
		//to get all product in pages using list and get unique product using set
		List<WebElement> product= driver.findElementsByXPath("//div[@class='product-brand']");
		Set<String> uniqueProd= new TreeSet<String>();
	for(WebElement allProduct: product) {
		//System.out.println("All products: "+allProduct.getText());
		String text = allProduct.getText();
		uniqueProd.add(text);
	}
	System.out.println("Unique products: \n"+uniqueProd);
	
	/*//40% discount
	List<WebElement> disProd=	driver.findElementsByXPath("//span[text()='(40% OFF)']");
	System.out.println("discount product size are: \n"+disProd.size());
	
	//div[@class='product-productMetaInfo']
	List<WebElement> allProd = driver.findElementsByXPath("//div[@class='product-productMetaInfo']");
	int j=0;
	for (WebElement prod : allProd) {
		System.out.println(prod.getText());
		if(prod.getText().contains("Unisex") && prod.getText().contains("40%")) {
			j++;
		}
	}
	System.out.println("Unique product with 40% off: \n"+j);*/
	
	//filter green color
	driver.findElementByXPath("(//label[@class='colour-label'])[4]").click();
	
	//click on 2nd item
	driver.findElementByXPath("(//div[@class='product-brand'])[2]").click();
	
	driver.findElementByXPath("(//span[@class='product-discountedPrice'])[2]").click();
	
	//get product name
	String prodName = driver.findElementByXPath("//h1[@class='pdp-title']").getText();
	System.out.println("Product name is: "+prodName);
	
	//get price name
	String priceName = driver.findElementByXPath("//strong[@class='pdp-price']").getText();
	System.out.println("Product name is: "+priceName);
	
	//click on add to bag
	//driver.findElementByXPath("//span[text()='ADD TO BAG']").click();
	WebDriverWait wait1= new WebDriverWait(driver, 20);
	wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='ADD TO BAG']"))).click();
	
	//click go to bag
	WebDriverWait wait2= new WebDriverWait(driver, 20);
	wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='GO TO BAG']"))).click();
	//driver.findElementByXPath("//span[text()='GO TO BAG']").click();
	
	//verify product name
	String prodName1 = driver.findElementByXPath("//a[@class='c-gray']").getText();
	System.out.println(prodName1);
	
	//verify price name
	String priceName1 = driver.findElementByXPath("//div[text() ='Rs. 9,441']").getText().replace(",", "");
		
	
	if(prodName.equals(prodName1) && priceName.equals(priceName1)) {
		System.out.println("Product name and price are same");
	}else {
		System.out.println("Product name and price are different");
	}
	
	driver.close();
	
		}
}
