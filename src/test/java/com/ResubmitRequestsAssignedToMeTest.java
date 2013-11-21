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
import com.steps.RequestsAssignedToMeSteps;
import com.steps.VacationSteps;

@Story(Application.class)
@RunWith(ThucydidesRunner.class)
public class ResubmitRequestsAssignedToMeTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.22.8.39:9090")
	public Pages pages;

	@Steps
	public LogInSteps logIn;
	
	@Steps
	public VacationSteps vacationSteps;

	@Steps
	public LogInSteps endUser;
	
	@Steps
	public  RequestsAssignedToMeSteps resubmit;
	
	@Test
	public void Approve() {
		logIn.enter_user("amelia.ilies@evozon.com");
		logIn.enter_passd("1234");
		logIn.clickMe();
		vacationSteps.assert_vacation_is_visible();
		vacationSteps.assert_vacation_link_should_be_visible();
		endUser.click_vacations();
		resubmit.assert_VacationRequestsActionBtn_should_be_visible();
		resubmit.click_VacationRequestsActionBtn();
		resubmit.assert_VacationRequestsActionBtn_should_be_visible();
		resubmit.click_ResubmitBtn();
		resubmit.click_ConfirmResubmit();
	}
}
