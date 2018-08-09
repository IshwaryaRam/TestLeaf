Feature: Edit leads

Scenario: Editing the lead from find leads window
 
And Enter username as DemoSalesManager
And Enter password as crmsfa
And Click login button 
And Click in crmsfa link 
And Click in leads tab
And Click on find leads
And Enter the first name as is in findLeads page
And Click on find leads button
And Click on 1st search result value
And Click on edit button
And Enter new company name as testLeaf
When Click on Update button
Then Verify companyName as testLeaf


