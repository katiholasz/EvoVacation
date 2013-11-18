package com.pages;

import java.util.List;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;
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
	
	@FindBy(id= "_1_WAR_EvozonKaleooFormsportlet_workflowInstancesSearchContainer")
	private WebElement myVacationRequestContainer;
	
	@FindBy(id = "_1_WAR_EvozonKaleooFormsportlet_workflowInstancesSearchContainerPageIteratorBottom_itemsPerPage")
	private WebElement RequestsNumber;
	
	@FindBy(css = ".aui-paginator-next-link")
	private WebElement nextLink;
	
	@FindBy(css = ".aui-paginator-last-link")
	private WebElement lastLink;
	
	@FindBy(css = ".aui-paginator-prev-link")
	private WebElement prevLink;
	
	@FindBy(css = ".aui-paginator-first-link")
	private WebElement firstLink;

	@FindBy(id = "_1_WAR_EvozonKaleooFormsportlet_workflowInstancesSearchContainer_1_menuButton")
	private WebElement MyRequestsActionBtn;

	@FindBy(id = "_1_WAR_EvozonKaleooFormsportlet_workflowInstancesSearchContainer_1_menu_withdraw-submission")
	private WebElement WithdrawSubmissionBtn;

	public void click_MyVacationRequestsBtn() {
		element(MyVacationRequestsBtn).click();
	}
	
	public void assert_MyVacationRequest_link_should_be_visible() {
		element(MyVacationRequestsBtn).shouldBeVisible();
	}
	
	public void assert_MyRequestsActionBtn_should_be_visible() {
        element(MyRequestsActionBtn).shouldBeVisible();
	 }
	
	public void click_RequestsNumber(String number) {
		element(RequestsNumber).waitUntilVisible();
		element(RequestsNumber).click();
		element(RequestsNumber).click();
		element(RequestsNumber).selectByVisibleText(number);
	}
	
	public int i=-2;
	public void getMyVacationCompletedRequests() {
		   element(myVacationRequestContainer).waitUntilVisible();
		   List<WebElement> resultList = myVacationRequestContainer
		     .findElements(By.cssSelector("tr "));

		   for (WebElement elementNow : resultList) {
		    System.out.println("Element now: " + elementNow.getText());
		    i++;
		   }
		    System.out.println("Number of rows: " + i);

	}
	
	public void click_nextLink() {
		element(nextLink).click();
	}
	
	public void click_lastLink() {
		element(lastLink).click();
	}
	
	public void click_prevLink() {
		element(prevLink).click();
	}
	
	public void click_firstLink() {
		element(firstLink).click();
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
