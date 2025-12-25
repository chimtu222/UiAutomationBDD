package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.BuyerServicesPage;
import utils.SetUpBrowser;


public class UserManualBrowsingHistoryStepDef extends SetUpBrowser{
	HomePage home=new HomePage(driver);
	BuyerServicesPage user=new BuyerServicesPage(driver);
	
	@When("I Hovered on Buyer menu from header")
	public void i_hovered_on_buyer_menu_from_header() {
		home.hoveringOnBuyer();
		
	}

	@When("I Clicking on Browsing History link")
	public void i_clicking_on_browsing_history_link() {
		user.clickingOnBrowsingHistory();
		
	}

	@When("I Clicking on Categories Keyword button in the Browsing History page")
	public void i_clicking_on_categories_keyword_button_in_the_browsing_history_page() {
		user.clickingOnCategoriesKeyword();
		
	}

	@When("I Clicking on Audited Suppliers button in the Browsing History page")
	public void i_clicking_on_audited_suppliers_button_in_the_browsing_history_page() {
		user.clickingOnAuditedSuppliers();
		
	}

	@When("I Clicking on Product History button in the Browsing History page")
	public void i_clicking_on_product_history_button_in_the_browsing_history_page() {
		user.clickingOnProductHistoryButton();
		
	}

	@Then("I validate the Result Page and take a ScreenShot and Attach it to report")
	public void i_validate_the_result_page_and_take_a_screen_shot_and_attach_it_to_report() {
		user.verifyingHistoryPage();
	}
}
