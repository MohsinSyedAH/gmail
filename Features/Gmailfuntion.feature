
Feature: Gmail automation

Scenario: test the compose function in Gmail

Given Launch browser and Navigate to "https://accounts.google.com/signin" gmail login page
When User Enter Valid email "<Gmail>" and click on next
And User Enter Valid password "<Password>" and click on next
When Default gmail homepage display after login
And User click on Compose button on Default gmail homepage
And Window popup for Compose email
Then user Enter "<Subject>" in subject text area and Enter "<Body>" in body textarea

Examples:

|Gmail					|	Password		|	Subject		|	Body															|
|abcd@gmail.com	|	abcdef@123	|	Incubyte	|	Automation QA test for Incubyte		|