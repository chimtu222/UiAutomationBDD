package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.TopRankingProductsPage;
import utils.SetUpBrowser;

public class BestSellingTopTrendingProductStepDef extends SetUpBrowser{
	HomePage home=new HomePage(driver);
	TopRankingProductsPage topRank=new TopRankingProductsPage(driver);
	
	@When("I Click on Top Ranking Products")
	public void i_click_on_top_ranking_products() {
		home.clickingOnTopRankingProducts();
		
	}

	@When("I click on best Selling button")
	public void i_click_on_best_selling_button() throws InterruptedException {
		topRank.clickingOnBestSellingButton();
		
	}

	@When("I Click on first Trending best selling product")
	public void i_click_on_first_trending_best_selling_product() {
		topRank.clickingOnFirstTrendingProduct();;
		
	}

	@When("I Click on WishList Icon")
	public void i_click_on_wish_list_icon() throws InterruptedException {
		topRank.clickingOnFavIcon();
		
	}

	@When("I click on Start Order Request For Buying")
	public void i_click_on_start_order_request_for_buying() {
		topRank.clickingOnStartOrderRequest();
		
	}

	@When("I Click on Submit Order without filling any details")
	public void i_click_on_submit_order_without_filling_any_details() {
		topRank.clickingOnSubmitOrder();
		
	}

	@Then("I Verify the Submit Order Result Page")
	public void i_verify_the_submit_order_result_page() {
		topRank.verifyingSubmitOrderPage();
	}

	
}
