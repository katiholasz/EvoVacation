package com.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://172.22.8.39:9090/web/guest/login")
public class NewVacationRequestPage extends PageObject {

	public NewVacationRequestPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "a[href*=vacation]")
	private WebElement vacation_button;

	@FindBy(css = ".aui-button-input")
	private WebElement newvacation;

	@FindBy(css = "fieldset[class*='aui-fieldset']>div>div:nth-child(3)>div span:nth-of-type(3)input")
	private WebElement concediu;

	@FindBy(id = "_1_WAR_EvozonKaleooFormsportlet_dateStart-dateMonth")
	private WebElement start_month;

	@FindBy(id = "_1_WAR_EvozonKaleooFormsportlet_dateStart-dateDay")
	private WebElement start_day;

	@FindBy(id = "_1_WAR_EvozonKaleooFormsportlet_dateStart-dateYear")
	private WebElement start_year;

	@FindBy(id = "_1_WAR_EvozonKaleooFormsportlet_dateEnd-dateMonth")
	private WebElement end_month;

	@FindBy(id = "_1_WAR_EvozonKaleooFormsportlet_dateEnd-dateDay")
	private WebElement end_day;

	@FindBy(id = "_1_WAR_EvozonKaleooFormsportlet_dateEnd-dateYear")
	private WebElement end_year;

	@FindBy(id = "_1_WAR_EvozonKaleooFormsportlet_saveButton")
	private WebElement save_button;

	@FindBy(id = "_1_WAR_EvozonKaleooFormsportlet_cancelButton")
	public WebElement cancel_request;

	@FindBy(css = ".portlet-msg-success")
	public WebElement comfirmation_message;

	// -- METHODS ---
	public void click_vacation() {
		element(vacation_button).click();
	}

	public void submit_new_vacation_button() {
		element(newvacation).click();
	}

	public void choose_vacationType() {
		element(concediu).click();
	}

	public void pick_start_month(String sMonth) {
		element(start_month).waitUntilVisible();
		start_month.click();
		start_month.click();
		// Select aaa = new Select(ddlStartMonth);
		// aaa.selectByVisibleText(sMonth);
		element(start_month).selectByVisibleText(sMonth);
	}

	public void pick_start_day(String sDay) {
		element(start_day).waitUntilVisible();
		start_day.click();
		start_day.click();
		// Select aaa = new Select(ddlStartMonth);
		// aaa.selectByVisibleText(sMonth);
		element(start_day).selectByVisibleText(sDay);
	}

	public void pick_start_year(String sYear) {
		element(start_year).waitUntilVisible();
		start_year.click();
		start_year.click();
		// Select aaa = new Select(ddlStartMonth);
		// aaa.selectByVisibleText(sMonth);
		element(start_year).selectByVisibleText(sYear);
	}

	public void pick_end_month(String eMonth) {
		element(end_month).waitUntilVisible();
		end_month.click();
		end_month.click();
		// Select aaa = new Select(ddlStartMonth);
		// aaa.selectByVisibleText(sMonth);
		element(end_month).selectByVisibleText(eMonth);
	}

	public void pick_end_day(String eDay) {
		element(end_day).waitUntilVisible();
		end_day.click();
		end_day.click();
		// Select aaa = new Select(ddlStartMonth);
		// aaa.selectByVisibleText(sMonth);
		element(end_day).selectByVisibleText(eDay);
	}

	public void pick_end_year(String eYear) {
		element(end_year).waitUntilVisible();
		end_year.click();
		end_year.click();
		// Select aaa = new Select(ddlStartMonth);
		// aaa.selectByVisibleText(sMonth);
		element(end_year).selectByVisibleText(eYear);
	}

	public void save_request() {
		element(save_button).waitUntilVisible();
		save_button.click();
	}

	public void cancel_request() {
		element(cancel_request).waitUntilVisible();
		cancel_request.click();
	}

	public void checkNotificationMessage(String msg) {
		WebElement message = getDriver()
				.findElement(
						By.cssSelector("div[class*='borderless-container'] div[class*='portlet-msg-success']"));
		System.out.println("It works! " + message.getText());

		Assert.assertTrue("The message is not correct!", message.getText()
				.contains(msg));
	}
}
