Feature: Exploring All Categories Products

Background: Open The url  
Given I Open The url for made in china

  Scenario: Computer Products 
    When I hover On All Categories Section
    And I Click On Computer Products Link
    And I hover on Computer Menu
    And I click on Tablet PC
    Then I validate the TabletPC Result Page and take a Screenshot

  Scenario: Electrical and Electronics Products
    When I hover On All Categories Menu
    And I Click On Electrical and Electronics Link
    And I hover on Motors Section
    And I Click on DC Motor Link
    And I Click on DC Gear Motor button
    Then I Verify The Filtered DC Gear Motor Result Page and take a Screenshot
    