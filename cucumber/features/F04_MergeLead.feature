@mergeleads
Feature: Merge lead functionality
#Background:
#Given Open the Chrome Browser
#And Load the application 'http://leaftaps.com/opentaps/'

@login @mergelead
Scenario: MergeLead with mandatory informations
Given Enter username as 'Demosalesmanager'
And Enter password as 'crmsfa'
When Click on Login button
Then Title should be matching with 'Leaftaps - TestLeaf Automation Platform'
When Click on 'CRM/SFA' link
Then 'My Home' Page should be displayed
When Click on 'Leads' link
Then 'My Leads' Page should be displayed

When Click on 'Merge Leads' link
Then 'Merge Leads' Page should be displayed
When Click image1 Link 'Saran'
And Click image2 Link 'Devi'
And Click Merge link
And Click on 'Find Leads' link
Then Enter Merged Lead Id
When Click 'Find Leads' Button
Then 'Find Leads' Page should be displayed
