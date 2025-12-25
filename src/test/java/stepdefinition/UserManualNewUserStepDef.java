package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.BuyerServicesPage;
import utils.SetUpBrowser;


public class UserManualNewUserStepDef extends SetUpBrowser{
	HomePage home=new HomePage(driver);
	BuyerServicesPage user=new BuyerServicesPage(driver);
	String expectedURL=driver.getCurrentUrl();
	
	@When("I hover on Buyer menu")
	public void i_hover_on_buyer_menu() {
		home.hoveringOnBuyer();	
	}

	@When("I Click on New User Guide Link")
	public void i_click_on_new_user_guide_link() {
		user.clickingOnNewUserGuide();
		
	}

	@When("I Click on Start button")
	public void i_click_on_start_button() {
		user.clickingOnStartNow();
		
	}

	@Then("I validate the result Page and took a screenshot")
	public void i_validate_the_result_page_and_took_a_screenshot() {
		user.verifyingUrl(expectedURL);
	}

	
}
