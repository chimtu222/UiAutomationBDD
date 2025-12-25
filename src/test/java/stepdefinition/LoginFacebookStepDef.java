package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SigninPage;
import utils.SetUpBrowser;

	
public class LoginFacebookStepDef extends SetUpBrowser{
	HomePage home=new HomePage(driver);
	SigninPage signIn=new SigninPage(driver);
	
	@When("I hover on Sign in Icon")
	public void i_hover_on_sign_in_icon() {
		home.hoveringOnSignInIcon();
		
	}

	@When("I Click on Sign in button after hovering")
	public void i_click_on_sign_in_button_after_hovering() {
		home.clickingOnSignInButtonAfterHovering();
		
	}

	@When("I Click on Sign in button below the Form")
	public void i_click_on_sign_in_button_below_the_form() {
		signIn.clickingOnSignInButton();
		
	}

	@Then("I verify Email field Warn Text")
	public void i_verify_email_field_warn_text() {
		signIn.verifyingEmailWarnText();
		
	}

	@Then("I verify Password field Warn Text")
	public void i_verify_password_field_warn_text() {
		signIn.verifyingPasswordWarnText();
		
	}

	@When("I Click on FaceBook icon")
	public void i_click_on_face_book_icon() {
		signIn.clickingOnFaceBookIcon();
		
	}

	@Then("I verify the facebook Log in Page and take a screenshot")
	public void i_verify_the_facebook_log_in_page_and_take_a_screenshot() {
		signIn.verifyingFaceBookPage();
	}

	
}
