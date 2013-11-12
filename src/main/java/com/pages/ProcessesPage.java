package com.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://localhost:9090/web/guest/login")
public class ProcessesPage extends PageObject {

	    public ProcessesPage(WebDriver driver) 
	    {
		super(driver);
		// TODO Auto-generated constructor stub
	    }
	
		@FindBy(id="_1_WAR_EvozonKaleooFormsportlet_tabs111211411199101115115101115TabsId")
	    public WebElement processes;
		
		@FindBy(id="_1_WAR_EvozonKaleooFormsportlet_kaleoProcessesSearchContainer_col-name_row-1")
	    public WebElement select_VacationRequest;

		public void see_processes() 
	    {
	    	element(processes).waitUntilVisible();
	        processes.click();
	    }
		
		
		public void see_VacationRequest() 
	    {
	    	element(select_VacationRequest).waitUntilVisible();
	    	select_VacationRequest.click();
	    }
		
		
	}


