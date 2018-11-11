package com.newtours.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static com.newtours.util.CommonMethods.getProperty;
import com.newtours.pages.DestinationsPage;
import com.newtours.pages.HomePage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Validator;

public class DestinationsLinkTest extends WebDriverTestCase {
	
	public HomePage homePage;
	public DestinationsPage destinationsPage;
	
	@BeforeClass
	public void init()
	{
		getDriver().get("/");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}
	
	
	@Test(description="Navigate to destinations page and verify under construction message")
	public void destinationsLinkTest()
	{
		homePage = new HomePage();
		destinationsPage = new DestinationsPage();
		
		homePage.clickDestinationsLink();
		Validator.verifyTrue(destinationsPage.verifyTextUnderConstruction(), "This page is under construction message is not displayed", "This page is under construction message is displayed");
		Validator.verifyTrue(destinationsPage.verifyButtonBackToHomePage(), "Back to Home button is not displayed", "Back to home button is displayed");
		destinationsPage.clickButtonBackToHomePage();
		Validator.verifyThat(getDriver().getCurrentUrl(), Matchers.equalTo(getProperty("backtohomepage.url")));
	}
	
	
	@AfterMethod
	@AfterClass
	public void tearDown()
	{
		getDriver().close();
	}

}
