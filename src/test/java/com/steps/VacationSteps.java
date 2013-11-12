package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.LogInPage;
import com.pages.VacationPage;

@SuppressWarnings("serial")
public class VacationSteps extends ScenarioSteps {

    public VacationSteps(Pages pages) {
		super(pages);
		
	}

	LogInPage dictionaryPage;
    VacationPage vacationPage;

    @Step
    public void click_addNewVacation()
    {
    	vacationPage.AddNewVacation();
    }
   /* 
    @Step
    public void submit_NewRequest()
    {
    	vacationPage.submitNewRequest();
    }
    */
}
    