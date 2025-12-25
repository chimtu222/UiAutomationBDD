#Feature: Sign In Features For Log in 
 #
#Background: Open The url  
#Given I Open The url for made in china
#
  #Scenario: Log in Through FaceBook Validate
    #When I hover on Sign in Icon
    #And I Click on Sign in button after hovering
    #And I Click on Sign in button below the Form
    #Then I verify Email field Warn Text
    #And I verify Password field Warn Text
    #When I Click on FaceBook icon 
    #Then I verify the facebook Log in Page and take a screenshot
#
#
#	Scenario: Log in Through Forgot Password Validate
    #When I hover on Sign in Icon in the header
    #And I Click on Sign in button
    #And I Click on Sign in button without filling the fields
    #Then I verify Email field Warn Text for validation
    #And I verify Password field Warn Text for validation
    #When I Click on Forgot Password link 
    #Then I verify the Forgot Password result Page and take a screenshot