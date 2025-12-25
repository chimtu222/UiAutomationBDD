package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.BuyerServicesPage;
import utils.SetUpBrowser;


public class UserManualMoreInfoStepDef extends SetUpBrowser{
	
	HomePage home=new HomePage(driver);
	BuyerServicesPage user=new BuyerServicesPage(driver);
	
	@When("I Hover on Buyer Module")
	public void i_hover_on_buyer_module() {
		home.hoveringOnBuyer();
		
	}

	@When("I click on New User Guide Option")
	public void i_click_on_new_user_guide_option() {
		user.clickingOnNewUserGuide();
		
	}

	@When("I Click on Learn More Link")
	public void i_click_on_learn_more_link() {
		user.clickingOnLearnMore();
		
	}

	@Then("I validate the Learn More Result Page and take a Screenshot")
	public void i_validate_the_learn_more_result_page_and_take_a_screenshot() {
		user.verifyingPageHeaderOfLearnMorePage();
	}

	
}
