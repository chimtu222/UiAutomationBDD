package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import com.aventstack.extentreports.Status;

import stepdefinition.Hooks;
import uistore.BuyerServicesPageUi;
import uistore.HomePageUi;
import utils.LoggerGeneretor;
import utils.ReporterMaker;
import utils.CaptureScreenshot;
import utils.DriverHelper;

public class BuyerServicesPage {
	
    WebDriver driver;
    DriverHelper helper;
    HomePage home;
public BuyerServicesPage(WebDriver driver){
    this.driver=driver;
    helper=new DriverHelper(driver);
    home=new HomePage(driver);
}


/*------------------------------------Methods-----------------------------------------*/

		/*-------------------Clicking On Meet Supplier Link----------------------------*/
		public void clickingOnMeetSupplierLink() {
			 try{
			     helper.clickOnElement(HomePageUi.meetSupplierLink);
			     helper.switchToNewWindow();
			     WebElement Text=driver.findElement(BuyerServicesPageUi.meetSupplierLinkValid);
			     String actualText=Text.getText();
			     String expectedText="Buyer Service";
			     helper.softAsserting(actualText, expectedText);
			     LoggerGeneretor.info("Clicked On Meet Supplier Link");
			     Hooks.test.log(Status.PASS,"Clicked On Meet Supplier Link");
			     }catch(Exception e){
			    	 	String Path=ReporterMaker.captureScreenShot("FailedMeetSupplierLink");
			    	 	Hooks.test.addScreenCaptureFromPath(Path, "FailedMeetSupplierLink");
			             CaptureScreenshot.captureScreenShot("FailedMeetSupplierLink");
			             LoggerGeneretor.error("Failed to  click on Meet Supplier Link...");
			             Hooks.test.log(Status.FAIL,"Failed to click On Meet Supplier Link...");
			     }
		}
		/*-------------------Scrolling To Footer----------------------------*/
		public void scrollingToAuditedSupplierPageFooter() {
		 try{
		     helper.javascriptScroll(BuyerServicesPageUi.auditedSuppliersReportsFooter);
		     WebElement Text=driver.findElement(BuyerServicesPageUi.verifyFooter);
		     String actualText=Text.getText();
		     String expectedText="Contact Us:";
		     helper.softAsserting(actualText, expectedText);
		     LoggerGeneretor.info("Footer Verified");
		     Hooks.test.log(Status.PASS,"Footer Verified");
		     }catch(Exception e){
		    	 	 String Path=ReporterMaker.captureScreenShot("FailedToScrollToFooter");
		    	 	Hooks.test.addScreenCaptureFromPath(Path, "FailedToScrollToFooter");
		             CaptureScreenshot.captureScreenShot("FailedToScrollToFooter");
		             LoggerGeneretor.error("Failed to Scroll to Footer...");
		             Hooks.test.log(Status.FAIL,"Failed to Scroll to Footer...");
		     }
		}
		/*-------------------Back to top----------------------------*/
		public void clickingBackToTopButton() {
		 try{
		     helper.clickOnElement(BuyerServicesPageUi.backToTop);
		     WebElement Text=driver.findElement(BuyerServicesPageUi.verifyAuditedSupplierPage);
		     String actualText=Text.getText();
		     String expectedText="Audited Suppliers";
		     helper.softAsserting(actualText, expectedText);
		     LoggerGeneretor.info("Clicked back To top");
		     Hooks.test.log(Status.PASS,"Clicked back To top");
		     }catch(Exception e){
		    	 	 String Path=ReporterMaker.captureScreenShot("FailedClickBackToTop");
		    	 	Hooks.test.addScreenCaptureFromPath(Path, "FailedClickBackToTop");
		    	 	 CaptureScreenshot.captureScreenShot("FailedClickBackToTop");
		             LoggerGeneretor.error("Failed to click back to Top...");
		             Hooks.test.log(Status.FAIL,"Failed to click back to Top...");
		     }
		}
		/*-------------------Back to top----------------------------*/
		public void verifyingAuditedSupplierPage() {
		 try{
		     WebElement Text=driver.findElement(BuyerServicesPageUi.verifyAuditedSupplierPage);
		     String actualText=Text.getText();
		     String expectedText="Audited Suppliers";
		     helper.softAsserting(actualText, expectedText);
		     LoggerGeneretor.info("Audited Suppliers' Reports Page Found");
		     Hooks.test.log(Status.PASS,"Audited Suppliers' Reports Page Found");
		     String Path=ReporterMaker.captureScreenShot("SuccessAuditedSupplierPage");
		     Hooks.test.addScreenCaptureFromPath(Path, "SuccessAuditedSupplierPage");
		 	 CaptureScreenshot.captureScreenShot("SuccessAuditedSupplierPage");
		     }catch(Exception e){
		    	 	 String Path=ReporterMaker.captureScreenShot("FailedAuditedSupplierPage");
		    	 	Hooks.test.addScreenCaptureFromPath(Path, "FailedAuditedSupplierPage");
		    	 	 CaptureScreenshot.captureScreenShot("FailedAuditedSupplierPage");
		             LoggerGeneretor.error("Failed to Load Audited Suppliers' Reports...");
		             Hooks.test.log(Status.FAIL,"Failed to Load Audited Suppliers' Reports...");
		     }
		}
		
		/*-----------------Clicking On Apply to Meet Supplier Button----------------*/
		public void clickingOnApplyToMeetSupplierBtn() {
			 try{
			     helper.clickOnElement(BuyerServicesPageUi.applyToMeetSupplierBtn);
			     WebElement Text=driver.findElement(BuyerServicesPageUi.headerBrowsingHsrtyValid);
			     String actualText=Text.getText();
			     String expectedText="Apply to Meet Suppliers";
			     helper.softAsserting(actualText, expectedText);
			     LoggerGeneretor.info("Clicked On Apply to Meet Supplier Button");
			     Hooks.test.log(Status.PASS,"Clicked On Apply to Meet Supplier Button");
			     }catch(Exception e){
			    	 	 String Path=ReporterMaker.captureScreenShot("FailedApplyToMeetSupplierBtn");
			    	 	 Hooks.test.addScreenCaptureFromPath(Path, "FailedApplyToMeetSupplierBtn");
			             CaptureScreenshot.captureScreenShot("FailedApplyToMeetSupplierBtn");
			             LoggerGeneretor.error("Failed to  click on Apply to Meet Supplier Button...");
			             Hooks.test.log(Status.FAIL,"Failed to click On Apply to Meet Supplier Button...");
			     }
		}
		
		/*-----------------Verify Apply to Meet Supplier Result Page----------------*/
		public void verifyingApplyToMeetSupplierPage() {
			 try{
			     WebElement Text=driver.findElement(BuyerServicesPageUi.headerBrowsingHsrtyValid);
			     String actualText=Text.getText();
			     String expectedText="Apply to Meet Suppliers";
			     helper.softAsserting(actualText, expectedText);
			     LoggerGeneretor.info("Clicked On Apply to Meet Supplier Button");
			     Hooks.test.log(Status.PASS,"Clicked On Apply to Meet Supplier Button");
			     String Path=ReporterMaker.captureScreenShot("SuccessApplyToMeetSupplierBtn");
			     Hooks.test.addScreenCaptureFromPath(Path, "SuccessApplyToMeetSupplierBtn");
		         CaptureScreenshot.captureScreenShot("SuccessApplyToMeetSupplierBtn");
			     }catch(Exception e){
			    	 	 String Path=ReporterMaker.captureScreenShot("FailedApplyToMeetSupplierBtn");
			    	 	Hooks.test.addScreenCaptureFromPath(Path, "FailedApplyToMeetSupplierBtn");
			             CaptureScreenshot.captureScreenShot("FailedApplyToMeetSupplierBtn");
			             LoggerGeneretor.error("Failed to  click on Apply to Meet Supplier Button...");
			             Hooks.test.log(Status.FAIL,"Failed to click On Apply to Meet Supplier Button...");
			     }
		}

		/*-------------------Clicking On New User Guide----------------------------*/
		public void clickingOnNewUserGuide() {
		     try{
		     helper.clickOnElement(HomePageUi.newUserGuide);
		     helper.switchToNewWindow();
		     WebElement Text=driver.findElement(BuyerServicesPageUi.startNow);
		     String actualText=Text.getText();
		     String expectedText="Start Now";
		     helper.softAsserting(actualText, expectedText);
		     LoggerGeneretor.info("Clicked On New User Guide");
		     Hooks.test.log(Status.PASS,"Clicked On New User Guide");
		     }catch(Exception e){
		    	 	String Path=ReporterMaker.captureScreenShot("FailedNewUserGuide");
		    	 	Hooks.test.addScreenCaptureFromPath(Path, "FailedNewUserGuide");
		             CaptureScreenshot.captureScreenShot("FailedNewUserGuide");
		             LoggerGeneretor.error("Failed to  click on New User Guide...");
		             Hooks.test.log(Status.FAIL,"Failed to click On CNew User Guide...");
		     }
		}
		
		/*-------------------Clicking On Start Now----------------------------*/
		public void clickingOnStartNow() {
		     try{
		     helper.clickOnElement(BuyerServicesPageUi.startNow);
		     Hooks.test.log(Status.PASS,"Clicked Start Now");
		     LoggerGeneretor.info("Clicked Start Now");
		     helper.switchToNewWindow();
		     }catch(Exception e){
		    	 	String Path=ReporterMaker.captureScreenShot("FailedStart Now");
		    	 	Hooks.test.addScreenCaptureFromPath(Path, "FailedStart Now");
		    	     CaptureScreenshot.captureScreenShot("FailedStart Now");
		             LoggerGeneretor.error("Failed to Click Start Now...");
		             Hooks.test.log(Status.FAIL,"Failed to Click Start Now...");
		     }
		}
		/*-------------------Verifying URL----------------------------*/
		public void verifyingUrl(String expectedURL) {
		     try{
			     String currentURL=driver.getCurrentUrl();
			     helper.softAsserting(currentURL, expectedURL);
			     Hooks.test.log(Status.PASS,"Same As Main URL");
			     LoggerGeneretor.info("Same As Main URL");
			     CaptureScreenshot.captureScreenShot("SuccessURL");
			     String Path=ReporterMaker.captureScreenShot("SuccessURL");
	 	 	     Hooks.test.addScreenCaptureFromPath(Path, "SuccessURL");
			     }catch(Exception e){
			    	 	String Path=ReporterMaker.captureScreenShot("FailedURL");
			    	 	Hooks.test.addScreenCaptureFromPath(Path, "FailedURL");
			             CaptureScreenshot.captureScreenShot("FailedURL");
			             LoggerGeneretor.error("Page Not Found...");
			             Hooks.test.log(Status.FAIL,"Page Not Found...");
			      }
		}
	
		
		/*------------------Clicking On Learn More---------------*/
		public void clickingOnLearnMore() {
		     try{
		     helper.waitForElementToBeVisible(BuyerServicesPageUi.learnMore, 10);
		     helper.clickOnElement(BuyerServicesPageUi.learnMore);
		     Hooks.test.log(Status.PASS,"Clicked Learn More");
		     LoggerGeneretor.info("Clicked Learn More");
		     helper.switchToNewWindow();
		     }catch(Exception e){
		    	 	String Path=ReporterMaker.captureScreenShot("FailedLearn More");
		    	 	Hooks.test.addScreenCaptureFromPath(Path, "FailedLearn More");
		    	     CaptureScreenshot.captureScreenShot("FailedLearn More");
		             LoggerGeneretor.error("Failed to Click Learn More...");
		             Hooks.test.log(Status.FAIL,"Failed to Click Learn More...");
		     }
		}
		/*------------------Verifying Page Header Of Learn More Page---------------*/
		public void verifyingPageHeaderOfLearnMorePage() {
		     try{
			     WebElement pageHeader=driver.findElement(BuyerServicesPageUi.learnMoreValid);
			     String actualHeader=pageHeader.getText();
			     String expectedHeader="How to Avoid Fraud";
			     helper.softAsserting(actualHeader,expectedHeader);
			     Hooks.test.log(Status.PASS,"Learn More Page Found");
			     LoggerGeneretor.info("Learn More Page Found");
			     CaptureScreenshot.captureScreenShot("SuccessTabletPC");
			     String Path=ReporterMaker.captureScreenShot("SuccessTabletPC");
	 	 	     Hooks.test.addScreenCaptureFromPath(Path, "SuccessTabletPC");
			     }catch(Exception e){
			    	 String Path=ReporterMaker.captureScreenShot("FailedLearnMorePage");
		 	 	     Hooks.test.addScreenCaptureFromPath(Path, "FailedLearnMorePage");
			             CaptureScreenshot.captureScreenShot("FailedLearnMorePage");
			             LoggerGeneretor.error("Learn More Page Not Found...");
			             Hooks.test.log(Status.FAIL,"Learn More Page Not Found...");
			      }	
		}
	
		
		
		
		/*------------------Clicking On Contact Us---------------*/	
		public void clickingOnContactUs() {
		     try{
		     helper.clickOnElement(HomePageUi.contactUS);
		     helper.switchToNewWindow();
		     WebElement Text=driver.findElement(BuyerServicesPageUi.frequentlyAskedQuestion);
		     String actualText=Text.getText();
		     String expectedText="Frequently Asked Questions";
		     helper.softAsserting(actualText, expectedText);
		     LoggerGeneretor.info("Clicked On Contact Us");
		     Hooks.test.log(Status.PASS,"Clicked On Contact Us");
		     }catch(Exception e){
		    	 	String Path=ReporterMaker.captureScreenShot("FailedContactUs");
		    	 	Hooks.test.addScreenCaptureFromPath(Path, "FailedContactUs");
		             CaptureScreenshot.captureScreenShot("FailedContactUs");
		             LoggerGeneretor.error("Failed to  click on Contact Us...");
		             Hooks.test.log(Status.FAIL,"Failed to click On Contact Us...");
		     }
		}
		/*------------------Clicking On FAQ---------------*/
		public void clickingOnFrequentlyAskedQuestion() {
		     try{
			     helper.clickOnElement(BuyerServicesPageUi.frequentlyAskedQuestion);
			     LoggerGeneretor.info("Clicked On Frequently Asked Question");
			     Hooks.test.log(Status.PASS,"Clicked On Frequently Asked Question");
			     }catch(Exception e){
			    	 	String Path=ReporterMaker.captureScreenShot("FailedFAQClick");
			    	 	Hooks.test.addScreenCaptureFromPath(Path, "FailedFAQClick");
			             CaptureScreenshot.captureScreenShot("FailedFAQClick");
			             LoggerGeneretor.error("Failed to  click on Frequently Asked Question...");
			             Hooks.test.log(Status.FAIL,"Failed to click On Frequently Asked Question...");
			     }
		}
		/*------------------Verifying Page Header of FAQ Result Page---------------*/
		public void verifyingPageHeaderOfFaq() {
		     try{
			     WebElement pageHeader=driver.findElement(BuyerServicesPageUi.frequentlyAQValid);
			     String actualHeader=pageHeader.getText();
			     String expectedHeader="Frequently Asked Questions";
			     helper.softAsserting(actualHeader,expectedHeader);
			     Hooks.test.log(Status.PASS,"Frequently Asked Question Page Found");
			     LoggerGeneretor.info("Frequently Asked Question Page Found");
			     CaptureScreenshot.captureScreenShot("SuccessFAQ");
			     String Path=ReporterMaker.captureScreenShot("SuccessFAQ");
	 	 	     Hooks.test.addScreenCaptureFromPath(Path, "SuccessFAQ");
			     }catch(Exception e){
			    	 String Path=ReporterMaker.captureScreenShot("FailedFAQPage");
		 	 	     Hooks.test.addScreenCaptureFromPath(Path, "FailedFAQPage");
			             CaptureScreenshot.captureScreenShot("FailedFAQPage");
			             LoggerGeneretor.error("Frequently Asked Question Page Not Found...");
			             Hooks.test.log(Status.FAIL,"Frequently Asked Question Page Not Found...");
			      }
		     
	}
	
		
		/*------------------Clicking On Browsing History---------------*/
		public void clickingOnBrowsingHistory() {
		     try{
		     helper.clickOnElement(HomePageUi.browsingHistory);
		     WebElement Text=driver.findElement(BuyerServicesPageUi.categoriesKeywords);
		     String actualText=Text.getText();
		     String expectedText="Categories & keywords";
		     helper.softAsserting(actualText, expectedText);
		     LoggerGeneretor.info("Clicked On Browsing History");
		     Hooks.test.log(Status.PASS,"Clicked On Browsing History");
		     }catch(Exception e){
		    	 String Path=ReporterMaker.captureScreenShot("FailedBrowsingHistoryClick");
	 	 	     Hooks.test.addScreenCaptureFromPath(Path, "FailedBrowsingHistoryClick");
		             CaptureScreenshot.captureScreenShot("FailedBrowsingHistoryClick");
		             LoggerGeneretor.error("Failed to  click on Browsing History...");
		             Hooks.test.log(Status.FAIL,"Failed to click On Browsing History...");
		     }
		}
		/*------------------Clicking On Categories Keyword---------------*/
		public void clickingOnCategoriesKeyword() {
		     try{
			     helper.clickOnElement(BuyerServicesPageUi.categoriesKeywords);
			     WebElement Text=driver.findElement(BuyerServicesPageUi.categoriesKeywords);
			     String actualText=Text.getText();
			     String expectedText="Categories & keywords";
			     helper.softAsserting(actualText, expectedText);
			     LoggerGeneretor.info("Clicked On Categories Keywords");
			     Hooks.test.log(Status.PASS,"Clicked On Categories Keywords");
			     }catch(Exception e){
			    	 String Path=ReporterMaker.captureScreenShot("FailedCategoriesKeywords");
		 	 	     Hooks.test.addScreenCaptureFromPath(Path, "FailedCategoriesKeywords");
			             CaptureScreenshot.captureScreenShot("FailedCategoriesKeywords");
			             LoggerGeneretor.error("Failed to  click on Categories Keywords...");
			             Hooks.test.log(Status.FAIL,"Failed to  click on Categories Keywords...");
			     }
		}
		/*------------------Clicking On Audited Suppliers---------------*/
		public void clickingOnAuditedSuppliers() {
		     try{
			     helper.clickOnElement(BuyerServicesPageUi.auditedSuppliers);
			     WebElement Text=driver.findElement(BuyerServicesPageUi.auditedSuppliers);
			     String actualText=Text.getText();
			     String expectedText="Audited Suppliers";
			     helper.softAsserting(actualText, expectedText);
			     LoggerGeneretor.info("Clicked On Audited Suppliers");
			     Hooks.test.log(Status.PASS,"Clicked On Audited Suppliers");
			     }catch(Exception e){
			    	 String Path=ReporterMaker.captureScreenShot("FailedAuditedSuppliers");
		 	 	     Hooks.test.addScreenCaptureFromPath(Path, "FailedAuditedSuppliers");
			             CaptureScreenshot.captureScreenShot("FailedAuditedSuppliers");
			             LoggerGeneretor.error("Failed to  click on Audited Suppliers...");
			             Hooks.test.log(Status.FAIL,"Failed to  click on Audited Suppliers...");
			     }
		}
		/*------------------Clicking On Product History Button---------------*/
		public void clickingOnProductHistoryButton() {
		     try{
			     helper.clickOnElement(BuyerServicesPageUi.productHistory);
			     WebElement Text=driver.findElement(BuyerServicesPageUi.productHistory);
			     String actualText=Text.getText();
			     String expectedText="Products";
			     helper.softAsserting(actualText, expectedText);
			     LoggerGeneretor.info("Clicked On Product History");
			     Hooks.test.log(Status.PASS,"Clicked On Product History");
			     }catch(Exception e){
			    	 String Path=ReporterMaker.captureScreenShot("FailedProductHistoryClick");
		 	 	     Hooks.test.addScreenCaptureFromPath(Path, "FailedProductHistoryClick");
			             CaptureScreenshot.captureScreenShot("FailedProductHistoryClick");
			             LoggerGeneretor.error("Failed to  click on Product History...");
			             Hooks.test.log(Status.FAIL,"Failed to click On Product History...");
			     }
		}
		/*------------------Verifying Product History Result Result Page---------------*/
		public void verifyingHistoryPage() {
		     try{
			     WebElement pageHeader=driver.findElement(BuyerServicesPageUi.headerBrowsingHsrtyValid);
			     String actualHeader=pageHeader.getText();
			     String expectedHeader="Your Recent Visit History";
			     helper.softAsserting(actualHeader,expectedHeader);
			     Hooks.test.log(Status.PASS,"Product History Page Found");
			     LoggerGeneretor.info("Product History Page Found");
			     CaptureScreenshot.captureScreenShot("SuccessProductHistoryPage");
			     String Path=ReporterMaker.captureScreenShot("SuccessProductHistoryPage");
	 	 	     Hooks.test.addScreenCaptureFromPath(Path, "SuccessProductHistoryPage");
			     }catch(Exception e){
			    	 String Path=ReporterMaker.captureScreenShot("FailedProductHistoryPage");
		 	 	     Hooks.test.addScreenCaptureFromPath(Path, "FailedProductHistoryPage");
			             CaptureScreenshot.captureScreenShot("FailedProductHistoryPage");
			             LoggerGeneretor.error("Product History Page Not Found...");
			             Hooks.test.log(Status.FAIL,"Product History Page Not Found...");
			      }
		     
	}
	
	
}

