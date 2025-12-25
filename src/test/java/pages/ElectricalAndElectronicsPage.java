package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import stepdefinition.Hooks;
import uistore.ElectricalAndElectronicsPageUi;
import uistore.HomePageUi;
import utils.LoggerGeneretor;
import utils.ReporterMaker;
import utils.CaptureScreenshot;
import utils.DriverHelper;

public class ElectricalAndElectronicsPage {
	
    WebDriver driver;
    DriverHelper helper;
    HomePage home;
public ElectricalAndElectronicsPage(WebDriver driver){
    this.driver=driver;
    helper=new DriverHelper(driver); 
    home=new HomePage(driver);
}


 /*----------------------------Methods-----------------------------------*/
	
	/*---------------------Clicking Electrical And Electronics----------------------*/
	public void clickingElectricalAndElectrncs(){
			     try{
			     helper.clickOnElement(HomePageUi.electricalElectrncs);
			     WebElement Text=driver.findElement(By.tagName("h1"));
			     String actualText=Text.getText();
			     String expectedText="Electrical & Electronics ";
			     helper.softAsserting(actualText, expectedText);
			     LoggerGeneretor.info("Clicked On Electrical & Electronics");
			     Hooks.test.log(Status.PASS,"Clicked On Electrical & Electronics");
			     }catch(Exception e){
			    	 	String Path=ReporterMaker.captureScreenShot("FailedComputerProducts");
			    	 	Hooks.test.addScreenCaptureFromPath(Path, "FailedComputerProducts");
			             CaptureScreenshot.captureScreenShot("FailedComputerProducts");
			             LoggerGeneretor.error("Failed to  click on Electrical & Electronics...");
			             Hooks.test.log(Status.FAIL,"Failed to click On Electrical & Electronics...");
			     }
		}
	
	/*--------------------------Hovering On Motors-----------------------------*/
	public void hoveringOnMotors(){
			     try{
				     helper.hoverOverElement(ElectricalAndElectronicsPageUi.motor);
				     WebElement Text=driver.findElement(ElectricalAndElectronicsPageUi.dcMotor);
				     String actualText=Text.getText();
				     String expectedText="DC Motor";
				     helper.softAsserting(actualText, expectedText);
				     LoggerGeneretor.info("Hovered On Motors");
				     Hooks.test.log(Status.PASS,"Hovered On Motors");
				     }catch(Exception e){
				    	 String Path=ReporterMaker.captureScreenShot("FailedHoveringMotors");
			             Hooks.test.addScreenCaptureFromPath(Path, "FailedHoveringMotors");
				    	 	 CaptureScreenshot.captureScreenShot("FailedHoveringMotors");
				             LoggerGeneretor.error("Failed to Hover On Motors...");
				             Hooks.test.log(Status.FAIL,"Failed to Hover On Motors...");
				     }
			}
			   
	/*------------------Clicking On DC Motors---------------*/
	public void clickingDcMotors(){
			     try{
			     helper.clickOnElement(ElectricalAndElectronicsPageUi.dcMotor);
			     WebElement Text=driver.findElement(By.xpath("//h1[@class='product_word']"));
			     String actualText=Text.getText();
			     String expectedText=" DC Motor ";
			     helper.softAsserting(actualText, expectedText);
			     Hooks.test.log(Status.PASS,"Clicked DC Motor");
			     LoggerGeneretor.info("Clicked DC Motor");
			     }catch(Exception e){
			    	 	String Path=ReporterMaker.captureScreenShot("FailedDC Motor");
			    	 	Hooks.test.addScreenCaptureFromPath(Path, "FailedDC Motor");
			    	     CaptureScreenshot.captureScreenShot("FailedDC Motor");
			             LoggerGeneretor.error("Failed to Click DC Motor...");
			             Hooks.test.log(Status.FAIL,"Failed to Click DC Motor...");
			     }
			     
			}
			
	/*------------------Clicking DC Gear Motors---------------*/
	public void clickingDcGearMotors(){
			     try{
				     helper.clickOnElement(ElectricalAndElectronicsPageUi.dcGearMotor);
				     WebElement pageheader=driver.findElement(ElectricalAndElectronicsPageUi.dcGearMotorValid);
				     String actualHeader=pageheader.getText();
				     String expectedHeader="DC Gear Motor";
				     helper.softAsserting(actualHeader, expectedHeader);
				     Hooks.test.log(Status.PASS,"Clicked DC Gear Motor");
				     LoggerGeneretor.info("Clicked DC Gear Motor");
				     }catch(Exception e){
				    	 	String Path=ReporterMaker.captureScreenShot("FailedDCGearMotor");
				    	 	Hooks.test.addScreenCaptureFromPath(Path, "FailedDCGearMotor");
				    	     CaptureScreenshot.captureScreenShot("FailedDCGearMotor");
				             LoggerGeneretor.error("Failed to Click DC Gear Motor...");
				             Hooks.test.log(Status.FAIL,"Failed to Click DC Gear Motor...");
				     }
			     
			}
		
			
	/*------------------Verifying Electrical And Electronics Page---------------*/
	public void verifyingElectricalAndElectrncsPage(){
			     
			     try{
				     WebElement pageTitle=driver.findElement(ElectricalAndElectronicsPageUi.dcGearMotorValid);
				     String actualTitle=pageTitle.getText();
				     String expectedTitle="DC Gear Motor";
				     helper.softAssertContaing(actualTitle,expectedTitle);
				     Hooks.test.log(Status.PASS,"DC Gear Motor Page Found");
				     LoggerGeneretor.info("DC Gear Motor Page Found");
				     CaptureScreenshot.captureScreenShot("SuccessTabletPC");
				     String Path=ReporterMaker.captureScreenShot("SuccessTabletPC");
			    	 Hooks.test.addScreenCaptureFromPath(Path, "SuccessTabletPC");
				     }catch(Exception e){
				    	 	String Path=ReporterMaker.captureScreenShot("FailedDCGearMotorPage");
				    	 	Hooks.test.addScreenCaptureFromPath(Path, "FailedDCGearMotorPage");
				             CaptureScreenshot.captureScreenShot("FailedDCGearMotorPage");
				             LoggerGeneretor.error("DC Gear Motor Page Not Found...");
				             Hooks.test.log(Status.FAIL,"DC Gear Motor Page Not Found...");
				      }
			     
			}
}
