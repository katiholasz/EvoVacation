package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.22.8.39:9090/web/.net-department/vacation")
public class RequestsAssignedToMePage extends PageObject {

	public RequestsAssignedToMePage(WebDriver driver) {
		super(driver);
	}
	
    // Vacation Requests
    @FindBy(css = "a[href*=inbox]")
	private WebElement VacationRequestBtn;
    
    @FindBy(id ="_1_WAR_EvozonKaleooFormsportlet_workflowTasksSearchContainer_1_menuButton")
	private WebElement VacationRequestsActionBtn;
    
    public void click_VacationRequestBtn() {
		element(VacationRequestBtn).waitUntilVisible();
		element(VacationRequestBtn).click();
	}
    
 	public void assert_VacationRequestsActionBtn_should_be_visible() {
        element(VacationRequestsActionBtn).shouldBeVisible();
        element(VacationRequestsActionBtn).click();
 	}
 	
	public void click_VacationRequestsActionBtn() {
		element(VacationRequestsActionBtn).waitUntilVisible();
		element(VacationRequestsActionBtn).click();
	}
    
	// Resubmit
    @FindBy(css = ".aui-focus")
   	private WebElement ResubmitBtn;
    
    @FindBy(css = ".aui-panel-ft span.aui-toolbar-content button:first-child")
	private WebElement confirmResubmit;
    
    public void assert_ResubmitBtn_should_be_visible() {
    	element(ResubmitBtn).shouldBeVisible();
    	element(ResubmitBtn).click();
    }
    
    public void click_ResubmitBtn() {
		element(ResubmitBtn).waitUntilVisible();
		element(ResubmitBtn).click();
	}
    
    public void click_ConfirmResubmit() {
		element(confirmResubmit).waitUntilVisible();
		element(confirmResubmit).click();
	}
}
