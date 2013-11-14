package com.steps;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.AssignVacationRequestPage;
import com.pages.CancelAssignVacationRequestPage;

@SuppressWarnings("serial")
@DefaultUrl("http://172.22.8.39:9090/web/guest/login")
public class CancelAssignVacationRequestSteps extends ScenarioSteps {

	public CancelAssignVacationRequestSteps(Pages pages) {
		super(pages);
	}

	AssignVacationRequestPage assignvacationrequests;
	CancelAssignVacationRequestPage cancelassignvacationrequests;

	@Step
	public void click_VacationRequestsBtn() {
		assignvacationrequests.click_VacationRequestsBtn();
	}

	@Step
	public void click_VacationRequestsActionBtn() {
		assignvacationrequests.click_VacationRequestsActionBtn();
	}

	@Step
	public void click_AssignToBtn() {
		assignvacationrequests.click_AssignToBtn();
	}

	@Step
	public void click_Cancel() {
		cancelassignvacationrequests.click_Cancel();
	}

}