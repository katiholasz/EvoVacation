package com.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://localhost:9090/web/guest/login")
public class NewVacationRequestPage extends PageObject {

	    public NewVacationRequestPage(WebDriver driver) 
	    {
		super(driver);
	    }

		@FindBy(id="_1_WAR_EvozonKaleooFormsportlet_saveButton")
	    public WebElement save_request;
		
		@FindBy(id="_1_WAR_EvozonKaleooFormsportlet_cancelButton")
		public WebElement cancel_request;

	   /* @FindBy(id="_58_password")
	    public WebElement password;

	    @FindBy(css=".aui-button-input")
		public WebElement signin;

	    @FindBy(linkText = "Logout")
	    public WebElement logout;*/

	    
	  /*  public void enter_email(String em) {
	        element(email).type(em);
	    }
	    
	    public void enter_password(String ps) {
	        element(password).type(ps);
	    }

	    public void submit() {
	        element(signin).click();
	    }
	    
	    */
		public void save_request() 
	    {
	    	element(save_request).waitUntilVisible();
	        save_request.click();
	    }
		
		public void cancel_request() 
	    {
	    	element(save_request).waitUntilVisible();
	        save_request.click();
	    }
	}


