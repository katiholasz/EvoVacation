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
	public MyVacationRequestsSteps endUser2;

	@Test
	public void Log_In() {
		logIn.enter_user("amelia.ilies@evozon.com");
		logIn.enter_passd("1234");
		logIn.clickMe();
		endUser.click_vacations();
		endUser2.click_MyVacationRequest();
		endUser2.assert_MyVacationRequests_link_should_be_visible();
		endUser2.click_MyRequestActionBtn();
		endUser2.click_WithdrawSubmissionBtn();
	}

}
