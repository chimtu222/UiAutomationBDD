package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SecureTradingServicesPage;
import utils.SetUpBrowser;
	
public class SecureTradingServicesStepDef extends SetUpBrowser{
	HomePage home=new HomePage(driver);
	SecureTradingServicesPage secureTrade=new SecureTradingServicesPage(driver);
	
	
	@When("I clicking on Secure Trading Services")
	public void i_clicking_on_secure_trading_services() {
		home.clickingOnSecureTradingServices();
		
	}

	@When("I Click on Buyers Guide below the header")
	public void i_click_on_buyers_guide_below_the_header() {
		secureTrade.clickingOnBuyersGuide();
	
	}

	@When("I Click on the Shown Image in Result page")
	public void i_click_on_the_shown_image_in_result_page() {
		secureTrade.clickingOnSecureTradingServicesImage();
		
	}

	@When("I Scroll down to Refund and Return Page")
	public void i_scroll_down_to_refund_and_return_page() {
		secureTrade.scrollingToRefundAndReturn();
		
	}

	@When("I Click on Refund and Return Link")
	public void i_click_on_refund_and_return_link() {
		secureTrade.clickingOnRefundAndReturnLink();
		
	}

	@Then("I verify the Refund and Return Result Page")
	public void i_verify_the_refund_and_return_result_page() {
		secureTrade.verifyingRefundAndReturnLinkResultPage();
	}
}
