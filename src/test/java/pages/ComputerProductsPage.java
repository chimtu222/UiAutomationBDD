package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import stepdefinition.Hooks;
import uistore.ComputerProductsPageUi;
import uistore.HomePageUi;
import utils.LoggerGeneretor;
import utils.ReporterMaker;
import utils.CaptureScreenshot;
import utils.DriverHelper;

public class ComputerProductsPage {
	
    WebDriver driver;
    DriverHelper helper;
    HomePage home;
public ComputerProductsPage(WebDriver driver){
    this.driver=driver;
    helper=new DriverHelper(driver); 
    home=new HomePage(driver);
}

	/*------------------------------Methods------------------------------------*/
	
		/*------------------Clicking On Computer Products---------------*/
		public void clickingOnComputerProducts(){
			 try{ 
			     helper.clickOnElement(HomePageUi.computerProducts);
			     WebElement Text=driver.findElement(By.tagName("h1"));
			     String actualText=Text.getText();
			     String expectedText="Computer Products ";
			     helper.softAsserting(actualText, expectedText);
			     LoggerGeneretor.info("Clicked On Computer Products");
			     Hooks.test.log(Status.PASS,"Clicked On Computer Products");
			     }catch(Exception e){
			             CaptureScreenshot.captureScreenShot("FailedComputerProducts");
			    	 	 String Path=ReporterMaker.captureScreenShot("FailedComputerProducts");
			    	 	 Hooks.test.addScreenCaptureFromPath(Path, "FailedComputerProducts");
			             LoggerGeneretor.error("Failed to  click on Computer Products...");
			             Hooks.test.log(Status.FAIL,"Failed to click On Computer Products...");
			     }
		}
		
		/*------------------Hovering On Computer Section---------------*/
		public void hoveringOnComputerSection(){
		
			     try{
				     helper.hoverOverElement(ComputerProductsPageUi.computerSection);
				     WebElement Text=driver.findElement(ComputerProductsPageUi.TabletPc);
				     String actualText=Text.getText();
				     String expectedText="Tablet PC";
				     helper.softAsserting(actualText, expectedText);
				     LoggerGeneretor.info("Hovered On Computer Section");
				     Hooks.test.log(Status.PASS,"Hovered On Computer Section");
				     }catch(Exception e){
				    	 	 CaptureScreenshot.captureScreenShot("FailedHoveringComputer Section");
				    	 	 String Path=ReporterMaker.captureScreenShot("FailedHoveringComputer Section");
				             Hooks.test.addScreenCaptureFromPath(Path, "FailedHoveringComputer Section");
				             LoggerGeneretor.error("Failed to Hover On Computer Section...");
				             Hooks.test.log(Status.FAIL,"Failed to Hover On Computer Section...");
				     }
		}
		
		/*------------------Clicking On Tablet PC---------------*/
		public void clickingOnTabletPc(){
			     try{
			     helper.clickOnElement(ComputerProductsPageUi.TabletPc);
			     WebElement productTitle=driver.findElement(ComputerProductsPageUi.TabletPCValid);
			     String actualTitle=productTitle.getText();
			     String expectedTitle="Tablet PC";
			     helper.softAsserting(actualTitle, expectedTitle);
			     Hooks.test.log(Status.PASS,"Clicked Tablet PC");
			     LoggerGeneretor.info("Clicked Tablet PC");
			     }catch(Exception e){
			    	     CaptureScreenshot.captureScreenShot("FailedTabletPC");
			    	     String Path=ReporterMaker.captureScreenShot("FailedTabletPC");
			             Hooks.test.addScreenCaptureFromPath(Path, "FailedTabletPC");
			             LoggerGeneretor.error("Failed to Click Tablet PC...");
			             Hooks.test.log(Status.FAIL,"Failed to Click Tablet PC...");
			     }
		}
			   
		/*------------------Verifying Tablet PC Page---------------*/
		public void verifyTabletPcPage(){
			     try{
				     WebElement productTitle=driver.findElement(ComputerProductsPageUi.TabletPCValid);
				     String actualTitle=productTitle.getText();
				     String expectedTitle="Tablet PC";
				     helper.softAssertContaing(actualTitle,expectedTitle);
				     Hooks.test.log(Status.PASS,"Tablet PC Page Found");
				     LoggerGeneretor.info("Tablet PC Page Found");
				     CaptureScreenshot.captureScreenShot("SuccessTabletPC");
				     String Path=ReporterMaker.captureScreenShot("SuccessTabletPC");
		             Hooks.test.addScreenCaptureFromPath(Path, "SuccessTabletPC");
				     }catch(Exception e){
				             CaptureScreenshot.captureScreenShot("FailedTabletPCPage");
				             String Path=ReporterMaker.captureScreenShot("FailedTabletPCPage");
				             Hooks.test.addScreenCaptureFromPath(Path, "FailedTabletPCPage");
				             LoggerGeneretor.error("Tablet PC Page Not Found...");
				             Hooks.test.log(Status.FAIL,"Tablet PC Page Not Found...");
				      }
			     
	}
}
