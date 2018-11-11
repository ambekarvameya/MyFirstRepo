package com.newtours.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static com.newtours.util.CommonMethods.getProperty;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.newtours.pages.CreateAccountSuccessPage;
import com.newtours.pages.HomePage;
import com.newtours.pages.RegisterPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.util.Validator;

public class RegistrationTest extends WebDriverTestCase {
	
	public HomePage homePage;
	public RegisterPage registerPage;
	public CreateAccountSuccessPage createAccountSuccessPage;
	
	@BeforeClass
	public void init()
	{
		getDriver().get("/");
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
	}
	
	@AfterMethod
	public void redirectToHomePage()
	{
		getDriver().get("/");
	}
	
	@Test(description="Enter valid data on registration page and verify confirmation")
	public void validRegistrationSuccess()
	{
		homePage = new HomePage();
		registerPage = new RegisterPage();
		createAccountSuccessPage = new CreateAccountSuccessPage();
		
		homePage.clickRegisterLink();
		registerPage.fillDetails("register");
		registerPage.clickSubmit();
		Validator.verifyThat(getDriver().getCurrentUrl(), Matchers.equalTo(getProperty("createaccountsuccesspage.url")));
		Validator.verifyTrue(createAccountSuccessPage.verifyConfirmationText(),"Confirmation message is not displayed","Confirmation message is displayed");
		
	}
	
	@Test(description="")
	public void invalidRegistrationSuccess()
	{
		homePage = new HomePage();
		registerPage = new RegisterPage();
		createAccountSuccessPage = new CreateAccountSuccessPage();
		
		homePage.clickRegisterLink();
		registerPage.fillDetails("register-invalid");
		registerPage.clickSubmit();
		Validator.verifyThat(getDriver().getCurrentUrl(), Matchers.equalTo(getProperty("createaccountsuccesspage.url")));
		Validator.verifyTrue(createAccountSuccessPage.verifyConfirmationText(),"Confirmation message is not displayed","Confirmation message is displayed");
	}
	
	@Test(description="")
	public void blankRegistrationSuccess()
	{
		homePage = new HomePage();
		registerPage = new RegisterPage();
		createAccountSuccessPage = new CreateAccountSuccessPage();
		
		homePage.clickRegisterLink();
		registerPage.clickSubmit();
		Validator.verifyThat(getDriver().getCurrentUrl(), Matchers.equalTo(getProperty("createaccountsuccesspage.url")));
		Validator.verifyTrue(createAccountSuccessPage.verifyConfirmationText(),"Confirmation message is not displayed","Confirmation message is displayed");
	}
	
	@AfterMethod
	@AfterClass
	public void tearDown()
	{
		getDriver().close();
	}

}
