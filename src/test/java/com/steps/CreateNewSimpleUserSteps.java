package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.ControlPanelPage;
import com.pages.LogInPage;
import com.pages.VacationPage;
import com.pages.CreateNewSimpleUserPage;



@SuppressWarnings("serial")
public class CreateNewSimpleUserSteps extends ScenarioSteps {

	public CreateNewSimpleUserSteps(Pages pages) {
		super(pages);
	}

	LogInPage dictionaryPage;
	VacationPage vacationPage;
	ControlPanelPage contolPanelPage;
	CreateNewSimpleUserPage CreateNewSimpleUserPage;

	@Step
	public void enter_screenName(String sName) {
		CreateNewSimpleUserPage.enter_screenName(sName);
	}

	@Step
	public void enter_emailAdress(String email) {
		CreateNewSimpleUserPage.enter_email(email);
	}

	@Step
	public void enter_fName(String fName) {
		CreateNewSimpleUserPage.enter_firstName(fName);
	}

	@Step
	public void enter_lName(String lName) {
		CreateNewSimpleUserPage.enter_lastName(lName);
	}

	@Step
	public void enter_pID(String pId) {
		CreateNewSimpleUserPage.enter_pId(pId);
	}

	@Step
	public void enter_birthPlace(String bPlace) {
		CreateNewSimpleUserPage.enter_birthPlace(bPlace);
	}

	@Step
	public void click_save_newUser() {
		CreateNewSimpleUserPage.saveNewUser();
	}
	
	@Step
	public void enter_password1(String pass) {
		CreateNewSimpleUserPage.enter_password1(pass);
	}
	
	@Step
	public void enter_password2(String pas) {
		CreateNewSimpleUserPage.enter_password2(pas);
	}
	
	@Step
	public void click_PasswordLink() {
		CreateNewSimpleUserPage.click_PasswordLink();
	}
	
	@Step
	public void click_SitesLink() {
		CreateNewSimpleUserPage.click_SitesLink();
	}
	
	@Step
	public void click_IAgreeBtn() {
		CreateNewSimpleUserPage.click_IAgreeBtn();
	}
	
	@Step
	public void enter_reminderQueryAnswer(String answer) {
		CreateNewSimpleUserPage.enter_reminderQueryAnswer(answer);
	}
	
	@Step
	public void click_saveReminderAnswer() {
		CreateNewSimpleUserPage.click_saveReminderAnswer();
	}
	
	@Step
	public void add_net_department() {
		CreateNewSimpleUserPage.click_selectDepartemntButton();
		CreateNewSimpleUserPage.select_net_dep_from_users_and_organizations();
		
	}
	
	

}
