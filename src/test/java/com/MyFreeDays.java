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
import com.steps.ControlPanelSteps;
import com.steps.LogInSteps;
import com.steps.MyFreeDaysSteps;
import com.steps.VacationSteps;

@Story(Application.Login.LogIn.class)
@RunWith(ThucydidesRunner.class)
public class MyFreeDays {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://localhost:9090/")
	public Pages pages;

	@Steps
	public LogInSteps logIn;
	@Steps
	public VacationSteps vacationSteps;
	@Steps
	public ControlPanelSteps controlPanelSteps;
	@Steps
	public MyFreeDaysSteps myFreeDaysSteps;

	@Test
	public void Log_In() {
		webdriver.manage().window().maximize();
		logIn.enter_user("holaszkati@ymail.com");
		logIn.enter_passd("kati");
		logIn.clickMe();
		controlPanelSteps.click_GoTo();
		controlPanelSteps.click_ControlPanel();
		controlPanelSteps.click_MyFreeDays();
		myFreeDaysSteps.enter_freeCurrentYear("2");
		myFreeDaysSteps.enter_freeFromLastYear("3");
		myFreeDaysSteps.enter_monthsExpBeforeHiring("10");
		myFreeDaysSteps.enter_monthsExpPreviousEvozon("12");
		myFreeDaysSteps.refresh();		
	}
}