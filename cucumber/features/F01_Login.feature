Feature: leaftaps login functionality

#Background:
#Given Open the Chrome Browser
#And Load the application 'http://leaftaps.com/opentaps/'

#Scenario Outline with Examples(Multiple uname and pwd)
@logincredential
Scenario Outline: Test with positive credential
#<username> <password> values can be taken from Examples
Given Enter username as <username>
And Enter password as <password>
When Click on Login button
Then Title should be matching with 'Leaftaps - TestLeaf Automation Platform'

Examples:
|username|password|
|'Demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

#Scenario(wrong uname and correct pwd)
@wrongcredential
Scenario: Test with negative credential
Given Enter username as 'Demo'
And Enter password as 'crmsfa'
When Click on Login button
But Error message should be displayed