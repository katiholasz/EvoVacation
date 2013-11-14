package com;

import java.awt.AWTException;

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
import com.steps.VacationSteps;

import tools.Constants;;

@Story(Application.Login.LogIn.class)
@RunWith(ThucydidesRunner.class)
public class EvoVacationHistory {

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
	
	@Test
	public void Log_In() throws AWTException {
		logIn.enter_user(Constants.DM_USER);
		logIn.enter_passd(Constants.DM_PASSWORD);
		logIn.clickMe();
		controlPanelSteps.click_GoTo();
		controlPanelSteps.click_ControlPanel();
		controlPanelSteps.click_EvoVacationHistory();
		evoVacationHistorySteps.check_AdvancedSearch();
		evoVacationHistorySteps.insert_firstName();
		evoVacationHistorySteps.send_enter();
		evoVacationHistorySteps.insert_LastName();
		evoVacationHistorySteps.insert_dayCount();
		evoVacationHistorySteps.insert_vacationType();
	}
}