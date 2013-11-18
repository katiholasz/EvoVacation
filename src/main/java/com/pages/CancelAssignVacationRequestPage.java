package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.22.8.39:9090/web/.net-department/vacation")
public class CancelAssignVacationRequestPage extends PageObject {

	public CancelAssignVacationRequestPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "a[href*=inbox]")
	private WebElement VacationRequestsBtn;

	@FindBy(id = "_1_WAR_EvozonKaleooFormsportlet_workflowTasksSearchContainer_1_1_menuButton")
	private WebElement VacationRequestsActionBtn;

	@FindBy(css = ".lfr-delegate-click")
	private WebElement AssignToBtn;

	@FindBy(css = "#workflowMyRolesTasksPanelmyRolesPanel")
	private WebElement myRolesPanel;

	@FindBy(css = "div.aui-dialog-ft button:last-child")
	private WebElement Cancel;

	public void click_VacationRequestsBtn() {
		element(VacationRequestsBtn).waitUntilVisible();
		VacationRequestsBtn.click();
	}
	
	public void assert_VacationRequestsActionBtn_should_be_visible() {
        element(VacationRequestsActionBtn).shouldBeVisible();
	 }

	public void click_VacationRequestsActionBtn() {
		element(VacationRequestsActionBtn).waitUntilVisible();
		VacationRequestsActionBtn.click();
	}

	public void click_AssignToBtn() {
		element(AssignToBtn).waitUntilVisible();
		AssignToBtn.click();
	}

	public void click_Cancel() {
		element(Cancel).waitUntilVisible();
		Cancel.click();
	}

}