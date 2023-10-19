Feature: Register demoworkshop



Scenario Outline: To Register

Given User should be in the  home page "https://demowebshop.tricentis.com/"

Then Validate the home page and User should click register button
Then Enter the details "THarini","M","tharinimtcs@gmail.com","Tharini","Tharini"
Then Click on save button

@comparelist
Scenario: comparelist

Given User should be in the  home page "https://demowebshop.tricentis.com/"
Then click logged in
Then enter username and password and click enter
Then Mouse hover on Computers
Then Select Desktops and Sort by Name : A to Z
Then Click on any product
Then Add to compare list and  log out
