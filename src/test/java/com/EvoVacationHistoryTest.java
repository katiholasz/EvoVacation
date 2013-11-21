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

import tools.Constants;

import com.requirements.Application;
import com.steps.ControlPanelSteps;
import com.steps.EvoVacationHistorySteps;
import com.steps.LogInSteps;
import com.steps.VacationSteps;

@Story(Application.Login.LogIn.class)
@RunWith(ThucydidesRunner.class)
public class EvoVacationHistoryTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.22.8.39:9090")
	public Pages pages;

	@Steps
	public LogInSteps logIn;
	@Steps
	public VacationSteps vacationSteps;
	@Steps
	public ControlPanelSteps controlPanelSteps;
	@Steps
	public EvoVacationHistorySteps evoVacationHistorySteps;

	@Test
	public void Log_In() {
		webdriver.manage().window().maximize();
		logIn.enter_user(Constants.DM_USER);
		logIn.enter_passd(Constants.DM_PASSWORD);
		logIn.clickMe();
		logIn.assert_SignOut_link_should_be_visible();
		controlPanelSteps.click_GoTo();
		controlPanelSteps.click_ControlPanel();
		controlPanelSteps.assert_ControlPanel_should_be_visible();
		controlPanelSteps.assert_EvoVacationHistory_should_be_visible();
		controlPanelSteps.click_EvoVacationHistory();
		evoVacationHistorySteps.check_AdvancedSearch();
		// evoVacationHistorySteps.select_tip_concediu("Concediu de odihna");
		evoVacationHistorySteps.insert_firstName(Constants.FIRST_NAME_EVH);
		evoVacationHistorySteps.insert_LastName(Constants.LAST_NAME_EVH);
		evoVacationHistorySteps.insert_dayCount(Constants.DAY_COUNT_EVH);
		evoVacationHistorySteps
				.insert_vacationType(Constants.VACATION_TYPE_EVH);
		evoVacationHistorySteps.checkBasicSearch();
		evoVacationHistorySteps.check_basic_search(Constants.LAST_NAME_EVH);
		evoVacationHistorySteps.verifySearchResults(Constants.LAST_NAME_EVH);
		logIn.click_log_out();
		logIn.waitABit(2000);

	}
}
