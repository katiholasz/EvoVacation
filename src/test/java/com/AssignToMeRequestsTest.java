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
import com.steps.AssignToMeRequestsSteps;
import com.steps.LogInSteps;
import com.steps.VacationSteps;

@Story(Application.class)
@RunWith(ThucydidesRunner.class)
public class AssignToMeRequestsTest {

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
	public AssignToMeRequestsSteps assignTo;

	@Test
	public void Log_In() {
		logIn.enter_user("amelia.ilies@evozon.com");
		logIn.enter_passd("1234");
		logIn.clickMe();
		vacationSteps.assert_vacation_is_visible();
		endUser.click_vacations();
		vacationSteps.assert_vacation_link_should_be_visible();
		assignTo.click_VacationRequestsActionBtn();
		assignTo.click_AssignToMeBtn();
		assignTo.enter_Comment("test");
		assignTo.click_ConfirmAssignToMe();
	}
}
