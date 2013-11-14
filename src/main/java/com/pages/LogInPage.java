package com.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://172.22.8.39:9090/web/guest/login")
public class LogInPage extends PageObject {

	@FindBy(id = "_58_login")
	public WebElement email;

	@FindBy(id = "_58_password")
	public WebElement password;

	@FindBy(css = ".aui-button-input")
	public WebElement signin;

	@FindBy(linkText = "Sign Out")
    public WebElement logOut;

	public LogInPage(WebDriver driver) {
		super(driver);
	}

	public void enter_email(String em) {
		element(email).type(em);
	}

	public void enter_password(String ps) {
		element(password).type(ps);
	}

	public void submit() {
		element(signin).click();
	}

	public void LogOut() 
	  {
	   if (!logOut.isDisplayed())
	   {
	    if (!signin.isDisplayed())
	    {
	     element(signin).waitUntilVisible();
	     element(signin).click(); 
	    }
	   } 
	   else
	   {
	    element(logOut).waitUntilVisible();
	    element(logOut).click(); 
	   }
	  }
}
