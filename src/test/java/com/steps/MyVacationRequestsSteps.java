package com.steps;

import com.pages.MyVacationRequestsPage;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
@DefaultUrl("http://172.22.8.39:9090/web/guest/login")
public class MyVacationRequestsSteps extends ScenarioSteps {

	public MyVacationRequestsSteps(Pages pages) {
		super(pages);
	}

	MyVacationRequestsPage myvacationrequests;

	@Step
	public void click_MyVacationRequest() {
		myvacationrequests.click_MyVacationRequestsBtn();
	}

	@Step
	public void assert_MyVacationRequests_link_should_be_visible() {
		myvacationrequests.assert_MyVacationRequest_link_should_be_visible();
	}

	@Step
	public void assert_MyRequestsActionBtn_should_be_visible() {
		myvacationrequests.assert_MyRequestsActionBtn_should_be_visible();
	}

	@Step
	public void click_MyRequestActionBtn() {
		myvacationrequests.click_MyRequestsActionBtn();
	}

	@Step
	public void click_WithdrawSubmissionBtn() {
		myvacationrequests.click_WithdrawSubmissionBtn();
	}

	@Step
	public void select_RequestsNumber(String number) {
		myvacationrequests.click_RequestsNumber(number);
	}

	@Step
	public void getMyVacationCompletedRequests() {
		myvacationrequests.getMyVacationCompletedRequests();
	}

	@Step
	public void click_nextLink() {
		myvacationrequests.click_nextLink();
	}

	@Step
	public void click_lastLink() {
		myvacationrequests.click_lastLink();
	}

	@Step
	public void click_prevLink() {
		myvacationrequests.click_prevLink();
	}

	@Step
	public void click_firstLink() {
		myvacationrequests.click_firstLink();
	}
}
