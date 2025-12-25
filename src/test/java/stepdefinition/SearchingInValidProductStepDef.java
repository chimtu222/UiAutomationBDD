package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchProductPage;
import utils.SetUpBrowser;

public class SearchingInValidProductStepDef extends SetUpBrowser{
	HomePage home=new HomePage(driver);
	SearchProductPage search=new SearchProductPage(driver);
	@When("I click on the search bar for searching inValid Product")
	public void i_click_on_the_search_bar_for_searching_in_valid_product() {
		 home.clickingOnSearchBar();
	}

	@When("I pass {string} in the search bar")
	public void i_pass_in_the_search_bar(String string) {
		search.passingInValidInput(string);
	}

	@When("I click on the search button after passing invalid Product")
	public void i_click_on_the_search_button_after_passing_invalid_product() {
		home.clickingTheSearchButton();
	}

	@Then("I validate the the Result page and took a screenshot")
	public void i_validate_the_the_result_page_and_took_a_screenshot() {
	    search.verifyingResultPage();
	}

	
}
