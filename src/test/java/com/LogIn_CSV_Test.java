package com;

import java.io.IOException;

import javax.mail.MessagingException;

import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import net.thucydides.junit.runners.ThucydidesParameterizedRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.requirements.Application;
import com.steps.LogInSteps;
import com.steps.VacationSteps;

import tools.CheckVacationRequest;
import tools.GetEmail;

@Story(Application.Login.LogIn.class)
@RunWith(ThucydidesParameterizedRunner.class)
@UseTestDataFrom("Resources/users.csv")
public class LogIn_CSV_Test {

	String Username;
	String Password;

	@Qualifier
	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.22.8.39:9090/")
	public Pages pages;

	@Steps
	public LogInSteps endUser;
	@Steps
	public VacationSteps vacationSteps;

	@Issue("#Login-1")
	@Test
	public void InsertUserName() throws MessagingException, IOException {
//		endUser.enter_user(getUsername());
//		endUser.enter_passd(getPassword());
//		endUser.clickMe();
//		endUser.assert_SignOut_link_should_be_visible();
//		vacationSteps.assert_vacation_link_should_be_visible();
//		endUser.click_vacations();
//		vacationSteps.click_addNewVacation();
		//tools.GetEmail.vacation_approved_email();
		tools.CompareEmails.getEmails();
		//tools.GetEmail.vacation_approved_email();
	}

}