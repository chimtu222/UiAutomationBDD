package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import stepdefinition.Hooks;
import uistore.SignInPageUi;
import utils.LoggerGeneretor;
import utils.ReporterMaker;
import utils.CaptureScreenshot;
import utils.DriverHelper;

public class SigninPage {
	
    WebDriver driver;
    DriverHelper helper;
    HomePage home;
public SigninPage(WebDriver driver){
    this.driver=driver;
    helper=new DriverHelper(driver); 
    home=new HomePage(driver);
}
		


/*------------------------Methods---------------------------------------------------*/
		
		/*--------------------Clicking On Sign in Button---------------------------*/
		public void clickingOnSignInButton(){
		     try{
		     helper.clickOnElement(SignInPageUi.SigninSubmit);
		     WebElement Text=driver.findElement(SignInPageUi.SigninSubmit);
		     String actualText=Text.getText();
		     String expectedText="Sign In";
		     helper.softAsserting(actualText, expectedText);
		     Hooks.test.log(Status.PASS,"Clicked Sign in Button");
		     LoggerGeneretor.info("Clicked Sign in Button");
		     }catch(Exception e){
		    	     String Path=ReporterMaker.captureScreenShot("FailedSignin Button");
		 	 	     Hooks.test.addScreenCaptureFromPath(Path, "FailedSignin Button");
		    	     CaptureScreenshot.captureScreenShot("FailedSignin Button");
		             LoggerGeneretor.error("Failed to Click Sign in Button...");
		             Hooks.test.log(Status.FAIL,"Failed to Click Sign in Button...");
		     }
		
		}
		/*------------------Verifying Email warning Message---------------------------*/
		public void verifyingEmailWarnText(){
		     try{
		     WebElement emailWarnMsg=driver.findElement(SignInPageUi.emailWarnText);
		     String actualWarningText=emailWarnMsg.getText();
		     String expectedWarningText="Please enter your Email Address or Member ID.";
		     helper.softAsserting(actualWarningText, expectedWarningText);
		     Hooks.test.log(Status.PASS,"Email Warning Present");
		     LoggerGeneretor.info("Email Warning Present");
		     }catch(Exception e){
		    	     String Path=ReporterMaker.captureScreenShot("FailedEmailWarning");
		 	 	     Hooks.test.addScreenCaptureFromPath(Path, "FailedEmailWarning");
		             CaptureScreenshot.captureScreenShot("FailedEmailWarning");
		             LoggerGeneretor.error("Email Warning Not Present...");
		             Hooks.test.log(Status.FAIL,"Email Warning Not Present...");
		      }
		}
		
		/*----------------------------Verifying Password Warn Text-----------------------*/
		public void verifyingPasswordWarnText(){
		     
		try{
		    WebElement passwordWarnMsg=driver.findElement(SignInPageUi.passwordWarnText);
		    String actualWarningText=passwordWarnMsg.getText();
		    String expectedWarningText="Please enter your Password.";
		    helper.softAsserting(actualWarningText, expectedWarningText);
		    CaptureScreenshot.captureScreenShot("SuccessPass&EmailWarningText");
		    Hooks.test.log(Status.PASS,"Password Warning Present");
		    LoggerGeneretor.info("Password Warning Present");
		    }catch(Exception e){
		    	String Path=ReporterMaker.captureScreenShot("FailedPasswordWarning");
			 	Hooks.test.addScreenCaptureFromPath(Path, "FailedPasswordWarning");
		            CaptureScreenshot.captureScreenShot("FailedPasswordWarning");
		            LoggerGeneretor.error("Password Warning Not Present...");
		            Hooks.test.log(Status.FAIL,"Password Warning Not Present...");
		     }
		}
		/*----------------------------Clicking On FaceBook icon-----------------------*/
		public void clickingOnFaceBookIcon(){
		try{
		    helper.clickOnElement(SignInPageUi.facebookIcon);
		    helper.switchToNewWindow();
		    Hooks.test.log(Status.PASS,"Clicked FaceBook icon");
		    LoggerGeneretor.info("Clicked FaceBook icon");
		    }catch(Exception e){
		    		String Path=ReporterMaker.captureScreenShot("FailedFacebookIcon");
		    		Hooks.test.addScreenCaptureFromPath(Path, "FailedFacebookIcon");
		    	    CaptureScreenshot.captureScreenShot("FailedFacebookIcon");
		            LoggerGeneretor.error("Failed to Click FaceBook icon...");
		            Hooks.test.log(Status.FAIL,"Failed to Click FaceBook icon...");
		    }
		}
		/*----------------------------Verifying FaceBook Page-----------------------*/
		public void verifyingFaceBookPage(){
		
		try{
		    String actualUrl=driver.getCurrentUrl();
		    String expectedUrl="https://www.facebook.com/login";
		    helper.softAssertContaing(actualUrl,expectedUrl);
		    Hooks.test.log(Status.PASS,"FaceBook Log in Page Verified");
		    LoggerGeneretor.info("FaceBook Log in Page Verified");
		    CaptureScreenshot.captureScreenShot("SuccessFacebookLoginPage");
		    String Path=ReporterMaker.captureScreenShot("SuccessFacebookLoginPage");
			Hooks.test.addScreenCaptureFromPath(Path, "SuccessFacebookLoginPage");
		    }catch(Exception e){
		    		String Path=ReporterMaker.captureScreenShot("FailedFaceBookLogin");
		    		Hooks.test.addScreenCaptureFromPath(Path, "FailedFaceBookLogin");
		            CaptureScreenshot.captureScreenShot("FailedFaceBookLogin");
		            LoggerGeneretor.error("FaceBook Log in Page Not Found...");
		            Hooks.test.log(Status.FAIL,"FaceBook Log in Page Not Found...");
		     }
	
	    }
		/*----------------------------Clicking On ForgotPassword-----------------------*/		
		public void clickingOnForgotPassword() {
		try {
		helper.clickOnElement(SignInPageUi.forgotPassword);
		WebElement forgotPasswordPage=driver.findElement(SignInPageUi.forgotPasswordVerification);
	    String actualWarningText=forgotPasswordPage.getText();
	    String expectedWarningText="Reset Your Password";
	    helper.softAsserting(actualWarningText, expectedWarningText);
		Hooks.test.log(Status.PASS,"Clicked Forgot Password");
	    LoggerGeneretor.info("Clicked Forgot Password");
		
		}catch(Exception e) {
		String Path=ReporterMaker.captureScreenShot("FailedForgotPassword");
	 	Hooks.test.addScreenCaptureFromPath(Path, "FailedForgotPassword");
		CaptureScreenshot.captureScreenShot("FailedForgotPassword");
        LoggerGeneretor.error("Failed to Click Forgot Password...");
        Hooks.test.log(Status.FAIL,"Failed to Click Forgot Password...");
		}
	}
		
		/*----------------------------Verifying Forgot Password Page-----------------------*/
		public void verifyingForgotPasswordPage() {
		try{
	    WebElement forgotPasswordPage=driver.findElement(SignInPageUi.forgotPasswordVerification);
	    String actualWarningText=forgotPasswordPage.getText();
	    String expectedWarningText="Reset Your Password";
	    helper.softAsserting(actualWarningText, expectedWarningText);
	    Hooks.test.log(Status.PASS,"Forgot Password Page Verified");
	    LoggerGeneretor.info("Forgot Password Page Verified");
	    CaptureScreenshot.captureScreenShot("SuccessForgotPasswordPage");
	    String Path=ReporterMaker.captureScreenShot("SuccessForgotPasswordPage");
		Hooks.test.addScreenCaptureFromPath(Path, "SuccessForgotPasswordPage");
	    }catch(Exception e){
	    		String Path=ReporterMaker.captureScreenShot("FailedForgotPasswordPage");
	    		Hooks.test.addScreenCaptureFromPath(Path, "FailedForgotPasswordPage");
	            CaptureScreenshot.captureScreenShot("FailedForgotPasswordPage");
	            LoggerGeneretor.error("Forgot Password Page Not Found...");
	            Hooks.test.log(Status.FAIL,"Forgot Password Page Not Found...");
	     }
	}
}
