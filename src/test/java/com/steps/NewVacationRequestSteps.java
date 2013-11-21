package com.steps;


import com.pages.NewVacationRequestPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;


import static ch.lambdaj.Lambda.join;
import static org.fest.assertions.Assertions.assertThat;

@SuppressWarnings({ "unused", "serial" })
public class NewVacationRequestSteps extends ScenarioSteps{
	
	public NewVacationRequestSteps(Pages pages) {
		super(pages);
	}

	NewVacationRequestPage newVacationRequest;

	
	@Step
    public void clickVacationBtn() {
		newVacationRequest.click_vacation();
    }
	
	@Step
    public void clickNewVacation() {
		newVacationRequest.submit_new_vacation_button();
    }
	
	@Step
    public void choose_vacationType() {
		newVacationRequest.choose_vacationType();
	}
	@Step
	public void start_month(String sMonth){
		newVacationRequest.pick_start_month(sMonth);
	}
	@Step
	public void start_day(String sDay){
		newVacationRequest.pick_start_day(sDay);
	}

	@Step
	public void start_year(String sYear){
		newVacationRequest.pick_start_year(sYear);
	}

	@Step
	public void end_month(String eMonth){
		newVacationRequest.pick_end_month(eMonth);
	}
	
	@Step
	public void end_day(String eDay){
		newVacationRequest.pick_end_day(eDay);
	}

	@Step
	public void end_year(String eYear){
		newVacationRequest.pick_end_year(eYear);
	}

	@Step
	public void clickSaveBtn(){
		newVacationRequest.save_request();
	}
	
	@Step
	public void click_button_cancel(){
		newVacationRequest.cancel_request();
	}
	
	@Step
    public void checkNotificationMessage(String msg) {
		newVacationRequest.checkNotificationMessage(msg);
    }
}