package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ComputerProductsPage;
import pages.HomePage;
import utils.SetUpBrowser;

public class ComputerProductStepDef extends SetUpBrowser{
	HomePage home=new HomePage(driver);
	ComputerProductsPage computer=new ComputerProductsPage(driver);
	
	@When("I hover On All Categories Section")
	public void i_hover_on_all_categories_section() {
		home.hoveringOnAllCategories();
	}

	@When("I Click On Computer Products Link")
	public void i_click_on_computer_products_link() {
	     computer.clickingOnComputerProducts();
	    
	}

	@When("I hover on Computer Menu")
	public void i_hover_on_computer_menu() {
	   computer.hoveringOnComputerSection();
	}

	@When("I click on Tablet PC")
	public void i_click_on_tablet_pc() {
	   computer.clickingOnTabletPc();
	}

	@Then("I validate the TabletPC Result Page and take a Screenshot")
	public void i_validate_the_tablet_pc_result_page_and_take_a_screenshot() {
	   computer.verifyTabletPcPage();
	}

	}
