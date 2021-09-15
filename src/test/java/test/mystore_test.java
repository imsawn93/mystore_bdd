package test;

import base.launch;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.mystore_pageobject;

public class mystore_test extends launch{
	public mystore_pageobject mystorerun;
	 
	@Before
	public void enterurl() {
	login();
	mystorerun = new mystore_pageobject(browser);
	}

	@Given("^user enter mystore website$")
	public void user_enter_mystore_website() {
		
		
		mystorerun.typeclick();

	}

	@And("^user type username and password$")
	public void user_type_username_and_password() {

	}

	@When("^user click next button$")
	public void user_click_next_button() {

	}

	@Then("^user land in mystore website user page$")
	public void user_land_in_mystore_website_user_page() {

	}

}
