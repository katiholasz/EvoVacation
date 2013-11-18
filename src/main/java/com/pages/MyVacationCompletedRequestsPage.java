package com.pages;

import java.util.List;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://172.22.8.39:9090/web/.net-department/vacation")
public class MyVacationCompletedRequestsPage extends PageObject {

	public MyVacationCompletedRequestsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "a[href*=my-completed-requests]")
	private WebElement MyVacationCompletedRequestsBtn;

	@FindBy(id = "_1_WAR_EvozonKaleooFormsportlet_workflowInstancesSearchContainerPageIteratorBottom_itemsPerPage")
	private WebElement RequestsNumber;
	
	@FindBy(id= "_1_WAR_EvozonKaleooFormsportlet_workflowInstancesSearchContainer")
	private WebElement myVacationCompletedRequestContainer;
	
	@FindBy(css = ".aui-paginator-next-link")
	private WebElement nextLink;
	
	@FindBy(css = ".aui-paginator-last-link")
	private WebElement lastLink;
	
	@FindBy(css = ".aui-paginator-prev-link")
	private WebElement prevLink;
	
	@FindBy(css = ".aui-paginator-first-link")
	private WebElement firstLink;
	
	public void assert_MyVacationCompletedRequests_link_should_be_visible() {
		element(MyVacationCompletedRequestsBtn).shouldBeVisible();
	}

	public void click_MyVacationCompletedRequestsBtn() {
		element(MyVacationCompletedRequestsBtn).click();
	}
	
	public void click_RequestsNumber(String number) {
		element(RequestsNumber).waitUntilVisible();
		element(RequestsNumber).click();
		element(RequestsNumber).click();
		element(RequestsNumber).selectByVisibleText(number);
	}
	
	public int i=-2;
	public void getMyVacationCompletedRequests() {
		   element(myVacationCompletedRequestContainer).waitUntilVisible();
		   List<WebElement> resultList = myVacationCompletedRequestContainer
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
}
