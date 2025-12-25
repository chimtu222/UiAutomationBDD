package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.TopRankingProductsPage;
import utils.SetUpBrowser;

public class NewReleasedTopTrendingProductStepDef extends SetUpBrowser{
	HomePage home=new HomePage(driver);
	TopRankingProductsPage topRank=new TopRankingProductsPage(driver);
	
	@When("I Click on Top Ranking Products in header")
	public void i_click_on_top_ranking_products_in_header() {
		home.clickingOnTopRankingProducts();
		
	}

	@When("I Click on New Release button")
	public void i_click_on_new_release_button() throws InterruptedException {
		topRank.clickingOnNewRelease();
		
	}

	@When("I Click On First new Released Product")
	public void i_click_on_first_new_released_product() {
		topRank.clickingOnFirstTrendingProduct();
		
	}

	@When("I Click On Add Inquiry Basket")
	public void i_click_on_add_inquiry_basket() {
		topRank.clickingOnAddInquiryBasket();
		
	}

	@When("I Click On Add Inquiry Basket Icon in the header")
	public void i_click_on_add_inquiry_basket_icon_in_the_header() {
		topRank.clickingOnInquiryBasketIcon();
		
	}

	@Then("I validate the Inquiry Result page")
	public void i_validate_the_inquiry_result_page() {
		topRank.verifyingInquiryBasketPage();
	}
}
