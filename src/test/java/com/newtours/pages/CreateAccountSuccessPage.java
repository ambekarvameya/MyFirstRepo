package com.newtours.pages;

import java.util.List;

import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class CreateAccountSuccessPage extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator="text.confirmation.createaccountsuccesspage")
	private List<QAFWebElement> textConfirmation;
	
	public List<QAFWebElement> getTextConfirmation()
	{
		return textConfirmation;
	}
	
	public boolean verifyConfirmationText()
	{
		boolean flag = true;
		for(QAFWebElement element: textConfirmation)
		{
			if(!element.isDisplayed())
			{
				flag=false;
				break;
			}
		}
		
		return flag;
	}
	
	@Override
	protected void openPage(PageLocator locator, Object... args) {	
	}

}
