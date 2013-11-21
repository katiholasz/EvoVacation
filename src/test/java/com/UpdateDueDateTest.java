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
import com.steps.UpdateDueDateSteps;

@Story(Application.class)
@RunWith(ThucydidesRunner.class)
public class UpdateDueDateTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.22.8.39:9090")
	public Pages pages;

	@Steps
	public LogInSteps logIn;

	@Steps
	public LogInSteps endUser;

	@Steps
	public UpdateDueDateSteps datePicker;

	@Test
	public void Log_In() {
		logIn.enter_user("amelia.ilies@evozon.com");
		logIn.enter_passd("1234");
		logIn.clickMe();
		endUser.click_vacations();
		datePicker.click_VacationRequestsBtn();
		datePicker.click_VacationRequestsActionBtn();
		datePicker.click_UpdateBtn();
		datePicker.select_Month("July");
		datePicker.select_Day("28");
		datePicker.select_Year("2014");
		datePicker.select_Hour("7");
		datePicker.select_Minute(":01");
		datePicker.select_AmPm("AM");
		datePicker.enter_UpdateComment("test");
		datePicker.click_OkBtn();

	}
}
