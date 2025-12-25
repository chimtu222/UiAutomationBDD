package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.SearchProductPage;
import utils.SetUpBrowser;

public class SearchingValidProductStepDef extends SetUpBrowser{
	HomePage home=new HomePage(driver);
	SearchProductPage search=new SearchProductPage(driver);
	
	@When("I Click on Search bar for searching Valid Product")
	public void i_click_on_search_bar_for_searching_valid_product() {
		home.clickingOnSearchBar();
	}

	@When("I pass a Valid Product {string}")
	public void i_pass_a_valid_product(String string) {
	    search.passingValidInputToSearchBar(string);
	}

	@When("I Click on the Search icon after passing valid product")
	public void i_click_on_the_search_icon_after_passing_valid_product() {
		home.clickingTheSearchButton();
	}

	@When("I click on the First Product")
	public void i_click_on_the_first_product() {
	    search.clickingOnFirstProduct();
	}

	@Then("I validate Valid Product Result Page and take a Screenshot")
	public void i_validate_valid_product_result_page_and_take_a_screenshot() {
	    search.validatingProductPage();
	}
}
