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

import tools.Constants;

import com.requirements.Application;
import com.steps.ControlPanelSteps;
import com.steps.EvoVacationHistorySteps;
import com.steps.LogInSteps;
import com.steps.NewVacationRequestSteps;
import com.steps.VacationSteps;

@Story(Application.Login.LogIn.class)
@RunWith(ThucydidesRunner.class)
public class CheckConfirmationEmailWithParametersTest {

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
	public EvoVacationHistorySteps evoVacationHistorySteps;
	@Steps
	public NewVacationRequestSteps newVacationRequestSteps;

	@Test
	public void LogIn() throws MessagingException, IOException {
		webdriver.manage().window().maximize();
		logIn.enter_user(Constants.DM_USER);
		logIn.enter_passd(Constants.DM_PASSWORD);
		logIn.clickMe();
		logIn.assert_SignOut_link_should_be_visible();
		logIn.click_vacations();

		newVacationRequestSteps.clickNewVacation();
		newVacationRequestSteps.start_month("January");
		newVacationRequestSteps.start_day("22");
		newVacationRequestSteps.start_year("2014");

		newVacationRequestSteps.end_month("January");
		newVacationRequestSteps.end_day("23");
		newVacationRequestSteps.end_year("2014");
		newVacationRequestSteps.clickSaveBtn();

		newVacationRequestSteps
				.checkNotificationMessage("Your request completed successfully.");
		tools.MAIL.checkEmailWithParameters(tools.Constants.IMAP_TYPE,
				tools.Constants.ACOOUNT_ADDRESS, tools.Constants.ACOOUNT_PASSWORD,
				tools.Constants.EMAIL_FROM,
				tools.Constants.EMAIL_SUBJECT_NEW_REQUEST);
	}
}
