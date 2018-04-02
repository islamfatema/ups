package stepdefinition;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.HomePage;

public class LoginSD {
	 private HomePage homePage = new HomePage();
	 
	@Given("^user is home page of ups\\.com$")
	public void user_is_home_page_of_ups_com() throws Throwable {
		Assert.assertEquals(SharedSD.getDriver().getTitle(), "Home: UPS", "Invalid Home Page");    
	}

	@When("^user click on log in$")
	public void user_click_on_log_in() throws Throwable {
	    homePage.clickOnLoginButton();
	}

	@When("^user enter islamfatema(\\d+)@yahoo\\.com into username text fields$")
	public void user_enter_email_id(String text) throws Throwable {
	   homePage.enterEmail(text);
	}

	@When("^user enter test(\\d+) into password text fields$")
	public void user_enter_password(String pass) throws Throwable {
	   homePage.enterPassword(pass);
	}

	@When("^user click on login$")
	public void user_click_on_login() throws Throwable {
	   homePage.clickOnLogin();
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page() throws Throwable {
	    
	}


}
