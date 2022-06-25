Feature: Login functionality for leaftaps application.

Background:
Given Open the Chrome browser
And Load the application url 'http://leaftaps.com/opentaps'

Scenario Outline: Login with negative credentials.
Given Enter the username as <username>
And Enter the password as <password>
When Click on login button
But Error Message should be displayed

Examples:
|username|password|
|'Sri'|'crmsfa'|
|'Priya'|'crmsfa'|