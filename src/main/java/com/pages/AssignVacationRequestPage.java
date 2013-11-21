package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;
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

	@FindBy(id = "_WAR_EvozonKaleooFormsportlet_workflowTaskId=80019")
	private WebElement workflowTaskId;

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

	@FindBy(id = "_1_WAR_EvozonKaleooFormsportlet_workflowTasksSearchContainer_1SearchContainer")
	private WebElement container;

	public WebElement assignToList;

	public void click_VacationRequestsBtn() {
		element(VacationRequestsBtn).waitUntilVisible();
		element(VacationRequestsBtn).click();
	}

	public void assert_VacationRequestsActionBtn_should_be_visible() {
		element(VacationRequestsActionBtn).shouldBeVisible();
	}

	public void AssignComment(String keyword) {
		element(AssignComment).waitUntilVisible();
		element(AssignComment).type(keyword);
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

	public void markListEntry(String Username, String dateBetween) {
		element(container).waitUntilVisible();
		List<WebElement> itemsList = container.findElements(By
				.cssSelector("tr.results-row"));

		theFor: for (WebElement elementNow : itemsList) {
			String u = elementNow.findElement(
					By.cssSelector("a[text()='Amelia Andrada Ilies']"))
					.getText();
			String d = elementNow.findElement(
					By.cssSelector("a[text()='1/23/2014 - 1/23/2014']"))
					.getText();

			if (u.contains(Username) && d.contains(dateBetween)) {
				// elementNow.findElement(By.cssSelector("td:last-child a")).click();
				System.out.println("FOUND! " + Username + dateBetween);
				break theFor;
			}
		}
	}

	// public void enter_workflowTaskId(String id) {
	// element(workflowTaskId).waitUntilVisible();
	// element(workflowTaskId).type(id);
	// }

	public void click_OK() {
		element(OK).waitUntilVisible();
		element(OK).click();
	}

}
