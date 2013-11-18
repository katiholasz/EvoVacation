package com.steps;

import com.pages.CancelUpdateDueDatePage;
import com.pages.UpdateDueDatePage;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
@DefaultUrl("http://172.22.8.39:9090/web/guest/login")
public class CancelUpdateDueDateSteps extends ScenarioSteps {

	public CancelUpdateDueDateSteps(Pages pages) {
		super(pages);
	}

	UpdateDueDatePage updateduedate;
	CancelUpdateDueDatePage cancelupdateduedate;

	@Step
	public void click_VacationRequestsBtn() {
		updateduedate.click_VacationRequestsBtn();
	}
	
	@Step
	 public void assert_VacationRequestsActionBtn_should_be_visible() {
		cancelupdateduedate.assert_VacationRequestsActionBtn_should_be_visible();
	 }

	@Step
	public void click_VacationRequestsActionBtn() {
		updateduedate.click_VacationRequestsActionBtn();
	}

	@Step
	public void click_UpdateBtn() {
		updateduedate.click_UpdateBtn();
	}

	@Step
	public void click_cancelBtn() {
		cancelupdateduedate.click_cancelBtn();
	}
}
