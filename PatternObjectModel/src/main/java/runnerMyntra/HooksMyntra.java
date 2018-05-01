package runnerMyntra;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import myntraPages.ProjectMethodsForMyntra;
import wdMethods.ProjectMethods;

public class HooksMyntra extends ProjectMethodsForMyntra{

	@Before
	public void before(Scenario sc) {
		startResult();

		
		startTestModule("TC01 Myntra search","Search product and verify name and price");
		System.out.println(sc.getName());
		test = startTestCase("Myntra search product");
		test.assignCategory("Smoke");
		test.assignAuthor("Ishu");
		startApp("chrome");	
		
	
		
	}
	
	@After
	public void after(Scenario sc) {
		System.out.println(sc.getStatus());
		closeAllBrowsers();
		endResult();
	}
	
}
