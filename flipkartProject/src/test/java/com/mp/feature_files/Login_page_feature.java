package com.mp.feature_files;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_page_feature {
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		System.out.println("user is on login page");
	    
	}

	@When("user enters the valid Email and password")
	public void user_enters_the_valid_email_and_password() {
		
		System.out.println("user enters the valid Email and password");
	}

	@Then("clicks login button the user should be navigate to dashboard")
	public void clicks_login_button_the_user_should_be_navigate_to_dashboard() {
		
		System.out.println("clicks login button the user should be navigate to dashboard");
	    
	}


}
