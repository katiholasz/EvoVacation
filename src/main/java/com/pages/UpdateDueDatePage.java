package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.22.8.39:9090/web/.net-department/vacation")
public class UpdateDueDatePage extends PageObject {

	public UpdateDueDatePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "div[aria-hidden=\"false\"] select[name*=dueDateMonth]")
	private WebElement monthDueDate;

	@FindBy(css = "div[aria-hidden=\"false\"] .aui-field-input-text")
	private WebElement fuckingComment;

	@FindBy(css = "a[href*=inbox]")
	private WebElement VacationRequestsBtn;

	@FindBy(id = "_1_WAR_EvozonKaleooFormsportlet_workflowTasksSearchContainer_1_1_menuButton")
	private WebElement VacationRequestsActionBtn;

	@FindBy(css = "a[href*= updateWorkflowTask]")
	private WebElement UpdateBtn;

	@FindBy(css = ".aui-datepicker-day")
	private WebElement Day;

	@FindBy(css = ".aui-datepicker-year")
	private WebElement Year;

	@FindBy(css = ".aui-dialog-focused select[name*=Hour]")
	private WebElement Hour;

	@FindBy(css = ".aui-dialog-focused select[name*=Minute]")
	private WebElement Minute;

	@FindBy(css = ".aui-dialog-focused select[name*=AmPm]")
	private WebElement AmPm;

	@FindBy(id = "_1_WAR_EvozonKaleooFormsportlet_comment")
	private WebElement UpdateComment;

	@FindBy(css = ".aui-toolbar-first")
	private WebElement okBtn;

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

	public void click_UpdateBtn() {
		element(UpdateBtn).waitUntilVisible();
		element(UpdateBtn).click();
	}

	public void click_Month(String month) {
		element(monthDueDate).waitUntilVisible();
		element(monthDueDate).click();
		element(monthDueDate).click();
		element(monthDueDate).selectByVisibleText(month);
	}

	public void click_Day(String day) {
		element(Day).waitUntilVisible();
		Day.click();
		Day.click();
		element(Day).selectByVisibleText(day);
	}

	public void click_Year(String year) {
		element(Year).waitUntilVisible();
		Year.click();
		Year.click();
		element(Year).selectByVisibleText(year);
	}

	public void click_Hour(String hours) {
		element(Hour).waitUntilVisible();
		Hour.click();
		Hour.click();
		element(Hour).selectByVisibleText(hours);
	}

	public void click_Minute(String minutes) {
		element(Minute).waitUntilVisible();
		Minute.click();
		Minute.click();
		element(Minute).selectByVisibleText(minutes);
	}

	public void clic_AmPm(String ampm) {
		element(AmPm).waitUntilVisible();
		AmPm.click();
		AmPm.click();
		element(AmPm).selectByVisibleText(ampm);
	}

	public void UpdateComment(String keyword) {
		element(UpdateComment).waitUntilVisible();
		element(UpdateComment).type(keyword);
	}

	public void click_okBtn() {
		element(okBtn).waitUntilVisible();
		element(okBtn).click();
	}
}
