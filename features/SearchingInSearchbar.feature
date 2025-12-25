#
#Feature: Searching In Search Bar
#
#Background: Open The url  
#Given I Open The url for made in china
#
#Scenario: Searching Valid Products in Search Bar
    #When I Click on Search bar for searching Valid Product
    #And I pass a Valid Product "Shoes"
    #And I Click on the Search icon after passing valid product
    #And I click on the First Product 
    #Then I validate Valid Product Result Page and take a Screenshot
    #
#Scenario: Searching inValid Products in Search Bar
    #When I click on the search bar for searching inValid Product
    #And I pass "hgggivs" in the search bar
    #And I click on the search button after passing invalid Product
    #Then I validate the the Result page and took a screenshot
    #
#Scenario: Searching some part of Products in Search Bar and choose from suggestions
    #When I click on the search bar
    #And I pass a partial part "Mob" into search bar
    #And I double click on the first Suggestion
    #And I click on the Smart Phone filter
    #And I Click on the First Smart Phone Link
    #And I Click on Contact Supplier button
    #Then I verify the SmartPhone Result Page and took a screenshot
