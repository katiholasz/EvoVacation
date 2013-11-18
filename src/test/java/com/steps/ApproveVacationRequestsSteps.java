package com.steps;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.ApproveVacationRequestsPage;

@SuppressWarnings("serial")
@DefaultUrl("http://172.22.8.39:9090/web/guest/login")
public class ApproveVacationRequestsSteps extends ScenarioSteps {

	public ApproveVacationRequestsSteps(Pages pages) {
		super(pages);
	}

	ApproveVacationRequestsPage approvevacationrequests;

	@Step
	public void click_VacationRequestsBtn() {
		approvevacationrequests.click_VacationRequestsBtn();
	}

	@Step
	 public void assert_VacationRequestsActionBtn_should_be_visible() {
		approvevacationrequests.assert_VacationRequestsActionBtn_should_be_visible();
	 }

	@Step
	public void click_VacationRequestsActionBtn() {
		approvevacationrequests.click_VacationRequestsActionBtn();
	}

	@Step
	public void click_ApproveBtn() {
		approvevacationrequests.click_ApproveBtn();
	}

}
	
	   