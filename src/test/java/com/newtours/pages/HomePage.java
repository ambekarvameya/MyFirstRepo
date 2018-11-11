package com.newtours.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class HomePage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator="input.username.homepage")
	private QAFWebElement txtBoxUsername;
	
	@FindBy(locator="input.password.homepage")
	private QAFWebElement txtBoxPassword;
	
	@FindBy(locator="link.flights.homepage")
	private QAFWebElement linkFlights;
	
	@FindBy(locator="link.signon.homepage")
	private QAFWebElement linkSignOn;
	
	@FindBy(locator="link.signoff.homepage")
	private QAFWebElement linkSignOff;
	
	@FindBy(locator="link.hotels.homepage")
	private QAFWebElement linkHotels;
	
	@FindBy(locator="link.cruises.homepage")
	private QAFWebElement linkCruises;
	
	@FindBy(locator="link.destinations.homepage")
	private QAFWebElement linkDestinations;
	
	@FindBy(locator="link.vacations.homepage")
	private QAFWebElement linkVacations;
	
	@FindBy(locator="link.support.homepage")
	private QAFWebElement linkSupport;
	
	@FindBy(locator="link.contact.homepage")
	private QAFWebElement linkContact;
	
	@FindBy(locator="link.register.homepage")
	private QAFWebElement linkRegister;
	
	public QAFWebElement getLinkRegister()
	{
		return linkRegister;
	}
	
	public QAFWebElement getLinkCruises()
	{
		return linkCruises;
	}
	
	public QAFWebElement getLinkHotels()
	{
		return linkHotels;
	}
	
	
	
	public QAFWebElement getLinkSignOff() {
		return linkSignOff;
	}


	

	public QAFWebElement getLinkDestinations() {
		return linkDestinations;
	}

	public QAFWebElement getLinkVacations() {
		return linkVacations;
	}

	public QAFWebElement getLinkSupport() {
		return linkSupport;
	}

	public QAFWebElement getLinkContact() {
		return linkContact;
	}

	public QAFWebElement getSignOn()
	{
		return linkSignOn;
	}
	
	
	
	
	public QAFWebElement getTxtBoxUsername() {
		return txtBoxUsername;
	}




	public QAFWebElement getTxtBoxPassword() {
		return txtBoxPassword;
	}




	public QAFWebElement getLinkFlights() {
		return linkFlights;
	}
	
	public void clickFlightsLink()
	{
		linkFlights.click();
	}

	public void clickCruisesLink()
	{
		linkCruises.click();
	}
	
	
	public void clickHotelsLink()
	{
		linkHotels.click();
	}

	public void clickSingOnLink()
	{
		linkSignOn.click();
	}
	
	public void clickDestinationsLink()
	{
		linkDestinations.click();
	}
	
	public void clickVacationsLink()
	{
		linkVacations.click();
	}
	
	public void clickSupportLink()
	{
		linkSupport.click();
	}
	
	public void clickContactLink()
	{
		linkContact.click();
	}
	
	public void clickRegisterLink()
	{
		linkRegister.click();
	}

	@Override
	protected void openPage(PageLocator locator, Object... args) {
	}
	
	

}
