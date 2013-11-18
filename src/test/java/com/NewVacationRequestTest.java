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
import com.steps.EvoVacationHistorySteps;
import com.steps.LogInSteps;
import com.steps.NewVacationRequestSteps;
import com.steps.VacationSteps;
import tools.Constants;

@Story(Application.Login.LogIn.class)
@RunWith(ThucydidesRunner.class)
public class NewVacationRequestTest {

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
	public EvoVacationHistorySteps evoVacationHistorySteps;
	@Steps
	public NewVacationRequestSteps newVacationRequestSteps;

	@Test
	public void LogIn() {
		// test 1 - SAVE
		logIn.enter_user(Constants.DM_USER);
		logIn.enter_passd(Constants.DM_PASSWORD);
		logIn.clickMe();
		logIn.click_vacations();
		newVacationRequestSteps.clickNewVacation();
		newVacationRequestSteps.start_month(Constants.START_MONTH_NVR);
		newVacationRequestSteps.start_day(Constants.START_DAY_NVR);
		newVacationRequestSteps.start_year(Constants.START_YEAR_NVR);
		newVacationRequestSteps.end_month(Constants.END_MONTH_NVR);
		newVacationRequestSteps.end_day(Constants.END_DAY_NVR);
		newVacationRequestSteps.end_year(Constants.END_YEAR_NVR);
		newVacationRequestSteps.clickSaveBtn();
		logIn.click_log_out();
		// test 2 - CANCEL
		logIn.enter_user(Constants.DM_USER);
		logIn.enter_passd(Constants.DM_PASSWORD);
		logIn.clickMe();
		logIn.click_vacations();
		newVacationRequestSteps.clickNewVacation();
		newVacationRequestSteps.start_month(Constants.START_MONTH_NVR);
		newVacationRequestSteps.start_day(Constants.START_DAY_NVR);
		newVacationRequestSteps.start_year(Constants.START_YEAR_NVR);
		newVacationRequestSteps.end_month(Constants.END_MONTH_NVR);
		newVacationRequestSteps.end_day(Constants.END_DAY_NVR);
		newVacationRequestSteps.end_year(Constants.END_YEAR_NVR);
		newVacationRequestSteps.click_button_cancel();
		logIn.click_log_out();

	}

}
