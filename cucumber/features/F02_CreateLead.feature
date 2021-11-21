@createleads
Feature: Create lead functionality
#Background:
#Given Open the Chrome Browser
#And Load the application 'http://leaftaps.com/opentaps/'

@addlead
Scenario Outline: CreateLead with mandatory informations
Given Enter username as 'Demosalesmanager'
And Enter password as 'crmsfa'
When Click on Login button
Then Title should be matching with 'Leaftaps - TestLeaf Automation Platform'
When Click on 'CRM/SFA' link
Then 'My Home' Page should be displayed
When Click on 'Leads' link
Then 'My Leads' Page should be displayed

When Click on 'Create Lead' link
Then 'Create Lead' Page should be displayed
And Enter Company Name <companyname>
And Enter First Name <firstname>
And Enter Last Name <lastname>
And Enter Phone Number <phonenumber>
When Click Submit Button
Then 'View Lead' Page should be displayed

Examples: 
|companyname|firstname|lastname|phonenumber|
|'TestLeaf'|'Saran'|'P'|'99'|
|'TestLeaf'|'Devi'|'V'|'98'|