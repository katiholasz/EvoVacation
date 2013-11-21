package com.steps;

import com.pages.UpdateDueDatePage;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

@SuppressWarnings("serial")
@DefaultUrl("http://172.22.8.39:9090/web/guest/login")
public class UpdateDueDateSteps extends ScenarioSteps {

	public UpdateDueDateSteps(Pages pages) {
		super(pages);
	}

	UpdateDueDatePage updateduedate;

	@Step
	public void click_VacationRequestsBtn() {
		updateduedate.click_VacationRequestsBtn();
	}
	
	@Step
	 public void assert_VacationRequestsActionBtn_should_be_visible() {
		updateduedate.assert_VacationRequestsActionBtn_should_be_visible();
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
	public void select_Month(String month) {
		updateduedate.click_Month(month);			
	}
	
	@Step
	public void select_Day(String day) {
		updateduedate.click_Day(day);		
	}
	
	@Step
	public void select_Year(String year) {
		updateduedate.click_Year(year);		
	}
	
	@Step
	public void select_Hour(String hours) {
		updateduedate.click_Hour(hours);		
	}
	
	@Step
	public void select_Minute(String minutes) {
		updateduedate.click_Minute(minutes);		
	}
	 
	@Step
	public void select_AmPm(String ampm) {
		updateduedate.clic_AmPm(ampm);		
	}

	@Step
	public void enter_UpdateComment(String keyword) {
		updateduedate.UpdateComment("test");		
	}
	
	@Step
	public void click_OkBtn() {
		updateduedate.click_okBtn();
	}
}
