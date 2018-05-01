Feature: In myntra, search product and verify product name and price

Scenario: Search product in myntra site and verify product name and price

Given Launch site and search product  as sunglasses



And Click on search button
And Click on Green color
And Select 2nd product
And Select the 2nd product for 2nd time


And Get the product name
And Get the product price
And Click on Add to bag button
And Click on Go to bag button
And Verify product name

#Examples:
#|searchProduct|
#|sunglasses|