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
import com.steps.EvoCancelVacationSteps;
import com.steps.LogInSteps;
import com.steps.VacationSteps;
import tools.Constants;

@Story(Application.Login.LogIn.class)
@RunWith(ThucydidesRunner.class)
public class EvoCancelVacationSearchTest {

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
	public EvoCancelVacationSteps evoCancelVacationsteps;


	@Test
	public void Log_In() {
		logIn.enter_user(Constants.DM_USER);
		logIn.enter_passd(Constants.DM_PASSWORD);
		logIn.clickMe();
		controlPanelSteps.click_GoTo();
		controlPanelSteps.click_ControlPanel();
		controlPanelSteps.click_EvoCancelVacation();
		evoCancelVacationsteps.click_SearchBetweenDates();	
		evoCancelVacationsteps.select_tip_concediu("Concediu de odihna");
		evoCancelVacationsteps.start_month_ECvS(Constants.S_MONTH_ECV);	
		evoCancelVacationsteps.start_day_ECvS(Constants.S_DAY_ECV);	
		evoCancelVacationsteps.start_year_ECvS(Constants.S_YEAR_ECV);	
		evoCancelVacationsteps.end_month_ECvS(Constants.E_MONTH_ECV);	
		evoCancelVacationsteps.end_day_ECvS(Constants.E_DAY_ECV);	
		evoCancelVacationsteps.end_year_ECvS(Constants.E_YEAR_ECV);	
	}
}