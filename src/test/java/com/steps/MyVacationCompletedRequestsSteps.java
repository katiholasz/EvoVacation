package com.steps;

import com.pages.LogInPage;
import com.pages.MyVacationCompletedRequestsPage;
import com.pages.VacationPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
public class MyVacationCompletedRequestsSteps extends ScenarioSteps {

	public MyVacationCompletedRequestsSteps(Pages pages) {
		super(pages);
	}

	LogInPage dictionaryPage;
	VacationPage vacationPage;
	MyVacationCompletedRequestsPage myvacationcompletedrequestspage;

	@Step
	public void click_MyVacationCompletedRequest() {
		myvacationcompletedrequestspage.click_MyVacationCompletedRequestsBtn();
	}

}
