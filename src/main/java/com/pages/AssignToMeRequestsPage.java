package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.22.8.39:9090/web/.net-department/vacation")
public class AssignToMeRequestsPage extends PageObject{

	public AssignToMeRequestsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "a[href*=inbox]")
	private WebElement VacationRequestsBtn;

	@FindBy(id = "_1_WAR_EvozonKaleooFormsportlet_workflowTasksSearchContainer_2_1_menuButton")
	private WebElement VacationRequestsActionBtn;

	@FindBy(css = ".lfr-delegate-click")
	private WebElement AssignToMeBtn;
	
	@FindBy(id = "_1_WAR_EvozonKaleooFormsportlet_comment")
	private WebElement Comment;
	
	@FindBy(css = ".aui-dialog-ft .aui-toolbar-first")
	private WebElement ConfirmAssignToMe;

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
	
	public void click_AssignToMeBtn() {
		element(AssignToMeBtn).waitUntilVisible();
		element(AssignToMeBtn).click();
	}
	
	public void Comment(String keyword) {
		  element(Comment).waitUntilVisible();
		  element(Comment).type(keyword);		
	}
	
	public void click_ConfirmAssignToMe() {
		element(ConfirmAssignToMe).waitUntilVisible();
		element(ConfirmAssignToMe).click();
	}

	
}
