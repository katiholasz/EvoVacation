package com.steps;

import java.awt.AWTException;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.ControlPanelPage;
import com.pages.EvoCancelVacationPage;
import com.pages.EvoVacationHistoryPage;
import com.pages.LogInPage;
import com.pages.MyFreeDaysPage;
import com.pages.VacationPage;

@SuppressWarnings("serial")
public class EvoVacationHistorySteps extends ScenarioSteps {

	public EvoVacationHistorySteps(Pages pages) {
		super(pages);
	}


	LogInPage dictionaryPage;
	VacationPage vacationPage;
	ControlPanelPage contolPanelPage;
	MyFreeDaysPage myFreeDaysPage;
	EvoCancelVacationPage evoCancelVacationPage;
	EvoVacationHistoryPage evoVacationHistoryPage;


	// --------------------- STEPS ------------------------------------------

	@Step
	public void check_AdvancedSearch() 
	{
		evoVacationHistoryPage.checkAdvancedSearch();
	}
	
	@Step
	public void refreshPage() 
	{
		evoVacationHistoryPage.refresh_page();
	}
	
	@Step
	public void goToEvoH() 
	{
		evoVacationHistoryPage.goto_EvoVH();
	}
	
	@Step
	public void insert_firstName() 
	{
		evoVacationHistoryPage.insert_firstName("Holasz");
	}
	
	@Step
	public void insert_LastName() 
	{
		evoVacationHistoryPage.insert_lastName("Kati");
		
	}
	
	@Step
	public void insert_dayCount() 
	{
		evoVacationHistoryPage.insert_dayCount("2");
		
	}
	
	@Step
	public void insert_vacationType() 
	{
		evoVacationHistoryPage.insert_vacationType("odihna");
		
	}
	
	@Step
	public void send_enter() throws AWTException 
	{
		evoVacationHistoryPage.send_enter();
		
	}

}
