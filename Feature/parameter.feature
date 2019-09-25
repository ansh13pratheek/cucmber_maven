Feature: Login Feature

	Scenario Outline: User enters Username and Password
		Given The login page  opened
		When  Enters "<username>" as username and "<password>" as password
		When Clicks Login button
		Then finds a testmeapp homepage
		
Examples:
	|username|password   |
	|Lalitha |password123|
	|admin   |password456|