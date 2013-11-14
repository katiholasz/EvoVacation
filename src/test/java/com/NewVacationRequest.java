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


@Story(Application.Login.LogIn.class)
@RunWith(ThucydidesRunner.class)
public class NewVacationRequest {

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
	public void LogIn() 
	{
		logIn.enter_user("holaszkati@ymail.com");
		logIn.enter_passd("kati");
		logIn.clickMe();
		logIn.click_vacations();
		newVacationRequestSteps.clickNewVacation();
		newVacationRequestSteps.start_month("December");
		newVacationRequestSteps.start_day("28");
		newVacationRequestSteps.start_year("2013");
		newVacationRequestSteps.end_month("December");
		newVacationRequestSteps.end_day("28");
		newVacationRequestSteps.end_year("2013");
		newVacationRequestSteps.clickSaveBtn();
		logIn.click_log_out();
		
		logIn.enter_user("holaszkati@ymail.com");
		logIn.enter_passd("kati");
		logIn.clickMe();
		logIn.click_vacations();
		newVacationRequestSteps.clickNewVacation();
		newVacationRequestSteps.start_month("December");
		newVacationRequestSteps.start_day("28");
		newVacationRequestSteps.start_year("2013");
		newVacationRequestSteps.end_month("December");
		newVacationRequestSteps.end_day("28");
		newVacationRequestSteps.end_year("2013");
		newVacationRequestSteps.click_button_cancel();
		logIn.click_log_out();
		
	}

}
