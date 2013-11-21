package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.LogInPage;
import com.pages.ProcessesPage;
import com.pages.VacationPage;

@SuppressWarnings("serial")
public class ProcessesSteps extends ScenarioSteps {

	public ProcessesSteps(Pages pages) {
		super(pages);
	}

	LogInPage logInPage;
    VacationPage vacationPage;
    ProcessesPage processesPage;

    @Step
    public void click_Processes()
    {
    	processesPage.see_processes();
    }
    
    @Step
    public void click_VacationRequests()
    {
    	processesPage.see_vacation_requests();
    }

    @Step
    public void retrieveMyVacationCompletedRequests()
    {
    	processesPage.getMyVacationCompletedRequests();
    }

}
    