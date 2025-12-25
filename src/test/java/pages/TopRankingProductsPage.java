package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import stepdefinition.Hooks;
import uistore.SearchResultPageUi;
import uistore.TopRankingProductsUi;
import utils.CaptureScreenshot;
import utils.DriverHelper;
import utils.LoggerGeneretor;
import utils.ReporterMaker;

public class TopRankingProductsPage {
	
    WebDriver driver;
    DriverHelper helper;
    HomePage home;
public TopRankingProductsPage(WebDriver driver){
    this.driver=driver;
    helper=new DriverHelper(driver); 
    home=new HomePage(driver);
    
}
			
 
 /*---------------------------Methods-------------------------------------*/
	
	/*---------------Clicking On  Best Selling-------------*/	
	public void clickingOnBestSellingButton() throws InterruptedException{
		try{
			 Thread.sleep(3000);
		     helper.clickOnElement(TopRankingProductsUi.bestSellingBtn);
		     Thread.sleep(2500);
		     WebElement Text=driver.findElement(TopRankingProductsUi.titleValid);
		     String actualText=Text.getText();
		     String expectedText="Best Selling";
		     helper.softAssertContaing(actualText,expectedText);
		     LoggerGeneretor.info("Clicked BestSelling");
		     Hooks.test.log(Status.PASS,"Clicked BestSelling");
		     }catch(Exception e){
		    	 	String Path=ReporterMaker.captureScreenShot("FailedClickBestSelling");
		    	 	Hooks.test.addScreenCaptureFromPath(Path, "FailedClickBestSelling");
		    	 	 CaptureScreenshot.captureScreenShot("FailedClickBestSelling");
		             LoggerGeneretor.error("Failed to Click On BestSelling...");
		             Hooks.test.log(Status.FAIL,"Failed to Click On BestSelling...");
		     }
		}


/*----------------------------Handling Frames-----------------------------------*/
	/*---------------Clicking On  Wish List icon-------------*/
	public void clickingOnFavIcon() throws InterruptedException{
		try{
			 helper.waitForElementToBeVisible(TopRankingProductsUi.favIcon, 5);
		     helper.clickOnElement(TopRankingProductsUi.favIcon);
		     Hooks.test.log(Status.PASS,"Clicked Fav icon");
		     LoggerGeneretor.info("Clicked Fav icon");
		     driver.switchTo().frame(driver.findElement(By.id("popupIframe")));
		     Thread.sleep(2000);
		     WebElement Text=driver.findElement(TopRankingProductsUi.signInValid);
		     System.out.println(Text);
		     String actualText=Text.getText();
		     String expectedText="Sign In";
		     helper.softAsserting(actualText, expectedText);
		     driver.switchTo().parentFrame();
		     driver.navigate().refresh();
		     }catch(Exception e){
		    	     CaptureScreenshot.captureScreenShot("FailedClickedFavicon");
		    	     String Path=ReporterMaker.captureScreenShot("FailedClickFavicon");
			    		Hooks.test.addScreenCaptureFromPath(Path, "FailedClickFavicon");
		             LoggerGeneretor.error("Failed to Click Fav icon...");
		             Hooks.test.log(Status.FAIL,"Failed to Click Fav icon...");
		     }
		}

	/*---------------Clicking On Start Order Request Button-------------*/
	public void clickingOnStartOrderRequest() {
		try{
		     helper.clickOnElement(TopRankingProductsUi.startNowBtn);
		     Hooks.test.log(Status.PASS,"Clicked Start Order Request");
		     LoggerGeneretor.info("Clicked Start Order Request");
		     helper.switchToNewWindow();
		     WebElement Text=driver.findElement(TopRankingProductsUi.submitOrderValid);
		     String actualText=Text.getText();
		     String expectedText="Buyer Info.";
		     helper.softAsserting(actualText, expectedText);
		     }catch(Exception e){
		    	     CaptureScreenshot.captureScreenShot("FailedStartOrderRequest");
		    	     String Path=ReporterMaker.captureScreenShot("FailedStartOrderRequest");
			    		Hooks.test.addScreenCaptureFromPath(Path, "FailedStartOrderRequest");
		             LoggerGeneretor.error("Failed to Click Start Order Request...");
		             Hooks.test.log(Status.FAIL,"Failed to Click Start Order Request...");
		     }
		}

	/*---------------Clicking On Submit Order-------------*/
	public void clickingOnSubmitOrder() {
		try{
		     helper.clickOnElement(TopRankingProductsUi.submitOrder);
		     WebElement Text=driver.findElement(TopRankingProductsUi.submitOrderValid);
		     String actualText=Text.getText();
		     String expectedText="Buyer Info.";
		     helper.softAsserting(actualText, expectedText);
		     Hooks.test.log(Status.PASS,"Clicked Submit Order");
		     LoggerGeneretor.info("Clicked Submit Order");
		     
		     }catch(Exception e){
		    	     CaptureScreenshot.captureScreenShot("FailedSubmitOrder");
		    	     String Path=ReporterMaker.captureScreenShot("FailedSubmitOrder");
			    	 Hooks.test.addScreenCaptureFromPath(Path, "FailedSubmitOrder");
		             LoggerGeneretor.error("Failed to Click Submit Order...");
		             Hooks.test.log(Status.FAIL,"Failed to Click Submit Order...");
		     }
	}
	/*---------------Verifying  Submit Order Page-------------*/
	public void verifyingSubmitOrderPage() {
		try{
		     WebElement Text=driver.findElement(TopRankingProductsUi.submitOrderValid);
		     String actualText=Text.getText();
		     String expectedText="Buyer Info.";
		     helper.softAsserting(actualText, expectedText);
		     Hooks.test.log(Status.PASS,"Clicked Submit Order");
		     LoggerGeneretor.info("Clicked Submit Order");
		     CaptureScreenshot.captureScreenShot("SuccessSubmitOrderPage");
    	     String Path=ReporterMaker.captureScreenShot("SuccessSubmitOrderPage");
	    	 Hooks.test.addScreenCaptureFromPath(Path, "SuccessSubmitOrderPage");
		     }catch(Exception e){
		    	     CaptureScreenshot.captureScreenShot("FailedSubmitOrderPage");
		    	     String Path=ReporterMaker.captureScreenShot("FailedSubmitOrderPage");
			    	 Hooks.test.addScreenCaptureFromPath(Path, "FailedSubmitOrderPage");
		             LoggerGeneretor.error("Failed to Found Submit Order Page...");
		             Hooks.test.log(Status.FAIL,"Failed to Found Submit Order Page......");
		     }
	}

	
	
	/*---------------Clicking On New Release-------------*/
	public void clickingOnNewRelease() throws InterruptedException{
		try{
			Thread.sleep(3000);
		     helper.clickOnElement(TopRankingProductsUi.newReleases);
		     Thread.sleep(2500);
		     WebElement Text=driver.findElement(TopRankingProductsUi.titleValid);
		     String actualText=Text.getText();
		     String expectedText="New Releases";
		     helper.softAssertContaing(actualText,expectedText);
		     LoggerGeneretor.info("Clicked New Releases");
		     Hooks.test.log(Status.PASS,"Clicked New Releases");
		     }catch(Exception e){
		    	 	String Path=ReporterMaker.captureScreenShot("FailedClickNewReleases");
		    	 	Hooks.test.addScreenCaptureFromPath(Path, "FailedClickNewReleases");
		    	 	 CaptureScreenshot.captureScreenShot("FailedClickNewReleases");
		             LoggerGeneretor.error("Failed to Click On New Releases...");
		             Hooks.test.log(Status.FAIL,"Failed to Click On New Releases...");
		     }
	}

	/*---------------Clicking On First Trending Product-------------*/
	public void clickingOnFirstTrendingProduct() {
		
		try{
		     helper.clickOnElement(TopRankingProductsUi.firstTopTrendingPrdct);
		     helper.switchToNewWindow();
		     WebElement productPageFound=driver.findElement(SearchResultPageUi.productDetailsValid);
		     String actualText=productPageFound.getText();
		     String expectedText="Product Details";
		     helper.softAsserting(actualText, expectedText);
		     Hooks.test.log(Status.PASS,"Clicked First Product Card");
		     LoggerGeneretor.info("Clicked First Product Card");
		     }catch(Exception e){
		    	     CaptureScreenshot.captureScreenShot("FailedFirstPrdctClick");
		    	     String Path=ReporterMaker.captureScreenShot("FailedFirstPrdctClick");
			    		Hooks.test.addScreenCaptureFromPath(Path, "FailedFirstPrdctClick");
		             LoggerGeneretor.error("Failed to Click First Product Card...");
		             Hooks.test.log(Status.FAIL,"Failed to Click First Product Card...");
		     }
	}

	/*---------------Clicking On Add Inquiry Basket-------------*/
	public void clickingOnAddInquiryBasket() {
		try{
			 helper.javascriptScroll(TopRankingProductsUi.scrollUptoAddInquiryBasket);
		     helper.clickOnElement(TopRankingProductsUi.addInquiryBasket);
		     WebElement productPageFound=driver.findElement(SearchResultPageUi.productDetailsValid);
		     String actualText=productPageFound.getText();
		     String expectedText="Product Details";
		     helper.softAsserting(actualText, expectedText);
		     Hooks.test.log(Status.PASS,"Clicked Add Inquiry Basket");
		     LoggerGeneretor.info("Clicked Add Inquiry Basket");
		     }catch(Exception e){
		    	     CaptureScreenshot.captureScreenShot("FailedAddInquiryBasket");
		    	     String Path=ReporterMaker.captureScreenShot("FailedAddInquiryBasket");
			    	 Hooks.test.addScreenCaptureFromPath(Path, "FailedAddInquiryBasket");
		             LoggerGeneretor.error("Failed to Click Add Inquiry Basket...");
		             Hooks.test.log(Status.FAIL,"Failed to Click Add Inquiry Basket...");
		     }
	}
	
	/*---------------Clicking On Inquiry Basket icon-------------*/
	public void clickingOnInquiryBasketIcon() {
		try{
		     helper.clickOnElement(TopRankingProductsUi.inquiryBasketIcon);
		     helper.switchToNewWindow();
		     WebElement productPageFound=driver.findElement(By.xpath("//div[@class='m-channel-name']"));
		     String actualText=productPageFound.getText();
		     String expectedText="Inquiry Basket";
		     helper.softAsserting(actualText, expectedText);
		     Hooks.test.log(Status.PASS,"Clicked Add Inquiry Basket icon");
		     LoggerGeneretor.info("Clicked Add Inquiry Basket icon");
		     }catch(Exception e){
		    	     CaptureScreenshot.captureScreenShot("FailedAddInquiryBasketIcon");
		    	     String Path=ReporterMaker.captureScreenShot("FailedAddInquiryBasketIcon");
			    	 Hooks.test.addScreenCaptureFromPath(Path, "FailedAddInquiryBasketIcon");
		             LoggerGeneretor.error("Failed to Click Add Inquiry Basket icon...");
		             Hooks.test.log(Status.FAIL,"Failed to Click Add Inquiry Basket icon...");
		     }
		
	}
	/*---------------verifying Inquiry Basket page-------------*/
	public void verifyingInquiryBasketPage() {
		try{
		     WebElement productPageFound=driver.findElement(By.xpath("//div[@class='m-channel-name']"));
		     String actualText=productPageFound.getText();
		     String expectedText="Inquiry Basket";
		     helper.softAsserting(actualText, expectedText);
		     Hooks.test.log(Status.PASS,"Found Inquiry Basket page");
		     LoggerGeneretor.info("Found Inquiry Basket page");
		     CaptureScreenshot.captureScreenShot("SuccessAddInquiryBasketPage");
    	     String Path=ReporterMaker.captureScreenShot("SuccessAddInquiryBasketPage");
	    	 Hooks.test.addScreenCaptureFromPath(Path, "SuccessAddInquiryBasketPage");
		     }catch(Exception e){
		    	     CaptureScreenshot.captureScreenShot("FailedAddInquiryBasketPage");
		    	     String Path=ReporterMaker.captureScreenShot("FailedAddInquiryBasketPage");
			    	 Hooks.test.addScreenCaptureFromPath(Path, "FailedAddInquiryBasketPage");
		             LoggerGeneretor.error("Failed to Found Inquiry Basket page...");
		             Hooks.test.log(Status.FAIL,"Failed to Found Inquiry Basket page...");
		     }
		
	}
}
