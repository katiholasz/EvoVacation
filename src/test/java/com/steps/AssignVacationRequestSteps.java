package com.steps;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.AssignVacationRequestPage;

@SuppressWarnings("serial")
@DefaultUrl("http://172.22.8.39:9090/web/guest/login")
public class AssignVacationRequestSteps extends ScenarioSteps {

	public AssignVacationRequestSteps(Pages pages) {
		super(pages);
	}

	AssignVacationRequestPage assignvacationrequests;

	@Step
	public void click_VacationRequestsBtn() {
		assignvacationrequests.click_VacationRequestsBtn();
	}
	
//	@Step
//	public void enter_workflowTaskId(String id) {
//		assignvacationrequests.enter_workflowTaskId("id");		
//	}

	@Step
	 public void assert_VacationRequestsActionBtn_should_be_visible() {
		assignvacationrequests.assert_VacationRequestsActionBtn_should_be_visible();
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
	public void click_AssignUser() {
		assignvacationrequests.click_AssignUser();
	}
	
	@Step
	public void click_a_person(String person) {
		assignvacationrequests.select_to_a_person(person);		
	}
	
	@Step
	public void enter_AssignComment(String keyword) {
		assignvacationrequests.AssignComment("test");		
	}
	
	@Step
	public void click_Ok() {
		assignvacationrequests.click_OK();
	}

	@Step
	public void markListEntry(String Username, String dateBetween) {
		assignvacationrequests.markListEntry(Username, dateBetween);
	}
	
}