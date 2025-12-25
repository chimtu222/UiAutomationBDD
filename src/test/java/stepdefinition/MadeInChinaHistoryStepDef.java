package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HelpMenuPage;
import pages.HomePage;
import utils.SetUpBrowser;

public class MadeInChinaHistoryStepDef extends SetUpBrowser{
	HomePage home=new HomePage(driver);
	HelpMenuPage help=new HelpMenuPage(driver);

	@When("I Hovered On Help Menu Section")
	public void i_hovered_on_help_menu_section() {
		home.hoveringOnHelpMenu();
		
	}

	@When("I Click on Why Made In China Link From The Option")
	public void i_click_on_why_made_in_china_link_from_the_option() {
		help.clickingOnWhyMadeInChina();
		
	}

	@When("I Scroll Down to Contact Us Page")
	public void i_scroll_down_to_contact_us_page() {
		help.scrollingToContactUsPage();
		
	}

	@Then("I Verify The Contact US Section is Present and take a Screenshot")
	public void i_verify_the_contact_us_section_is_present_and_take_a_screenshot() {
		help.verifyingContactUsPage();
	}
}
