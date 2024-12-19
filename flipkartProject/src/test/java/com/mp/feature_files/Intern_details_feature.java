package com.mp.feature_files;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Intern_details_feature {
	
	@Given("user clicks the internship link on the menu frame")
	public void user_clicks_the_internship_link_on_the_menu_frame() {
	 System.out.println("user clicks the internship link on the menu frame");
	}

	@When("user clicks Post Internship button he will naviagate to details filling page")
	public void user_clicks_post_internship_button_he_will_naviagate_to_details_filling_page() {
		
		System.out.println("user clicks Post Internship button he will naviagate to details filling page");
	 }

	@When("enters the department details")
	public void enters_the_department_details() {
		System.out.println("user clicks the internship link on the menu frame");
	
	}

	@When("enters the academic percentage")
	public void enters_the_academic_percentage() {
		System.out.println("enters the academic percentage");
	
	}

	@When("provides the location")
	public void provides_the_location() {
		System.out.println("provides the location");
	}

	@When("enters tittle of internship and internship discription from given sheetname\"Sheet1\" and rownumber {int}")
	public void enters_tittle_of_internship_and_internship_discription_from_given_sheetname_sheet1_and_rownumber(Integer int1) {
		System.out.println("enters tittle of internship and internship discription from given sheetname\"Sheet1\" and rownumber {int}");
	}

	@When("clicks the calendar and enters the start date")
	public void clicks_the_calendar_and_enters_the_start_date() {
		System.out.println("clicks the calendar and enters the start date");
	    
	}

	@When("user enters the number of vacancies")
	public void user_enters_the_number_of_vacancies() {
		System.out.println("user enters the number of vacancies");
	
	}

	@When("user enters the duration")
	public void user_enters_the_duration() {
		System.out.println("user enters the duration");
	  
	}

	@When("clicks the post internship button")
	public void clicks_the_post_internship_button() {
		System.out.println("clicks the post internship button");
	   
	}

	@Then("it shows a successful message\"Internship Successfully posted\"")
	public void it_shows_a_successful_message_internship_successfully_posted() {
		System.out.println("it shows a successful message\"Internship Successfully posted\"");
	  
	}

}
