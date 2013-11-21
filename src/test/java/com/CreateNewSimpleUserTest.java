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
import com.steps.CreateNewSimpleUserSteps;
import com.steps.EvoVacationHistorySteps;
import com.steps.LogInSteps;
import com.steps.NewVacationRequestSteps;
import com.steps.VacationSteps;

import tools.Constants;

@Story(Application.Login.LogIn.class)
@RunWith(ThucydidesRunner.class)
public class CreateNewSimpleUserTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://localhost:9090/")
	public Pages pages;

	// STEPS
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
	@Steps
	public CreateNewSimpleUserSteps createNewSimpleUserSteps;

	// TESTs
	@Test
	public void LogIn() {
		logIn.enter_user(Constants.DM_USER);
		logIn.enter_passd(Constants.DM_PASSWORD);
		logIn.clickMe();
		logIn.assert_SignOut_link_should_be_visible();
		controlPanelSteps.click_GoTo();
		controlPanelSteps.click_ControlPanel();
		controlPanelSteps.assert_ControlPanel_should_be_visible();
		controlPanelSteps.click_UsersAndOrganisation();
		controlPanelSteps.assert_UsersAndOrg_should_be_visible();
		createNewSimpleUserSteps.getDriver().get(Constants.ADD_USER_URL);
		createNewSimpleUserSteps.enter_screenName(Constants.NU_SCREEN_NAME);
		String emailGenerated = tools.GenerateRandom.generate_random_email();
		createNewSimpleUserSteps.enter_emailAdress(emailGenerated);
		createNewSimpleUserSteps.enter_fName(Constants.NU_F_NAME);
		createNewSimpleUserSteps.enter_lName(Constants.NU_L_NAME);
		createNewSimpleUserSteps.enter_pID(Constants.NU_PERS_ID);
		createNewSimpleUserSteps.enter_birthPlace(Constants.NU_BIRTH_PLACE);
		createNewSimpleUserSteps.click_save_newUser();
		createNewSimpleUserSteps.click_PasswordLink();
		createNewSimpleUserSteps.enter_password1(Constants.NU_PASSWORD);
		createNewSimpleUserSteps.enter_password2(Constants.NU_PASSWORD);
		createNewSimpleUserSteps.click_save_newUser();
		createNewSimpleUserSteps.click_SitesLink();
		createNewSimpleUserSteps.add_net_department();
		createNewSimpleUserSteps.click_save_newUser();
		logIn.click_log_out();
		logIn.assert_Home_page_should_be_visible();
		logIn.enter_user(emailGenerated);
		logIn.enter_passd(Constants.NU_PASSWORD);
		logIn.clickMe();
		logIn.assert_SignOut_link_should_be_visible();
		createNewSimpleUserSteps.click_IAgreeBtn();
		createNewSimpleUserSteps.enter_reminderQueryAnswer("answer");
		createNewSimpleUserSteps.click_saveReminderAnswer();
		logIn.click_vacations();
		vacationSteps.assert_NewVacationRequest_button_should_be_visible();
		vacationSteps.click_addNewVacation();
		newVacationRequestSteps.start_month(Constants.START_MONTH_NVR);
		newVacationRequestSteps.start_day(Constants.START_DAY_NVR);
		newVacationRequestSteps.start_year(Constants.START_YEAR_NVR);
		newVacationRequestSteps.end_month(Constants.END_MONTH_NVR);
		newVacationRequestSteps.end_day(Constants.END_DAY_NVR);
		newVacationRequestSteps.end_year(Constants.END_YEAR_NVR);
		newVacationRequestSteps.clickSaveBtn();
		logIn.click_log_out();
	}
}
