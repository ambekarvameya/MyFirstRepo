package com.newtours.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class SupportPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator="text.underconstruction.supportpage")
	private QAFWebElement textUnderConstruction;
	
	@FindBy(locator="button.backtohomepage.destinationspage")
	private QAFWebElement buttonBackToHomePage;
	
	public QAFWebElement getTextUnderConstruction() {
		return textUnderConstruction;
	}




	public QAFWebElement getButtonBackToHomePage() {
		return buttonBackToHomePage;
	}
	
	
	public boolean verifyTextUnderConstruction()
	{
		return textUnderConstruction.verifyVisible();
	}
	
	public boolean verifyButtonBackToHomePage()
	{
		return buttonBackToHomePage.verifyVisible();
	}
	
	public void clickButtonBackToHomePage()
	{
		buttonBackToHomePage.click();
	}
	
	
	
	
	
	@Override
	protected void openPage(PageLocator locator, Object... args) {
		// TODO Auto-generated method stub
		
	}
	
	

}
