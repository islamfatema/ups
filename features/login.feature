

Feature: UPS Login feature 

 
Scenario: UPS login scenario
Given user is home page of ups.com
When user click on log in
And user enter islamfatema88@yahoo.com into username text fields
And user enter test1234 into password text fields
And user click on login
Then user is on home page
