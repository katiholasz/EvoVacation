package com;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesParameterizedRunner;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.requirements.Application;
import com.steps.LogInSteps;

@Story(Application.Login.LogIn.class)
@RunWith(ThucydidesParameterizedRunner.class)

public class LogInTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = "http://172.22.8.39:9090/")
	public Pages pages;

	@Steps
	public LogInSteps endUser;


	@Test
	public void Log_In() {
		webdriver.manage().window().maximize();
		endUser.enter_user("amelia.ilies@evozon.com");
		endUser.enter_passd("1234");
		endUser.clickMe();
		endUser.assert_SignOut_link_should_be_visible();
		endUser.click_vacations();
		tools.GetEmail.vacation_approved_email();
	}

	@Test
	public void Log_In_DM() 
	{
		webdriver.manage().window().maximize();
		endUser.enter_user("holaszkati@ymail.com");
		endUser.enter_passd("kati");
		endUser.clickMe();
		endUser.assert_SignOut_link_should_be_visible();
		endUser.click_vacations();

	}
}