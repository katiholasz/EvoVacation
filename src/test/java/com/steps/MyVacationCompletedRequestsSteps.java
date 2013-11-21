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
	public void assert_MyVacationCompletedRequests_link_should_be_visible() {
		myvacationcompletedrequestspage
				.assert_MyVacationCompletedRequests_link_should_be_visible();
	}

	@Step
	public void click_MyVacationCompletedRequest() {
		myvacationcompletedrequestspage.click_MyVacationCompletedRequestsBtn();
	}

	@Step
	public void select_RequestsNumber(String number) {
		myvacationcompletedrequestspage.click_RequestsNumber(number);
	}

	@Step
	public void getMyVacationCompletedRequests() {
		myvacationcompletedrequestspage.getMyVacationCompletedRequests();
	}

	@Step
	public void click_nextLink() {
		myvacationcompletedrequestspage.click_nextLink();
	}

	@Step
	public void click_lastLink() {
		myvacationcompletedrequestspage.click_lastLink();
	}

	@Step
	public void click_prevLink() {
		myvacationcompletedrequestspage.click_prevLink();
	}

	@Step
	public void click_firstLink() {
		myvacationcompletedrequestspage.click_firstLink();
	}

}
