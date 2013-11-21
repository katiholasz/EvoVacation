package com.steps;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.AssignToMeRequestsPage;

@SuppressWarnings("serial")
@DefaultUrl("http://172.22.8.39:9090/web/guest/login")
public class AssignToMeRequestsSteps extends ScenarioSteps{

	public AssignToMeRequestsSteps(Pages pages) {
		super(pages);
	}

	AssignToMeRequestsPage assigntomerequests;

	@Step
	public void click_VacationRequestsBtn() {
		assigntomerequests.click_VacationRequestsBtn();
	}

	@Step
	public void click_VacationRequestsActionBtn() {
		assigntomerequests.click_VacationRequestsActionBtn();
	}

	@Step
	public void click_AssignToMeBtn() {
		assigntomerequests.click_AssignToMeBtn();
	}
	
	@Step
	public void enter_Comment(String keyword) {
		assigntomerequests.Comment("test");		
	}
	
	@Step
	public void click_ConfirmAssignToMe() {
		assigntomerequests.click_ConfirmAssignToMe();
	}


}