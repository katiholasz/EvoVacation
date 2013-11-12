package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://localhost:9090/web/guest/login")
public class VacationPage extends PageObject
{

    public VacationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="a[href*=vacation]")
    public WebElement vacation;
	
	@FindBy(id="_1_WAR_EvozonKaleooFormsportlet_addVacationRequest")
    public WebElement addVacation;
	
/*
	@FindBy(id="_1_WAR_EvozonKaleooFormsportlet_addVacationRequest")
    public WebElement submit_new_request;
*/	
    public void vacation() 
    {
    	element(vacation).waitUntilVisible();
    	element(vacation).click();
    }
    
    public void AddNewVacation()
    {
    	element(addVacation).waitUntilVisible();
    	element(addVacation).click();
    }
/*
    public void submitNewRequest()
    {
    	element(submit_new_request).waitUntilVisible();
    	element(submit_new_request).click();
    }
 */   
}
