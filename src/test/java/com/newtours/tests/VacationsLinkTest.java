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
import com.newtours.pages.HomePage;
import com.newtours.pages.VacationsPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Validator;

public class VacationsLinkTest extends WebDriverTestCase {
	
	public HomePage homePage;
	public VacationsPage vacationPage;
	
	@BeforeClass
	public void init()
	{
		getDriver().get("/");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}
	
	
	@Test(description="User should click on vacations link. Vacations page should be under construction")
	public void vacationsLinkTest()
	{
		homePage = new HomePage();
		vacationPage = new VacationsPage();
		
		homePage.clickVacationsLink();
		Validator.verifyTrue(vacationPage.verifyTextUnderConstruction(), "Page under construction message is not dispalyed", "Page under construction message is displayed");
		Validator.verifyTrue(vacationPage.verifyButtonBackToHome(), "Back to home button is not displayed", "Back to home button is displayed");
		vacationPage.clickBackToHomeButton();
		Validator.verifyThat(getDriver().getCurrentUrl(), Matchers.equalTo(getProperty("backtohomepage.url")));
		
	}
	
	
	@AfterMethod
	@AfterClass
	public void tearDown()
	{
		getDriver().close();
	}

}
