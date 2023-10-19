package org.scenario1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stepdefinition extends BaseClaass {

	public static pagefactory l = new pagefactory();

	@Given("User should be in the  home page {string}")
	public void user_should_be_in_the_home_page(String URL) {
		browserLaunch();
		urlLaunch(URL);
		maximise();
		impWait(10);
	}

	@Then("Validate the home page and User should click register button")
	public void validate_the_home_page_and_user_should_click_register_button() {
		
		l = new pagefactory();
		
		click(l.getRegister());

	}

	@Then("Enter the details {string},{string},{string},{string},{string}")
	public void enter_the_details(String firstname, String lastname, String email, String password, String confirmpassword) {
		
		l = new pagefactory();
		
		click(l.getGender());
		sendkeys(l.getFirstname(), firstname);
		sendkeys(l.getLastname(), lastname);
		sendkeys(l.getEmail(), email);
		sendkeys(l.getPassword(), password);
		sendkeys(l.getConfirmpassword(), confirmpassword);




	}

	@Then("Click on save button")
	public void click_on_save_button() {
		
		l = new pagefactory();
		click(l.getSave());
		driver.quit();
	}

}
