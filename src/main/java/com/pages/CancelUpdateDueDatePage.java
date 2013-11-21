package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.22.8.39:9090/web/.net-department/vacation")
public class CancelUpdateDueDatePage extends PageObject {

	public CancelUpdateDueDatePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "a[href*=inbox]")
	private WebElement VacationRequestsBtn;

	@FindBy(id = "_1_WAR_EvozonKaleooFormsportlet_workflowTasksSearchContainer_1_1_menuButton")
	private WebElement VacationRequestsActionBtn;

	@FindBy(css = "a[href*= updateWorkflowTask]")
	private WebElement UpdateBtn;
	
	@FindBy(css = ".aui-toolbar-last")
	private WebElement cancelBtn;

	public void click_VacationRequestsBtn() {
		element(VacationRequestsBtn).waitUntilVisible();
		element(VacationRequestsBtn).click();
	}

	public void click_VacationRequestsActionBtn() {
		element(VacationRequestsActionBtn).waitUntilVisible();
		element(VacationRequestsActionBtn).click();
	}

	public void click_UpdateBtn() {
		element(UpdateBtn).waitUntilVisible();
		element(UpdateBtn).click();
	}
	
	public void click_cancelBtn() {
		element(cancelBtn).waitUntilVisible();
		element(cancelBtn).click();
	}
}
