package stepdefinition;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import utils.JProgressBar;
import utils.ReporterMaker;
import utils.SendEmail;
import utils.SetUpBrowser;
 
public class Hooks extends SetUpBrowser{
    public static ExtentReports reports;
    public static ExtentTest test;
    private static JProgressBar progress;
    
    /*----------------------Opening Browser----------------------------*/
    @Given("I Open The url for made in china")
	public void i_open_the_url_for_made_in_china() {
	   openBrowser();
	}
    /*----------------Calling ReportMaker From Utils -----------------*/
    @BeforeAll
    public static void makeReport(){
        reports=ReporterMaker.generateExtentReport("MadeinChinaReport");
        progress=new JProgressBar();
    }
    /*----------------Initializing Test By Fetching the Scenario -----------------*/
   @Before
    public  void initializeTest(Scenario testScenario ){
        String testReport = testScenario.getName();
        test=reports.createTest(testReport);
 
    }
    
    /*----------------Quiting Browser-----------------*/
	@After
	public void quitingBrowser(){
	    driver.quit();
	    progress.updateProgress();
	}
    /*----------Flushing the Report and sending it to Project Owner---------------*/
    @AfterAll
    public static void flusingReport(){
    	reports.flush();
		System.out.println();
		SendEmail email=new SendEmail();
		System.out.println();
		email.senEmail();
		System.out.println();
		System.out.println();
    }
}
