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
import com.steps.MyVacationRequestsSteps;
import com.steps.VacationSteps;

@Story(Application.Login.LogIn.class)
@RunWith(ThucydidesRunner.class)
public class MyVacationRequestTest {

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
	public MyVacationRequestsSteps myVacationRequests;

	@Test
	public void Check_1() {
		logIn.enter_user("amelia.ilies@evozon.com");
		logIn.enter_passd("1234");
		logIn.clickMe();
		vacationSteps.assert_vacation_is_visible();
		endUser.click_vacations();
		myVacationRequests.click_MyVacationRequest();
		myVacationRequests.assert_MyVacationRequests_link_should_be_visible();
		myVacationRequests.assert_MyRequestsActionBtn_should_be_visible();
		myVacationRequests.click_MyRequestActionBtn();
		myVacationRequests.click_WithdrawSubmissionBtn();
	}

	@Test
	public void Check_2() {
		myVacationRequests.select_RequestsNumber("10");
		myVacationRequests.getMyVacationCompletedRequests();
		myVacationRequests.click_nextLink();
		myVacationRequests.click_lastLink();
		myVacationRequests.click_prevLink();
		myVacationRequests.click_firstLink();
	}

	@Test
	public void Check_3() {
		myVacationRequests.select_RequestsNumber("20");
		myVacationRequests.getMyVacationCompletedRequests();
	}

	@Test
	public void Check_4() {
		myVacationRequests.select_RequestsNumber("30");
		myVacationRequests.getMyVacationCompletedRequests();
	}

	@Test
	public void Check_5() {
		myVacationRequests.select_RequestsNumber("50");
		myVacationRequests.getMyVacationCompletedRequests();
	}

	@Test
	public void Check_6() {
		myVacationRequests.select_RequestsNumber("75");
		myVacationRequests.getMyVacationCompletedRequests();
	}

}
