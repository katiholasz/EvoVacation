package com.pages;

import java.util.List;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://localhost:9090/web/guest/login")
public class ProcessesPage extends PageObject {

	    public ProcessesPage(WebDriver driver) 
	    {
		super(driver);
		
	    }
	
		/*@FindBy(css="_1_WAR_EvozonKaleooFormsportlet_tabs111211411199101115115101115TabsId")
	    public WebElement processes;*/
		@FindBy(css="a[href*=processes]")
	    public WebElement processes;
		
		@FindBy(linkText="Vacation Request")
	    public WebElement see_requests;
		
		@FindBy(id="_1_WAR_EvozonKaleooFormsportlet_kaleoProcessesSearchContainer_col-name_row-1")
	    public WebElement select_VacationRequest;
		
		@FindBy(css = "table.taglib-search-iterator")
		private WebElement myVacationCompletedRequestTable;

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
		
		public void see_vacation_requests() 
	    {
	    	element(see_requests).waitUntilVisible();
	    	see_requests.click();
	    }
		

		public void getMyVacationCompletedRequests() {
			element(myVacationCompletedRequestTable).waitUntilVisible();
			List<WebElement> resultList = myVacationCompletedRequestTable
					.findElements(By.cssSelector("tr "));

			for (WebElement elementNow : resultList) {
				System.out.println("Element now: " + elementNow.getText());
			}

		}
	}


