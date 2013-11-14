package com.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@SuppressWarnings("unused")
@DefaultUrl("http://localhost:9090/web/guest/login")
public class EvoCancelVacationPage extends PageObject {

	// Constructor
	public EvoCancelVacationPage(WebDriver driver) {
		super(driver);
	}

	// --------- ELEMENTS ------------
	@FindBy(id = "_evocancelvacation_WAR_EvozonCancelVacationportlet_checkBetweenDatesCheckbox")
	public WebElement checkBetweenDates;

	@FindBy(id = "_evocancelvacation_WAR_EvozonCancelVacationportlet_lodb")
	public WebElement cancelVacationRequest;

	@FindBy(css = ".checkboxes-container ul li a ")
	public WebElement TipConcediuDropDown;

	@FindBy(id = "_evocancelvacation_WAR_EvozonCancelVacationportlet_startMonth")
	public WebElement start_month_ECvS;

	@FindBy(id = "_evocancelvacation_WAR_EvozonCancelVacationportlet_startDay")
	public WebElement start_day_ECvS;

	@FindBy(id = "_evocancelvacation_WAR_EvozonCancelVacationportlet_startYear")
	public WebElement start_year_ECvS;

	@FindBy(id = "_evocancelvacation_WAR_EvozonCancelVacationportlet_endMonth")
	public WebElement end_month_ECvS;

	@FindBy(id = "_evocancelvacation_WAR_EvozonCancelVacationportlet_endDay")
	public WebElement end_day_ECvS;

	@FindBy(id = "_evocancelvacation_WAR_EvozonCancelVacationportlet_endYear")
	public WebElement end_year_ECvS;

	// ---------------------------------- METHODS
	// --------------------------------------------------
	public void refresh_page() {
		getDriver().navigate().refresh();

	}

	// Check - check Between Dates Option - from - Evo cancel Vacation
	public void check_CheckBetweenDates() {
		if (!checkBetweenDates.isDisplayed()) {
			refresh_page();

		} else {
			element(checkBetweenDates).waitUntilVisible();
			element(checkBetweenDates).click();
		}
	}

	// Cancel vacation request if exists - from - Evo cancel Vacation
	public void cancelVacationRequest_ifExists() {
		if (!cancelVacationRequest.isDisplayed()) {
			refresh_page();

		} else {
			element(cancelVacationRequest).waitUntilVisible();
			element(cancelVacationRequest).click();
		}
	}

	// Cancel vacation request if exists - from - Evo cancel Vacation
	public void click_TipConcediuDropDown() {
		if (!TipConcediuDropDown.isDisplayed()) {
			refresh_page();
		} else {
			element(cancelVacationRequest).waitUntilVisible();
			/*
			 * Actions actions = new Actions(getDriver());
			 * actions.moveToElement(
			 * TipConcediuDropDown).click().build().perform();
			 */
			element(cancelVacationRequest).click();
		}
	}

	public void pick_start_month_ECvS(String sMonth) {
		element(start_month_ECvS).waitUntilVisible();
		start_month_ECvS.click();
		start_month_ECvS.click();
		// Select aaa = new Select(ddlStartMonth);
		// aaa.selectByVisibleText(sMonth);
		element(start_month_ECvS).selectByVisibleText(sMonth);
	}

	public void pick_start_day_ECvS(String sDay) {
		element(start_day_ECvS).waitUntilVisible();
		start_day_ECvS.click();
		start_day_ECvS.click();
		// Select aaa = new Select(ddlStartMonth);
		// aaa.selectByVisibleText(sMonth);
		element(start_day_ECvS).selectByVisibleText(sDay);
	}

	public void pick_start_year_ECvS(String sYear) {
		element(start_year_ECvS).waitUntilVisible();
		start_year_ECvS.click();
		start_year_ECvS.click();
		// Select aaa = new Select(ddlStartMonth);
		// aaa.selectByVisibleText(sMonth);
		element(start_year_ECvS).selectByVisibleText(sYear);
	}

	public void pick_end_month_ECvS(String eMonth) {
		element(end_month_ECvS).waitUntilVisible();
		end_month_ECvS.click();
		end_month_ECvS.click();
		// Select aaa = new Select(ddlStartMonth);
		// aaa.selectByVisibleText(sMonth);
		element(end_month_ECvS).selectByVisibleText(eMonth);
	}

	public void pick_end_day_ECvS(String eDay) {
		element(end_day_ECvS).waitUntilVisible();
		end_day_ECvS.click();
		end_day_ECvS.click();
		// Select aaa = new Select(ddlStartMonth);
		// aaa.selectByVisibleText(sMonth);
		element(end_day_ECvS).selectByVisibleText(eDay);
	}

	public void pick_end_year_ECvS(String eYear) {
		element(end_year_ECvS).waitUntilVisible();
		end_year_ECvS.click();
		end_year_ECvS.click();
		// Select aaa = new Select(ddlStartMonth);
		// aaa.selectByVisibleText(sMonth);
		element(end_year_ECvS).selectByVisibleText(eYear);
	}

}
