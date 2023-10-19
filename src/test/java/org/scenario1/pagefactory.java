package org.scenario1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pagefactory extends BaseClaass {

	public pagefactory() {
		PageFactory.initElements(driver, this);

	}
	
	@FindBy (xpath = "//a[@class='ico-register']")
	private WebElement register;
	
	@FindBy (id = "gender-male")
	private WebElement Gender;
	
	@FindBy (id = "FirstName")
	private WebElement firstname;
	
	@FindBy (id = "LastName")
	private WebElement lastname;
	
	@FindBy (id = "Email")
	private WebElement email;
	
	@FindBy (id = "Password")
	private WebElement password;
	
	@FindBy (id = "ConfirmPassword")
	private WebElement confirmpassword;
	
	@FindBy (id = "register-button")
	private WebElement save;

	
	public WebElement getSave() {
		return save;
	}

	public WebElement getRegister() {
		return register;
	}

	public void setRegister(WebElement register) {
		this.register = register;
	}

	public WebElement getGender() {
		return Gender;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}
}
	
	


