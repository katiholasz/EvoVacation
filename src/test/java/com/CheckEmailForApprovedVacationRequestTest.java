package com;

import java.io.IOException;

import javax.mail.MessagingException;

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
public class CheckEmailForApprovedVacationRequestTest {

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
	public void Log_In() throws MessagingException, IOException {
		webdriver.manage().window().maximize();

		// logIn.enter_user(Constants.DM_USER);
		// logIn.enter_passd(Constants.DM_PASSWORD);
		// logIn.clickMe();
		// logIn.assert_SignOut_link_should_be_visible();
		// vacationSteps.assert_vacation_link_should_be_visible();
		// logIn.click_vacations();
		// tools.CompareEmails.getEmailsForApprovedVacationRequest();
		tools.GetEmail.vacation_approved_email();

	}
}