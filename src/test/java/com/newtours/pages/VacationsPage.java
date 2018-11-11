package com.newtours.pages;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class VacationsPage extends WebDriverBaseTestPage<WebDriverTestPage> {
	
	@FindBy(locator="text.underconstruction.vacationspage")
	private QAFWebElement textUnderConstruction;
	
	@FindBy(locator="button.backtohomepage.vacationspage")
	private QAFWebElement buttonBackToHome;

	public QAFWebElement getTextUnderConstruction() {
		return textUnderConstruction;
	}

	public QAFWebElement getButtonBackToHome() {
		return buttonBackToHome;
	}
	
	
	public boolean verifyTextUnderConstruction()
	{
		return textUnderConstruction.verifyPresent();
	}
	
	public boolean verifyButtonBackToHome()
	{
		return buttonBackToHome.verifyPresent();
	}
	
	public void clickBackToHomeButton()
	{
		buttonBackToHome.click();
	}

	@Override
	protected void openPage(PageLocator locator, Object... args) {
		
	}
}
