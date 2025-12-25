package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SigninPage;
import utils.SetUpBrowser;

public class LoginForgotPasswordStepDef extends SetUpBrowser{
	HomePage home=new HomePage(driver);
	SigninPage signIn=new SigninPage(driver);
	
	@When("I hover on Sign in Icon in the header")
	public void i_hover_on_sign_in_icon_in_the_header() {
		home.hoveringOnSignInIcon();
		
	}

	@When("I Click on Sign in button")
	public void i_click_on_sign_in_button() {
		home.clickingOnSignInButtonAfterHovering();
		
	}

	@When("I Click on Sign in button without filling the fields")
	public void i_click_on_sign_in_button_without_filling_the_fields() {
		signIn.clickingOnSignInButton();
		
	}

	@Then("I verify Email field Warn Text for validation")
	public void i_verify_email_field_warn_text_for_validation() {
		signIn.verifyingEmailWarnText();
		
	}

	@Then("I verify Password field Warn Text for validation")
	public void i_verify_password_field_warn_text_for_validation() {
		signIn.verifyingPasswordWarnText();
		
	}

	@When("I Click on Forgot Password link")
	public void i_click_on_forgot_password_link() {
		signIn.clickingOnForgotPassword();
		
	}

	@Then("I verify the Forgot Password result Page and take a screenshot")
	public void i_verify_the_forgot_password_result_page_and_take_a_screenshot() {
		signIn.verifyingForgotPasswordPage();
	}
}
