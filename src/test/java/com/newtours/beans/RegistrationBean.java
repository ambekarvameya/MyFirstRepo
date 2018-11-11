package com.newtours.beans;

import com.qmetry.qaf.automation.data.BaseFormDataBean;
import com.qmetry.qaf.automation.ui.annotations.UiElement;

public class RegistrationBean extends BaseFormDataBean {
	
	@UiElement(fieldLoc="input.firstname.registerpage")
	private String firstName;
	
	@UiElement(fieldLoc="input.lastname.registerpage")
	private String lastName;
	
	@UiElement(fieldLoc="input.phone.registerpage")
	private String phone;
	
	@UiElement(fieldLoc="input.email.registerpage")
	private String email;
	
	@UiElement(fieldLoc="input.address1.registerpage")
	private String address1;
	
	@UiElement(fieldLoc="input.address2.registerpage")
	private String address2;
	
	@UiElement(fieldLoc="input.city.registerpage")
	private String city;
	
	@UiElement(fieldLoc="input.state.registerpage")
	private String state;
	
	@UiElement(fieldLoc="input.postalcode.registerpage")
	private String postalCode;
	
	@UiElement(fieldLoc="input.username.registerpage")
	private String username;
	
	@UiElement(fieldLoc="input.password.registerpage")
	private String password;
	
	@UiElement(fieldLoc="input.confirmpassword.registerpage")
	private String confirmPassword;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress1() {
		return address1;
	}

	public String getAddress2() {
		return address2;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}
	
	
	

}
