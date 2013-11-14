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
import com.steps.EvoCancelVacationSteps;
import com.steps.LogInSteps;
import com.steps.VacationSteps;

@Story(Application.Login.LogIn.class)
@RunWith(ThucydidesRunner.class)
public class EvoCancelVacation {

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
	public EvoCancelVacationSteps evoCancelVacationsteps;


	@Test
	public void Log_In() {
		webdriver.manage().window().maximize();
		logIn.enter_user("holaszkati@ymail.com");
		logIn.enter_passd("kati");
		logIn.clickMe();
		controlPanelSteps.click_GoTo();
		controlPanelSteps.click_ControlPanel();
		controlPanelSteps.click_EvoCancelVacation();
		evoCancelVacationsteps.click_SearchBetweenDates();
		evoCancelVacationsteps.cancelExistingRequest();
		//evoCancelVacationsteps.click_TipConcediuDropDown();
		
	}
}