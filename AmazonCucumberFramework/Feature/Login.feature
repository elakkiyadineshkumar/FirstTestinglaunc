Feature: Login

Scenario: Successful login with valid credentials
	Given User Launch Chrome browser
	When User opens URL "https://www.amazon.in/" 
	Then Enter username "9962980090" "Rithik@7612" and password
	And click on login
	And close browser
	
Scenario: Verify that user name is displayed on home page or not
	Given User Launch Chrome browser
	When User opens URL "https://www.amazon.in/" 
	Then Enter username "9962980090" "Rithik@7612" and password
	And click on login
	Then validate the username "Elakkiyadineshkumar" is displayed on homepage or not
	And close browser 