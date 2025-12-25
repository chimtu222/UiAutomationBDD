package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SecureTradingServicesPage;
import pages.TopRankingProductsPage;
import utils.SetUpBrowser;

public class OrderingFromSecureTradingStepDef extends SetUpBrowser{
	HomePage home=new HomePage(driver);
	SecureTradingServicesPage secure=new SecureTradingServicesPage(driver);
	TopRankingProductsPage product=new TopRankingProductsPage(driver);
	
	@When("I clicking on Secure Trading Services from the Header")
	public void i_clicking_on_secure_trading_services_from_the_header() {
	    home.clickingOnSecureTradingServices();
	}

	@When("I Scrolling To All Products Part")
	public void i_scrolling_to_all_products_part() {
	   secure.scrollingToDisplayAndAccessories();
	}

	@When("I Click on First Shown Product under All")
	public void i_click_on_first_shown_product_under_all() {
	   secure.clickingOnFirstDisplayAndAccessoriesProduct();
	}

	@When("I Click on Start Order Request Because I want To buy it")
	public void i_click_on_start_order_request_because_i_want_to_buy_it() {
	    product.clickingOnStartOrderRequest();
	}

	@Then("I verify the First product Result Page then I took a Screenshot")
	public void i_verify_the_first_product_result_page_then_i_took_a_screenshot() {
	   secure.verifyingProductResultPage();
	}
}
