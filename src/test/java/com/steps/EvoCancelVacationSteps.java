package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.ControlPanelPage;
import com.pages.EvoCancelVacationPage;
import com.pages.LogInPage;
import com.pages.MyFreeDaysPage;
import com.pages.VacationPage;

@SuppressWarnings("serial")
public class EvoCancelVacationSteps extends ScenarioSteps {

	public EvoCancelVacationSteps(Pages pages) 
	{
		super(pages);
	}

	LogInPage dictionaryPage;
	VacationPage vacationPage;
	ControlPanelPage contolPanelPage;
	MyFreeDaysPage myFreeDaysPage;
	EvoCancelVacationPage evoCancelVacationPage;


	// --------------------- STEPS ------------------------------------------
	@Step
	public void click_SearchBetweenDates() 
	{
		evoCancelVacationPage.check_CheckBetweenDates();
	}

	@Step
	public void unclick_SearchBetweenDates() 
	{
		//evoCancelVacationPage.uncheck_CheckBetweenDates();
	}

	@Step
	public void cancelExistingRequest() 
	{
		evoCancelVacationPage.cancelVacationRequest_ifExists();
	}

	@Step
	public void click_TipConcediuDropDown() 
	{
		evoCancelVacationPage.click_TipConcediuDropDown();
	}

	
	// SEARCH ON EVO CANCEL VACATION
	@Step
	public void start_month_ECvS(String sMonth_ECvS){
		evoCancelVacationPage.pick_start_month_ECvS(sMonth_ECvS);
	}
	@Step
	public void start_day_ECvS(String sDay_ECvS){
		evoCancelVacationPage.pick_start_day_ECvS(sDay_ECvS);
	}

	@Step
	public void start_year_ECvS(String sYear_ECvS){
		evoCancelVacationPage.pick_start_year_ECvS(sYear_ECvS);
	}

	@Step
	public void end_month_ECvS(String eMonth_ECvS){
		evoCancelVacationPage.pick_end_month_ECvS(eMonth_ECvS);
	}
	
	@Step
	public void end_day_ECvS(String eDay_ECvS){
		evoCancelVacationPage.pick_end_day_ECvS(eDay_ECvS);
	}

	@Step
	public void end_year_ECvS(String eYear_ECvS){
		evoCancelVacationPage.pick_end_year_ECvS(eYear_ECvS);
	}


}
