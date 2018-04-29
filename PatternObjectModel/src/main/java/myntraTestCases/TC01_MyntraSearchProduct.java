package myntraTestCases;


import org.testng.annotations.Test;
//import org.junit.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import myntraPages.BuyProductPage;
import myntraPages.MainPage;
import myntraPages.ProjectMethodsForMyntra;

public class TC01_MyntraSearchProduct extends ProjectMethodsForMyntra{

	@BeforeTest
	public void setData() {
		testCaseName="TC01_MyntraSearchProduct";
		testDescription="Search product and verify product name and price";
		testNodes="Myntra search";
		category="Smoke";
		authors="Ishwarya";
		browserName="chrome";
		dataSheetName="MyntraSearchExcel.xlsx";
	}

	@Test(dataProvider="fetchData")
	public void searchInMyntra(String searchProd ) throws InterruptedException {
		String productName = new MainPage()
				.searchProduct(searchProd)
				.searchButton()
				.clickGreenColor()
				.SecondProduct()
				.clickSecondProduct()
				.productName();
		String productPrice = new BuyProductPage()
				.productPrice();
		new BuyProductPage()
		.clickAddToBag()
		.clickGoToBag()
		.verifyProductName();
	}

}


