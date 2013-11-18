package com;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.requirements.Application;
import com.steps.LogInSteps;
import com.steps.MyVacationCompletedRequestsSteps;
import com.steps.VacationSteps;

@Story(Application.Login.LogIn.class)
@RunWith(ThucydidesRunner.class)
public class MyVacationCompletedRequestTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.22.8.39:9090")
	public Pages pages;

	@Steps
	public LogInSteps logIn;

	@Steps
	public LogInSteps endUser;
	
	@Steps
	public VacationSteps vacationSteps;

	@Steps
	public MyVacationCompletedRequestsSteps myvacationcompletedrequest;

	@Test
	public void Check_1() {
		logIn.enter_user("amelia.ilies@evozon.com");
		logIn.enter_passd("1234");
		logIn.clickMe();
		vacationSteps.assert_vacation_is_visible();
		endUser.click_vacations();
		myvacationcompletedrequest.assert_MyVacationCompletedRequests_link_should_be_visible();
		myvacationcompletedrequest.click_MyVacationCompletedRequest();
		myvacationcompletedrequest.select_RequestsNumber("5");
		myvacationcompletedrequest.getMyVacationCompletedRequests();
	
		
	}
	
	@Test
	public void Check_2() {
		myvacationcompletedrequest.select_RequestsNumber("10");
		myvacationcompletedrequest.getMyVacationCompletedRequests();
		myvacationcompletedrequest.click_nextLink();
		myvacationcompletedrequest.click_lastLink();
		myvacationcompletedrequest.click_prevLink();
		myvacationcompletedrequest.click_firstLink();
	}
	
	@Test
	public void Check_3() {
		myvacationcompletedrequest.select_RequestsNumber("20");
		myvacationcompletedrequest.getMyVacationCompletedRequests();
	}
	
	@Test
	public void Check_4() {
		myvacationcompletedrequest.select_RequestsNumber("30");
		myvacationcompletedrequest.getMyVacationCompletedRequests();
	}
	
	@Test
	public void Check_5() {
		myvacationcompletedrequest.select_RequestsNumber("50");
		myvacationcompletedrequest.getMyVacationCompletedRequests();
	}
	
	@Test
	public void Check_6() {
		myvacationcompletedrequest.select_RequestsNumber("75");
		myvacationcompletedrequest.getMyVacationCompletedRequests();
	}
}
