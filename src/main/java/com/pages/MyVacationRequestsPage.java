package com.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://172.22.8.39:9090/web/.net-department/vacation")
public class MyVacationRequestsPage extends PageObject {

	public MyVacationRequestsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "a[href*=my-pending-requests]")
	private WebElement MyVacationRequestsBtn;

	@FindBy(id = "_1_WAR_EvozonKaleooFormsportlet_workflowInstancesSearchContainer_1_menuButton")
	private WebElement MyRequestsActionBtn;

	@FindBy(id = "_1_WAR_EvozonKaleooFormsportlet_workflowInstancesSearchContainer_1_menu_withdraw-submission")
	private WebElement WithdrawSubmissionBtn;

	public void click_MyVacationRequestsBtn() {
		element(MyVacationRequestsBtn).click();
	}

	public void click_MyRequestsActionBtn() {
		element(MyRequestsActionBtn).waitUntilVisible();
		element(MyRequestsActionBtn).click();
	}

	public void click_WithdrawSubmissionBtn() {
		element(WithdrawSubmissionBtn).waitUntilVisible();
		element(WithdrawSubmissionBtn).click();
	}
}
