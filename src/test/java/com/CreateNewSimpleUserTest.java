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
		controlPanelSteps.click_GoTo();
		controlPanelSteps.click_ControlPanel();
		controlPanelSteps.click_UsersAndOrganisation();
		createNewSimpleUserSteps.getDriver().get(Constants.ADD_USER_URL);
		createNewSimpleUserSteps.enter_screenName(Constants.NU_SCREEN_NAME);
		createNewSimpleUserSteps.enter_emailAdress(Constants.NU_EMAIL);
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
		//createNewSimpleUserSteps.add_net_department();
		
		//createNewSimpleUserSteps.getDriver().get(Constants.ADD_ROLES_URL);
		//createNewSimpleUserSteps.click_save_newUser();
	}

}
