package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchProductPage;
import utils.SetUpBrowser;

public class SearchingProductFromSuggestionsStepDef extends SetUpBrowser {
	HomePage home=new HomePage(driver);
	SearchProductPage search=new SearchProductPage(driver);
	@When("I click on the search bar")
	public void i_click_on_the_search_bar() {
		home.clickingOnSearchBar();
	}

	@When("I pass a partial part {string} into search bar")
	public void i_pass_a_partial_part_into_search_bar(String string) {
	    search.passingSubStringValue(string);
	}

	@When("I double click on the first Suggestion")
	public void i_double_click_on_the_first_suggestion(){
		home.doubleClickOnSuggestion();
	}

	@When("I click on the Smart Phone filter")
	public void i_click_on_the_smart_phone_filter() {
	    search.clickingOnSmartPhone();
	}

	@When("I Click on the First Smart Phone Link")
	public void i_click_on_the_first_smart_phone_link() {
	    search.clickingOnFirstProductCard();
	}

	@When("I Click on Contact Supplier button")
	public void i_click_on_contact_supplier_button() {
	    search.clickingOnContactSupplier();
	}

	@Then("I verify the SmartPhone Result Page and took a screenshot")
	public void i_verify_the_smart_phone_result_page_and_took_a_screenshot() {
	   search.verifyingResultPageAfterClicking();
	}
}
