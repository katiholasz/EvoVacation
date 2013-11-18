package com.steps;

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
	public void insert_firstName(String fName) 
	{
		evoVacationHistoryPage.insert_firstName(fName);
	}

	@Step
	public void insert_LastName(String lName) 
	{
		evoVacationHistoryPage.insert_lastName(lName);

	}

	@Step
	public void insert_dayCount(String dayCount) 
	{
		evoVacationHistoryPage.insert_dayCount(dayCount);

	}

	@Step
	public void insert_vacationType(String vType) 
	{
		evoVacationHistoryPage.insert_vacationType(vType);

	}

	@Step
	public void send_enter()
	{
		//evoVacationHistoryPage.send_enter();

	}
	
	@Step
	 public void select_tip_concediu(String tipConcediu) {
		evoVacationHistoryPage.select_tip_concediu(tipConcediu);
	 } 
	
	@Step
	public void check_basic_search(String t) {
		evoVacationHistoryPage.check_basic_search(t);
	} 
	
	@Step
	public void verifySearchResults(String t) {
		evoVacationHistoryPage.verifySearchResults(t);
	} 
	

}
