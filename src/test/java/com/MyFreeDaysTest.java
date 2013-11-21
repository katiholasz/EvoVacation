package com;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.requirements.Application;
import com.steps.ControlPanelSteps;
import com.steps.LogInSteps;
import com.steps.MyFreeDaysSteps;
import com.steps.VacationSteps;
import tools.Constants;

@Story(Application.Login.LogIn.class)
@RunWith(ThucydidesRunner.class)
public class MyFreeDaysTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://localhost:9090/")
	public Pages pages;

	@Steps
	public LogInSteps logIn;
	@Steps
	public VacationSteps vacationSteps;
	@Steps
	public ControlPanelSteps controlPanelSteps;
	@Steps
	public MyFreeDaysSteps myFreeDaysSteps;

	@Test
	public void Log_In() {
		webdriver.manage().window().maximize();
		logIn.enter_user(Constants.DM_USER);
		logIn.enter_passd(Constants.DM_PASSWORD);
		logIn.clickMe();
		controlPanelSteps.click_GoTo();
		controlPanelSteps.click_ControlPanel();
		controlPanelSteps.assert_ControlPanel_should_be_visible();
		controlPanelSteps.click_MyFreeDays();
		controlPanelSteps.assert_MyFreeDays_page_should_be_visible();
		myFreeDaysSteps.enter_freeCurrentYear(Constants.FREE_CURRENT_YEAR);
		myFreeDaysSteps.enter_freeFromLastYear(Constants.FREE_LAST_YEAR);
		myFreeDaysSteps.enter_monthsExpBeforeHiring(Constants.MONTHS_EXP_BEFORE_HIRING);
		myFreeDaysSteps.enter_monthsExpPreviousEvozon(Constants.MONTHS_EXP_EVOZON);
		myFreeDaysSteps.refresh();	
		logIn.assert_SignOut_link_should_be_visible();
		logIn.click_log_out();
		logIn.enter_user(Constants.DM_USER);
		logIn.enter_passd(Constants.DM_PASSWORD);
		logIn.clickMe();
		controlPanelSteps.click_GoTo();
		controlPanelSteps.click_ControlPanel();
		controlPanelSteps.assert_ControlPanel_should_be_visible();
		controlPanelSteps.click_MyFreeDays();
		controlPanelSteps.assert_MyFreeDays_page_should_be_visible();
		myFreeDaysSteps.enter_freeCurrentYear(Constants.FREE_CURRENT_YEAR_1);
		myFreeDaysSteps.enter_freeFromLastYear(Constants.FREE_LAST_YEAR_1);
		myFreeDaysSteps.enter_monthsExpBeforeHiring(Constants.MONTHS_EXP_BEFORE_HIRING_1);
		myFreeDaysSteps.enter_monthsExpPreviousEvozon(Constants.MONTHS_EXP_EVOZON_1);
		myFreeDaysSteps.refresh();
		logIn.assert_SignOut_link_should_be_visible();
		logIn.click_log_out();
		logIn.enter_user(Constants.DM_USER);
		logIn.enter_passd(Constants.DM_PASSWORD);
		logIn.clickMe();
		controlPanelSteps.click_GoTo();
		controlPanelSteps.click_ControlPanel();
		controlPanelSteps.assert_ControlPanel_should_be_visible();
		controlPanelSteps.click_MyFreeDays();
		controlPanelSteps.assert_MyFreeDays_page_should_be_visible();
		myFreeDaysSteps.enter_freeCurrentYear(Constants.FREE_CURRENT_YEAR_2);
		myFreeDaysSteps.enter_freeFromLastYear(Constants.FREE_LAST_YEAR_2);
		myFreeDaysSteps.enter_monthsExpBeforeHiring(Constants.MONTHS_EXP_BEFORE_HIRING_2);
		myFreeDaysSteps.enter_monthsExpPreviousEvozon(Constants.MONTHS_EXP_EVOZON_2);
		myFreeDaysSteps.refresh();		
	}
}