Feature: Duplicate leads

Scenario Outline: Duplicate the lead from find leads window
 
And Enter username as <uName>
And Enter password as <pwd>
And Click login button 
And Click in crmsfa link 
And Click in leads tab
And Click on find leads
And Click on phone tab
And Enter the phone value as <ph> in findLeads page
And Click on find leads button
And Click on 1st search result value in findLeads page
And Click on duplicate button
When Click on create lead button to add duplicate record

Examples:
|uName|pwd|ph|
|DemoSalesManager|crmsfa|2|






