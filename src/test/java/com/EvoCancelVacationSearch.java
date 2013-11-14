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
public class EvoCancelVacationSearch {

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
		evoCancelVacationsteps.start_month_ECvS("December");	
		evoCancelVacationsteps.start_day_ECvS("21");	
		evoCancelVacationsteps.start_year_ECvS("2013");	
		evoCancelVacationsteps.end_month_ECvS("December");	
		evoCancelVacationsteps.end_day_ECvS("22");	
		evoCancelVacationsteps.end_year_ECvS("2013");	
	}
}