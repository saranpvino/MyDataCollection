@editleads
Feature: Edit lead functionality
#Background:
#Given Open the Chrome Browser
#And Load the application 'http://leaftaps.com/opentaps/'

@login @editlead
Scenario Outline: EditLead with mandatory informations
Given Enter username as 'Demosalesmanager'
And Enter password as 'crmsfa'
When Click on Login button
Then Title should be matching with 'Leaftaps - TestLeaf Automation Platform'
When Click on 'CRM/SFA' link
Then 'My Home' Page should be displayed
When Click on 'Leads' link
Then 'My Leads' Page should be displayed

When Click on 'Find Leads' link
Then 'Find Leads' Page should be displayed
When Click this 'Phone' Link
Then Enter Updated Phone Number <phonenumber>
When Click 'Find Leads' Button
Then Click First Lead Id
When Click on 'Edit' link
Then Enter Updated Company Name <companyname>
When Click Submit Button 
Then 'View Lead' Page should be displayed

Examples: 
|companyname|phonenumber|
|'Test'|'98'|
