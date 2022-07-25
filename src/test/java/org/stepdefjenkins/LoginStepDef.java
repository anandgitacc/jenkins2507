package org.stepdefjenkins;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef extends BaseClass {
	
	//WebDriver driver;
	
	@Given("User is on facebook login page")
	public void user_is_on_facebook_login_page() {
		browserLaunch("https://en-gb.facebook.com/");
		System.out.println("Browser launch");
	}

	@When("User should enter username and password")
	public void user_should_enter_username_and_password() {
		findElementid("email").sendKeys("hello");
		findElementid("pass").sendKeys("hello@1123");
		System.out.println("username and password");
	}

	@When("User should should click the login button")
	public void user_should_should_click_the_login_button() {
		System.out.println("login button");
	}

	@Then("User should verify successfully entered")
	public void user_should_verify_successfully_entered() {
	   System.out.println("success message");
	}

	
}
