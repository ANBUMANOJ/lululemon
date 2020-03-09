Feature: Lulelemon website testing functionality

  Background: 
    #Given User initialize the browser
    When User enter the lululemon url
    
		@01
  Scenario: Create Account functionality
    Then User click the sign in button
    And User create an account with email id
    And User create a password for the account
    Then User click the create an account button
    Then User check whether the email already in use header is displayed

		@02
  Scenario: Signin functionality
  	Then User click the sign in button
    And User enter the email id
    And User enter the password
    Then User click the signin button
    Then User logout from the application

		@03
  Scenario: Forget Password functionality
  	Then User click the sign in button
    And User click the forget password link
    And User the email id for reseting the password
    Then User click the reset button
    
    @04
 	Scenario: Header visibility
 	  Then User check whether the primary header is displayed
 	 	
 	 	@05
 	Scenario: Place order functionality
 		Then User click the sign in button
 		And User enter the email id
 	  And User enter the password
 	  Then User click the signin button
 	  Then User enter the product in the search box
 	  Then User select the product
 	  And User select the colour of the product
 	  And User select the size of the product
 	  And User click the add to bag button
 	  And User click the check out button
 	  And User select the country
 	  Then User enter the first name
 	  And User enter the last name
 	  And User enter the shipping address
 	  And User enter the city
 	  And User enter the country zip code
 	  And User enter the phone number
 	  And User enter the shipping address nick name
 	  Then User click the save address to my account button
 	  And User enter the card name
 	  And User enter the card number
 	  And User enter the security code of the card
 	  And User enter the expiry month of the card
 	  And User enter the expiry year of the card
 	  And User enter the nick name for the card
 	  Then User click the same as shipping address
 	  Then User click the continue to review button
 	  
 	  
 	  
 	  
 	  
 	  
 	  
 		
 		