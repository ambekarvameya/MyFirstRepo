package com.newtours.pages;

import com.newtours.beans.RegistrationBean;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class RegisterPage extends WebDriverBaseTestPage<WebDriverTestPage> {
	
	@FindBy(locator="select.country.registerpage")
	private QAFWebElement selectCountry;
	
	@FindBy(locator="button.submit.registerpage")
	private QAFWebElement buttonSubmit;
	
	
	public QAFWebElement getButtonSubmit()
	{
		return buttonSubmit;
	}
	
	public QAFWebElement getSelectCountry()
	{
		return selectCountry;
	}
	
	public void fillDetails(String key)
	{
		RegistrationBean bean = new RegistrationBean();
		bean.fillFromConfig(key);
		bean.fillUiElements();
	}
	
	public void clickSubmit()
	{
		buttonSubmit.click();
	}

	@Override
	protected void openPage(PageLocator locator, Object... args) {
	}
	
	

}
