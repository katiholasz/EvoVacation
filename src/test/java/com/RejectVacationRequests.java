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
import com.steps.RejectVacationRequestsSteps;

@Story(Application.Login.LogIn.class)
@RunWith(ThucydidesRunner.class)
public class RejectVacationRequests {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.22.8.39:9090")
	public Pages pages;

	@Steps
	public LogInSteps logIn;

	@Steps
	public LogInSteps endUser;

	@Steps
	public RejectVacationRequestsSteps endUser1;

	@Test
	public void Log_In() {
		logIn.enter_user("amelia.ilies@evozon.com");
		logIn.enter_passd("1234");
		logIn.clickMe();
		endUser.click_vacations();
		endUser1.click_VacationRequestsBtn();
		endUser1.click_VacationRequestsActionBtn();
		endUser1.click_RejectBtn();
	}
}
