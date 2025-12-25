package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HelpMenuPage;
import pages.HomePage;
import utils.SetUpBrowser;


public class SupplierEmailVerifyStepDef extends SetUpBrowser{
	HomePage home=new HomePage(driver);
	HelpMenuPage help=new HelpMenuPage(driver);
	
	@When("I hover On Help Menu")
	public void i_hover_on_help_menu() {
		home.hoveringOnHelpMenu();
		
	}
	@When("I Click on Submit a Complaint button")
	public void i_click_on_submit_a_complaint_button() {
		help.clickingOnSubmitAComplaint();
		
	}

	@When("I Click on Learn More tips Link")
	public void i_click_on_learn_more_tips_link() {
		help.clickingOnLearnMoreTips();
		
	}

	@When("I Click on Supplier Email Link")
	public void i_click_on_supplier_email_link() {
		help.clickingSupplierEmailLink();
		
	}

	@Then("I validate the Supplier Email Result Page and took a Screenshot")
	public void i_validate_the_supplier_email_result_page_and_took_a_screenshot() {
		help.verifyingSupplierEmailPage();
	}
}
