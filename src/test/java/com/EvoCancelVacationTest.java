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
import tools.Constants;

@Story(Application.Login.LogIn.class)
@RunWith(ThucydidesRunner.class)
public class EvoCancelVacationTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.22.8.39:9090")
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
		logIn.enter_user(Constants.DM_USER);
		logIn.enter_passd(Constants.DM_PASSWORD);
		logIn.clickMe();
		logIn.assert_SignOut_link_should_be_visible();
		controlPanelSteps.click_GoTo();
		controlPanelSteps.click_ControlPanel();
		controlPanelSteps.assert_ControlPanel_should_be_visible();
		controlPanelSteps.click_EvoCancelVacation();
		evoCancelVacationsteps
				.assert_checkBox_CheckBetweenDates_should_be_Visible();
		evoCancelVacationsteps.click_SearchBetweenDates();
		evoCancelVacationsteps.cancelExistingRequest();
		evoCancelVacationsteps.waitABit(5000);
	}
}
