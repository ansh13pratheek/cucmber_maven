Feature: Login Feature

	Scenario: User enters Username and Password
		Given The login page is opened
		When  User enters Lalitha as username
		And  User enters password123 as password
		Then User will find a testmeapp homepage