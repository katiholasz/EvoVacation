package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.22.8.39:9090/web/.net-department/vacation")
public class AssignVacationRequestPage extends PageObject {

	public AssignVacationRequestPage(WebDriver driver) {
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

	@FindBy(css = ".aui-field-input-menu")
	private WebElement AssignUser;

	@FindBy(id = "_1_WAR_EvozonKaleooFormsportlet_comment")
	private WebElement AssignComment;
	
	@FindBy(css = "div.aui-dialog-ft button:first-child")
	private WebElement OK;

	public WebElement assignToList;

	public void click_VacationRequestsBtn() {
		element(VacationRequestsBtn).waitUntilVisible();
		element(VacationRequestsBtn).click();
	}

	public void assert_VacationRequestsActionBtn_should_be_visible() {
        element(VacationRequestsActionBtn).shouldBeVisible();
    }

	public void click_VacationRequestsActionBtn() {
		element(VacationRequestsActionBtn).waitUntilVisible();
		element(VacationRequestsActionBtn).click();
	}

	public void click_AssignToBtn() {
		element(AssignToBtn).waitUntilVisible();
		AssignToBtn.click();
	}

	public void click_AssignUser() {
		element(AssignUser).waitUntilVisible();
		element(AssignUser).click();
	}

	public void select_to_a_person(String person) {
		element(AssignUser).waitUntilVisible();
		AssignUser.click();
		AssignUser.click();
		element(AssignUser).selectByVisibleText(person);
	}
	
	public void AssignComment(String keyword) {
		element(AssignComment).waitUntilVisible();
		element(AssignComment).type(keyword);
	}
	
	public void click_OK() {
		element(OK).waitUntilVisible();
		element(OK).click();		
	}


}
