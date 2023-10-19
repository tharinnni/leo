Feature: Register demoworkshop



Scenario Outline: To Register

Given User should be in the  home page "https://demowebshop.tricentis.com/"

Then Validate the home page and User should click register button
Then Enter the details "THarini","M","tharinimtcs@gmail.com","Tharini","Tharini"
Then Click on save button