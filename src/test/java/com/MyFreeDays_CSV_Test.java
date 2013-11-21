package com;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import net.thucydides.junit.runners.ThucydidesParameterizedRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import tools.Constants;

import com.requirements.Application;
import com.steps.ControlPanelSteps;
import com.steps.EvoCancelVacationSteps;
import com.steps.LogInSteps;
import com.steps.MyFreeDaysSteps;
import com.steps.VacationSteps;

@Story(Application.Login.LogIn.class)
@RunWith(ThucydidesParameterizedRunner.class)
@UseTestDataFrom("Resources/MyFreeDays.csv")
public class MyFreeDays_CSV_Test {

	String freeCurrentYear;
	String freeLastYear;
	String monthExpBeforeHiring;
	String monthExpEvozon;

	@Qualifier
	public String get_freeCurrentYear() {
		return freeCurrentYear;
	}

	public void set_freeCurrentYear(String freeCYear) {
		freeCurrentYear = freeCYear;
	}

	public String get_freeLastYear() {
		return freeLastYear;
	}

	public void set_freeLastYear(String freeLYear) {
		freeLastYear = freeLYear;
	}

	public String get_monthExpBeforeHiring() {
		return monthExpBeforeHiring;
	}

	public void set_monthExpBeforeHiring(String monthsExpBefore) {
		monthExpBeforeHiring = monthsExpBefore;
	}

	public String get_monthExpEvozon() {
		return monthExpEvozon;
	}

	public void set_monthExpEvozon(String monthExpEvo) {
		monthExpEvozon = monthExpEvo;
	}

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.22.8.39:9090/")
	public Pages pages;

	@Steps
	public LogInSteps logIn;
	@Steps
	public VacationSteps vacationSteps;
	@Steps
	public ControlPanelSteps controlPanelSteps;
	@Steps
	public MyFreeDaysSteps myFreeDaysSteps;
	@Steps
	public EvoCancelVacationSteps evoCancelVacationSteps;

	@Test
	public void MyFreeDays() {
		webdriver.manage().window().maximize();
		logIn.enter_user(Constants.DM_USER);
		logIn.enter_passd(Constants.DM_PASSWORD);
		logIn.clickMe();
		logIn.assert_SignOut_link_should_be_visible();
		controlPanelSteps.click_GoTo();
		controlPanelSteps.click_ControlPanel();
		controlPanelSteps.assert_ControlPanel_should_be_visible();
		controlPanelSteps.click_MyFreeDays();
		controlPanelSteps.assert_MyFreeDays_page_should_be_visible();
		myFreeDaysSteps.enter_freeFromLastYear(get_freeLastYear());
		myFreeDaysSteps.enter_freeCurrentYear(get_freeCurrentYear());
		myFreeDaysSteps.enter_monthsExpBeforeHiring(get_monthExpBeforeHiring());
		myFreeDaysSteps.enter_monthsExpPreviousEvozon(get_monthExpEvozon());
		myFreeDaysSteps.waitABit(5000);
		myFreeDaysSteps.refresh();
	}

}