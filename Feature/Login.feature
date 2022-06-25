Feature: Login functionality for leaftaps application.

Background:
Given Open the Chrome browser
And Load the application url 'http://leaftaps.com/opentaps'

Scenario Outline: Login with positive credentials.
Given Enter the username as <username>
And Enter the password as <password>
When Click on login button
Then Homepage should be displayed

Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

Scenario: Login with negative credentials.
Given Enter the username as 'Demo'
And Enter the password as 'crmsfa'
When Click on login button
But Error Message should be displayed