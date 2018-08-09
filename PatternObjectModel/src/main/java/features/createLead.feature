Feature: Create leads 

@Smoke
Scenario Outline: Create new leads in createLead page for positive flow 

	And Enter username as <uName>
	And Enter password as <pwd> 
	And Click login button 
	And Click in crmsfa link 
	And Click in leads tab
	And Click on Create lead 
	And Enter company Name as <cName> in createLeads page
	And Enter first name as <fName> in createLeads page 
	And Enter last name as <lName> in createLeads page 
	When Click on create lead button 
	
	
	Examples: 
		|uName|pwd|cName|fName|lName|
		|DemoSalesManager|crmsfa|TestLeaf|Ishwarya|Ram|
#		|DemoCSR|crmsfa|TestLeaf|Haritha|Ram|
		
@Regression @Sanity
Scenario Outline: Login for negative flow 

	And Enter username as <uName>
	And Enter password as <pwd> 
	When Click login button for negative flow	
	Then Verify login is failed
	
	
	Examples: 
		|uName|pwd|
		|DemoSalesManager1|crmsfa|
		|DemoCSR|crmsfa1|
		

	
