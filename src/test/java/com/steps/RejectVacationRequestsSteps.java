package com.steps;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.RejectVacationRequestsPage;

@SuppressWarnings("serial")
@DefaultUrl("http://172.22.8.39:9090/web/guest/login")
public class RejectVacationRequestsSteps extends ScenarioSteps {

	public RejectVacationRequestsSteps(Pages pages) {
		super(pages);
	}

	RejectVacationRequestsPage rejectvacationrequests;

	@Step
	public void click_VacationRequestsBtn() {
		rejectvacationrequests.click_VacationRequestsBtn();
	}
	
	@Step
	 public void assert_VacationRequestsActionBtn_should_be_visible() {
		rejectvacationrequests.assert_VacationRequestsActionBtn_should_be_visible();
	 }

	@Step
	public void click_VacationRequestsActionBtn() {
		rejectvacationrequests.click_VacationRequestsActionBtn();
	}

	@Step
	public void click_RejectBtn() {
		rejectvacationrequests.click_RejectBtn();
	}
}