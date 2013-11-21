package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.22.8.39:9090/web/.net-department/vacation")
public class ApproveVacationRequestsPage extends PageObject {

	public ApproveVacationRequestsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "a[href*=inbox]")
	private WebElement VacationRequestsBtn;

	@FindBy(id = "_1_WAR_EvozonKaleooFormsportlet_workflowTasksSearchContainer_1_1_menuButton")
	private WebElement VacationRequestsActionBtn;

	@FindBy(css = ".aui-focus")
	private WebElement ApproveBtn;

	public void click_VacationRequestsBtn() {
		element(VacationRequestsBtn).waitUntilVisible();
		element(VacationRequestsBtn).click();
	}

	// public boolean check_VacationRequestsActionBtn(){
	// return element(VacationRequestsActionBtn).isPresent();
	// }

	public void assert_VacationRequestsActionBtn_should_be_visible() {
		element(VacationRequestsActionBtn).shouldBeVisible();
	}

	public void click_VacationRequestsActionBtn() {
		element(VacationRequestsActionBtn).waitUntilVisible();
		element(VacationRequestsActionBtn).click();
	}

	public void click_ApproveBtn() {
		element(ApproveBtn).waitUntilVisible();
		element(ApproveBtn).click();
	}

	public void refresh_page() {
		getDriver().navigate().refresh();
	}
}
