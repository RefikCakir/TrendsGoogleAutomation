
@TrendsGoogle
Feature: As a user,I should be able to compare two elements in trends.google

  Scenario: User should be able to compare popularity between 'Selenium WebDriver' and 'Javascript WebDriverIO'
	Given user is on the home page
	When  user enter "Selenium WebDriver" in input box
	Then  user navigates to "Explore" page
	And   user enter "Javascript WebDriverIO" to the +Compare field
	Then  user should be on compare page
	And   user select filters
	And   user select compare breakdown by metro
	Then  user verify percentual ratio