Feature: Facebook Login

Scenario: Positive Login	
    Given I am on Facebook Login Page
    When I provide postive id and password
    Then I should see the Facebook feed homepage
    Then Close the browser
    
    
    
#Scenario: Negative Login	
#    Given I am on Facebook Login Page
#    When I provide negative id and password
#    Then I should not see the Facebook feed homepage
#    
#
#
#Scenario: Log out
#	Given I am on Facebook feed page
#	When I click the logout button
#	Then I should see the log out confirmation.  