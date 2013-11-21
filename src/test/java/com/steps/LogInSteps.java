package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import com.MyVacationCompletedRequestTest;
import com.MyVacationRequestTest;
import com.pages.LogInPage;
import com.pages.VacationPage;
import com.pages.ApproveVacationRequestsPage;

@SuppressWarnings("serial")
public class LogInSteps extends ScenarioSteps {

	LogInPage dictionaryPage;
	VacationPage vacationPage;
	MyVacationCompletedRequestTest myvacationcompletedrequestsPage;
	MyVacationRequestTest myvacationrequestsPage;
	ApproveVacationRequestsPage vacationrequestsPage;

	public LogInSteps(Pages pages) {
		super(pages);
	}

	@Step
	public void logIn(String email, String password) {
		dictionaryPage.enter(email).into(dictionaryPage.email);
		dictionaryPage.enter(password).into(dictionaryPage.password);
		dictionaryPage.signin.click();
	}

	@Step
	public void enter_user(String email) {
		dictionaryPage.open();
		dictionaryPage.enter_email(email);
	}

	@Step
	public void enter_passd(String password) {
		dictionaryPage.enter_password(password);
	}

	@Step
	public void clickMe() {
		dictionaryPage.submit();
	}

	@Step
	public void click_vacations() {
		vacationPage.vacation();
	}

	@Step
    public void click_log_out()
    {
     dictionaryPage.LogOut();
    }
	
	@Step
	public void assert_SignOut_link_should_be_visible()
	{
		dictionaryPage.assert_SignOut_link_should_be_visible();
	}
	
	@Step
	public void assert_Home_page_should_be_visible()
	{
		dictionaryPage.assert_Home_page_should_be_visible();
	}

	
}
