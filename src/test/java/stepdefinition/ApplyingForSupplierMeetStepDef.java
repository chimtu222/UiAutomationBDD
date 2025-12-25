package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BuyerServicesPage;
import pages.HomePage;
import utils.SetUpBrowser;

public class ApplyingForSupplierMeetStepDef extends SetUpBrowser{
	HomePage home=new HomePage(driver);
	BuyerServicesPage user=new BuyerServicesPage(driver);
	
	@When("I hover on Buyer Menu For Meeting Supplier")
	public void i_hover_on_buyer_menu_for_meeting_supplier() {
	   home.hoveringOnBuyer();
	}

	@When("I Click on Meet Supplier Link and Switch Window")
	public void i_click_on_meet_supplier_link_and_switch_window() {
	   user.clickingOnMeetSupplierLink();
	}

	@When("I Click on Apply to Meet Suppliers button")
	public void i_click_on_apply_to_meet_suppliers_button() {
	    user.clickingOnApplyToMeetSupplierBtn();
	}

	@Then("I validate the Apply to Meet Suppliers result Page and took a screenshot")
	public void i_validate_the_apply_to_meet_suppliers_result_page_and_took_a_screenshot() {
	   user.verifyingApplyToMeetSupplierPage();
	}
}
