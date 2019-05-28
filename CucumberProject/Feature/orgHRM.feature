Feature: Admin login and Logout Test

	Scenario: Login Test
		Given launch the browser and navigate to url
		When user enter username and password
		And click on login
		Then redirected to admin page and should display welcome link
	
	Scenario: Logout Test
		When User clicks on welcome link
		And also clicks on logout
		Then oraghrm login page displayed