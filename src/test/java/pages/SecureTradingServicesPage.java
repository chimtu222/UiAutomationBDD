package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import stepdefinition.Hooks;
import uistore.SecureTradingServicesPageUi;
import uistore.TopRankingProductsUi;
import utils.CaptureScreenshot;
import utils.DriverHelper;
import utils.LoggerGeneretor;
import utils.ReporterMaker;

public class SecureTradingServicesPage {
	
    WebDriver driver;
    DriverHelper helper;
    HomePage home;
public SecureTradingServicesPage(WebDriver driver){
    this.driver=driver;
    helper=new DriverHelper(driver); 
    home=new HomePage(driver);
}


	/*------------------------------Methods------------------------------------*/
		
		/*------------------Scrolling to Display & Accessories---------------*/
		public void scrollingToDisplayAndAccessories(){
			try{
		     helper.javascriptScroll(SecureTradingServicesPageUi.scrollToDisplayAndAccessories);
		     WebElement Text=driver.findElement(SecureTradingServicesPageUi.displayAndAccessories);
		     String actualText=Text.getText();
		     String expectedText="Display & Accessories";
		     helper.softAssertContaing(actualText,expectedText);
		     LoggerGeneretor.info("Clicked on Display and Accessories");
		     Hooks.test.log(Status.PASS,"Clicked on Display and Accessories");
		     }catch(Exception e){
		    	 	String Path=ReporterMaker.captureScreenShot("FailedClickingDisplayAndAccessories");
		    	 	Hooks.test.addScreenCaptureFromPath(Path, "FailedClickingDisplayAndAccessories");
		    	 	 CaptureScreenshot.captureScreenShot("FailedClickingDisplayAndAccessories");
		             LoggerGeneretor.error("Failed to Click on Display and Accessories...");
		             Hooks.test.log(Status.FAIL,"Failed to Click on Display and Accessories...");
		     }
		}
		/*---------------Verifying Result Page-------------*/
		public void verifyingProductResultPage() {
			try{
			     WebElement Text=driver.findElement(TopRankingProductsUi.submitOrderValid);
			     String actualText=Text.getText();
			     String expectedText="Buyer Info.";
			     helper.softAsserting(actualText, expectedText);
			     Hooks.test.log(Status.PASS,"Secured Trading Service Order Page Found");
			     LoggerGeneretor.info("Secured Trading Service Order Page Found");
			     CaptureScreenshot.captureScreenShot("SuccessServiceOrderPageFound");
	    	     String Path=ReporterMaker.captureScreenShot("SuccessServiceOrderPageFound");
	    	     Hooks.test.addScreenCaptureFromPath(Path, "SuccessServiceOrderPageFound");
			     }catch(Exception e){
			    	     CaptureScreenshot.captureScreenShot("FailedServiceOrderPageFound");
			    	     String Path=ReporterMaker.captureScreenShot("FailedServiceOrderPageFound");
			    	     Hooks.test.addScreenCaptureFromPath(Path, "FailedServiceOrderPageFound");
			             LoggerGeneretor.error("Secured Trading Service Order Page Not Found...");
			             Hooks.test.log(Status.FAIL,"Secured Trading Service Order Page Not Found...");
			     }
			}
		/*------------------Verifying Product Result Page---------------*/  
		 public void validatingProductPage() {
		     try{
		     WebElement productPageFound=driver.findElement(SecureTradingServicesPageUi.firstDisplayAndAccessoriesPrdctValid);
		     String actualText=productPageFound.getText();
		     String expectedText="Product Details";
		     helper.softAsserting(actualText,expectedText);
		     Hooks.test.log(Status.PASS,"Product Details Found in Result Page");
		     LoggerGeneretor.info("Product Details Found in Result Page");
		     CaptureScreenshot.captureScreenShot("SuccessProductResultPage");
		     String Path=ReporterMaker.captureScreenShot("SuccessProductResultPage");
		     Hooks.test.addScreenCaptureFromPath(Path, "SuccessProductResultPage");
		     }catch(Exception e){
		             CaptureScreenshot.captureScreenShot("FailedProductResultPage");
		             String Path=ReporterMaker.captureScreenShot("FailedProductResultPage");
		             Hooks.test.addScreenCaptureFromPath(Path, "FailedProductResultPage");
		             LoggerGeneretor.error("Product Result Page Not Found...");
		             Hooks.test.log(Status.FAIL,"Product Result Page Not Found...");
		      }
		
		}
			/*------------------Clicking On Display & Accessories---------------*/
		public void clickingOnDisplayAndAccessories(){
			try{
		     helper.clickOnElement(SecureTradingServicesPageUi.displayAndAccessories);
		     LoggerGeneretor.info("Clicked on Display and Accessories");
		     Hooks.test.log(Status.PASS,"Clicked on Display and Accessories");
		     }catch(Exception e){
		    	 	String Path=ReporterMaker.captureScreenShot("FailedClickingDisplayAndAccessories");
		    	 	Hooks.test.addScreenCaptureFromPath(Path, "FailedClickingDisplayAndAccessories");
		    	 	 CaptureScreenshot.captureScreenShot("FailedClickingDisplayAndAccessories");
		             LoggerGeneretor.error("Failed to Click on Display and Accessories...");
		             Hooks.test.log(Status.FAIL,"Failed to Click on Display and Accessories...");
		     }
		}
		/*------------Clicking On First  Display & Accessories Product------------*/
		public void clickingOnFirstDisplayAndAccessoriesProduct(){
			try{
		     helper.clickOnElement(SecureTradingServicesPageUi.firstDisplayAndAccessoriesPrdct);
		     helper.switchToNewWindow();
		     WebElement productPageFound=driver.findElement(SecureTradingServicesPageUi.firstDisplayAndAccessoriesPrdctValid);
		     String actualText=productPageFound.getText();
		     String expectedText="Product Details";
		     helper.softAssertContaing(actualText,expectedText);
		     LoggerGeneretor.info("Clicked on First Display and Accessories Product");
		     Hooks.test.log(Status.PASS,"Clicked on First Display and Accessories Product");
		     }catch(Exception e){
		    	 	String Path=ReporterMaker.captureScreenShot("FailedClickingFirstDisplayAndAccessoriesPrdct");
		    	 	Hooks.test.addScreenCaptureFromPath(Path, "FailedClickingFirstDisplayAndAccessoriesPrdct");
		    	 	 CaptureScreenshot.captureScreenShot("FailedClickingFirstDisplayAndAccessoriesPrdct");
		             LoggerGeneretor.error("Failed to Click on First Display and Accessories Product...");
		             Hooks.test.log(Status.FAIL,"Failed to Click on First Display and Accessories Product...");
		     }
		}
		/*------------------Clicking On Buyers Guide---------------*/
		public void clickingOnBuyersGuide(){
			try{
			     helper.clickOnElement(SecureTradingServicesPageUi.buyersGuide);
			     helper.switchToNewWindow();
			     WebElement Text=driver.findElement(SecureTradingServicesPageUi.validateBuyersGuide);
			     String actualText=Text.getText();
			     String expectedText="About Us";
			     helper.softAsserting(actualText, expectedText);
			     LoggerGeneretor.info("Clicked on Buyers Guide");
			     Hooks.test.log(Status.PASS,"Clicked on Buyers Guide");
			     }catch(Exception e){
			    	 	String Path=ReporterMaker.captureScreenShot("FailedClickingBuyersGuide");
			    	 	Hooks.test.addScreenCaptureFromPath(Path, "FailedClickingBuyersGuide");
			    	 	 CaptureScreenshot.captureScreenShot("FailedClickingBuyersGuide");
			             LoggerGeneretor.error("Failed to Click on Buyers Guide...");
			             Hooks.test.log(Status.FAIL,"Failed to Click on Buyers Guide...");
			     }
		}
		/*------------------Clicking On Secure Trading Image---------------*/
		public void clickingOnSecureTradingServicesImage(){
				try{
				     helper.clickOnElement(SecureTradingServicesPageUi.secureTradingImg);
				     WebElement Text=driver.findElement(By.xpath("//h1[@class='head-title']"));
				     String actualText=Text.getText();
				     String expectedText="Secured Trading Service";
				     helper.softAsserting(actualText, expectedText);
				     LoggerGeneretor.info("Clicked on Secure Trading Image");
				     Hooks.test.log(Status.PASS,"Clicked on Secure Trading Image");
				     }catch(Exception e){
				    	 	String Path=ReporterMaker.captureScreenShot("FailedClickingSecureTradingImage");
				    	 	Hooks.test.addScreenCaptureFromPath(Path, "FailedClickingSecureTradingImage");
				    	 	 CaptureScreenshot.captureScreenShot("FailedClickingSecureTradingImage");
				             LoggerGeneretor.error("Failed to Click on Secure Trading Image...");
				             Hooks.test.log(Status.FAIL,"Failed to Click on Secure Trading Image...");
				     }
			
		}
		
		/*------------------Scrolling To Refund And Return---------------*/
		public void scrollingToRefundAndReturn(){
				try{
				     helper.javascriptScroll(SecureTradingServicesPageUi.scrollDownUpToRefundAndReturn);
				     WebElement Text=driver.findElement(SecureTradingServicesPageUi.readReturnAndRefundRulesLink);
				     String actualText=Text.getText();
				     String expectedText="Read the full Return & Refund rules.";
				     helper.softAsserting(actualText, expectedText);
				     LoggerGeneretor.info("Scrolled To Refund And Return");
				     Hooks.test.log(Status.PASS,"Scrolled To Refund And Return");
				     }catch(Exception e){
				    	 	String Path=ReporterMaker.captureScreenShot("FailedScrollToRefundAndReturn");
				    	 	Hooks.test.addScreenCaptureFromPath(Path, "FailedScrollToRefundAndReturn");
				    	 	 CaptureScreenshot.captureScreenShot("FailedScrollToRefundAndReturn");
				             LoggerGeneretor.error("Failed to Scroll To Refund And Return...");
				             Hooks.test.log(Status.FAIL,"Failed to Scroll To Refund And Return...");
				     }
			
		}
		
		/*------------------Clicking On Refund And Return link---------------*/
		public void clickingOnRefundAndReturnLink(){
				try{
					 helper.waitForElementToBeVisible(SecureTradingServicesPageUi.readReturnAndRefundRulesLink, 5);
				     helper.jsClick(SecureTradingServicesPageUi.readReturnAndRefundRulesLink);
				     helper.switchToNewWindow();
				     WebElement Text=driver.findElement(SecureTradingServicesPageUi.validateReturnAndRefundPage);
				     String actualText=Text.getText();
				     String expectedText="Return & Refund Rules";
				     helper.softAsserting(actualText, expectedText);
				     LoggerGeneretor.info("Refund And Return Clicked");
				     Hooks.test.log(Status.PASS,"Refund And Return Clicked");
				     }catch(Exception e){
				    	 	 String Path=ReporterMaker.captureScreenShot("FailedReturn&RuleClick");
				    	 	 Hooks.test.addScreenCaptureFromPath(Path, "FailedReturn&RuleClick");
				    	 	 CaptureScreenshot.captureScreenShot("FailedReturn&RuleClick");
				             LoggerGeneretor.error("Failed to Click on Refund And Return Link...");
				             Hooks.test.log(Status.FAIL,"Failed to Click on Refund And Return Link...");
				     }
		}
		
		/*------------------Verifying Refund And Return Result Page---------------*/
		public void verifyingRefundAndReturnLinkResultPage(){
				try{
				     WebElement Text=driver.findElement(SecureTradingServicesPageUi.validateReturnAndRefundPage);
				     String actualText=Text.getText();
				     String expectedText="Return & Refund Rules";
				     helper.softAsserting(actualText, expectedText);
				     LoggerGeneretor.info("Refund And Return Rules Page Found");
				     Hooks.test.log(Status.PASS,"Refund And Return Rules Page Found");
				     CaptureScreenshot.captureScreenShot("SuccessReturn&RulePage");
				     String Path=ReporterMaker.captureScreenShot("SuccessReturn&RulePage");
			    	 Hooks.test.addScreenCaptureFromPath(Path, "SuccessReturn&RulePage");
				     }catch(Exception e){
				    	 	 String Path=ReporterMaker.captureScreenShot("FailedReturn&RulePage");
				    	 	 Hooks.test.addScreenCaptureFromPath(Path, "FailedReturn&RulePage");
				    	 	 CaptureScreenshot.captureScreenShot("FailedReturn&RulePage");
				             LoggerGeneretor.error("Failed to Found Refund And Return Rules Page...");
				             Hooks.test.log(Status.FAIL,"Failed to Found Refund And Return Rules Page...");
				     }
		}
		
		
}
