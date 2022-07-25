package org.stepdefjenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDef {
	
	//WebDriver driver;
	
	@Given("User is on facebook login page")
	public void user_is_on_facebook_login_page() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Welcome\\eclipse-workspace\\Jenkins2507\\target\\target\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	}

	@When("User should enter username and password")
	public void user_should_enter_username_and_password() {
		System.out.println("test1");
	}

	@When("User should should click the login button")
	public void user_should_should_click_the_login_button() {
		System.out.println("test1");
	}

	@Then("User should verify successfully entered")
	public void user_should_verify_successfully_entered() {
	   
	}

	
}
