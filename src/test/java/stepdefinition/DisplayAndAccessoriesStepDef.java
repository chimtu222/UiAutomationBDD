package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SecureTradingServicesPage;
import utils.SetUpBrowser;

public class DisplayAndAccessoriesStepDef extends SetUpBrowser{
	HomePage home=new HomePage(driver);
	SecureTradingServicesPage display=new SecureTradingServicesPage(driver);
	
	@When("I clicking on Secure Trading Services in the Header")
	public void i_clicking_on_secure_trading_services_in_the_header() {
		home.clickingOnSecureTradingServices();
	   
	}

	@When("I Scroll till Display and Accessories button")
	public void i_scroll_till_display_and_accessories_button() {
		display.scrollingToDisplayAndAccessories();
		
	}

	@When("I Click on Display and Accessories button")
	public void i_click_on_display_and_accessories_button() {
		display.clickingOnDisplayAndAccessories();
		
	}

	@When("I Click on the First Display and Accessories product")
	public void i_click_on_the_first_display_and_accessories_product() {
		display.clickingOnFirstDisplayAndAccessoriesProduct();
		
	}

	@Then("I verify the Display and Accessories product Page and took a Screenshot")
	public void i_verify_the_display_and_accessories_product_page_and_took_a_screenshot() {
		display.validatingProductPage();
	}
	
}
