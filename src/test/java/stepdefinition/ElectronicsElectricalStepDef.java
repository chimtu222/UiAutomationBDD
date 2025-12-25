package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ElectricalAndElectronicsPage;
import pages.HomePage;
import utils.SetUpBrowser;

public class ElectronicsElectricalStepDef extends SetUpBrowser{
	HomePage home=new HomePage(driver);
	ElectricalAndElectronicsPage electrical=new ElectricalAndElectronicsPage(driver);
	
	@When("I hover On All Categories Menu")
	public void i_hover_on_all_categories_menu() {
		home.hoveringOnAllCategories();
	}

	@When("I Click On Electrical and Electronics Link")
	public void i_click_on_electrical_and_electronics_link() {
		electrical.clickingElectricalAndElectrncs();
	}

	@When("I hover on Motors Section")
	public void i_hover_on_motors_section() {
	    electrical.hoveringOnMotors();
	}

	@When("I Click on DC Motor Link")
	public void i_click_on_dc_motor_link() {
	    electrical.clickingDcMotors();
	}

	@When("I Click on DC Gear Motor button")
	public void i_click_on_dc_gear_motor_button() {
	    electrical.clickingDcGearMotors();
	}

	@Then("I Verify The Filtered DC Gear Motor Result Page and take a Screenshot")
	public void i_verify_the_filtered_dc_gear_motor_result_page_and_take_a_screenshot() {
	    electrical.verifyingElectricalAndElectrncsPage();
	}

}
