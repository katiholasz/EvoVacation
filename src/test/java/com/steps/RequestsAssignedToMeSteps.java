package com.steps;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.RequestsAssignedToMePage;

@SuppressWarnings("serial")
@DefaultUrl("http://172.22.8.39:9090/web/guest/login")
public class RequestsAssignedToMeSteps extends ScenarioSteps {

	public RequestsAssignedToMeSteps(Pages pages) {
		super(pages);
	}

	RequestsAssignedToMePage requestsAssignedToMe;

	// Vacation Requests
	@Step
	public void click_VacationRequestBtn() {
		requestsAssignedToMe.click_VacationRequestBtn();
	}

	@Step
	public void assert_VacationRequestsActionBtn_should_be_visible() {
		requestsAssignedToMe
				.assert_VacationRequestsActionBtn_should_be_visible();
	}

	@Step
	public void click_VacationRequestsActionBtn() {
		requestsAssignedToMe.click_VacationRequestsActionBtn();
	}

	@Step
	public void assert_ResubmitBtn_should_be_visible() {
		requestsAssignedToMe.assert_ResubmitBtn_should_be_visible();
	}
	
	@Step
	public void click_ResubmitBtn() {
		requestsAssignedToMe.click_ResubmitBtn();
	}

	@Step
	public void click_ConfirmResubmit() {
		requestsAssignedToMe.click_ConfirmResubmit();
	}
}
