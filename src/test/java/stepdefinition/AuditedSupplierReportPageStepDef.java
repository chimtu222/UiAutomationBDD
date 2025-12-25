package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BuyerServicesPage;
import pages.HomePage;
import utils.SetUpBrowser;

public class AuditedSupplierReportPageStepDef extends SetUpBrowser{
	HomePage home=new HomePage(driver);
	BuyerServicesPage buyer=new BuyerServicesPage(driver);
	
	@When("I Hovered on Buyer menu from header for clicking Audited Supplier")
	public void i_hovered_on_buyer_menu_from_header_for_clicking_audited_supplier() {
	   home.hoveringOnBuyer();
	}

	@When("I Clicking on Audited Supplier Link and Switch Window")
	public void i_clicking_on_audited_supplier_link_and_switch_window() {
	   home.clickingOnAuditedSupplier();
	}

	@When("I Scroll down Audited Supplier to Footer")
	public void i_scroll_down_audited_supplier_to_footer() {
	   buyer.scrollingToAuditedSupplierPageFooter();
	}

	@When("I Clicking on Back To Top button")
	public void i_clicking_on_back_to_top_button() {
	   buyer.clickingBackToTopButton();
	}

	@Then("I validate the Audited Supplier Result Page and take a ScreenShot")
	public void i_validate_the_audited_supplier_result_page_and_take_a_screen_shot() {
	    buyer.verifyingAuditedSupplierPage();
	}
		
}
