package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.BuyerServicesPage;
import utils.SetUpBrowser;


public class UserManualContactUsStepDef extends SetUpBrowser{
	HomePage home=new HomePage(driver);
	BuyerServicesPage user=new BuyerServicesPage(driver);
	
	@When("I Clicking On Made in China Logo in the header")
	public void i_clicking_on_made_in_china_logo_in_the_header() {
		home.clickingOnLogo();
	}

	@When("I Hover on Buyer Section for Contact us")
	public void i_hover_on_buyer_section_for_contact_us() {
		home.hoveringOnBuyer();
		
	}

	@When("I Click on Contact Us button")
	public void i_click_on_contact_us_button() {
		user.clickingOnContactUs();
		
	}

	@When("I click on Frequently Asked Questions")
	public void i_click_on_frequently_asked_questions() {
		user.clickingOnFrequentlyAskedQuestion();
		
	}

	@Then("I validate the FAQ Result Page and took a screenshot")
	public void i_validate_the_faq_result_page_and_took_a_screenshot() {
		user.verifyingPageHeaderOfFaq();
	}

	
}
