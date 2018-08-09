Feature: Merge leads

Scenario Outline: Merging from and to lead
 
And Enter username as <uName>
And Enter password as <pwd>
And Click login button 
And Click in crmsfa link 
And Click in leads tab
And Click on merge leads
And Click on from lead icon
And Enter last name as <lName1> in switchWindow page
And Click on Find leads button
And Get the 1st search result id for from lead from SwitchWindow page
And Click on 1st search result from Merge Leads page
And Click on to lead icon
And Click on phone tab from SwitchWindow page
And Enter the phone value as <phNo> from SwitchWindow page
And Click on Find leads button
And Get the 1st search result id for to lead from SwitchWindow page
And Click on 1st search result from Merge Leads page
And Click on merge button
And Click on confirm alert



Examples:
|uName|pwd|lName1|phNo|
|DemoSalesManager|crmsfa|ha|2|






