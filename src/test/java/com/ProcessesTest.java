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
import com.steps.EvoVacationHistorySteps;
import com.steps.LogInSteps;
import com.steps.ProcessesSteps;
import com.steps.VacationSteps;

@Story(Application.Login.LogIn.class)
@RunWith(ThucydidesRunner.class)
public class ProcessesTest 
{

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://172.22.8.39:9090/")
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
	public ProcessesSteps processesSteps;
	
	@Test
	public void Log_In() {
		logIn.enter_user("holaszkati@ymail.com");
		logIn.enter_passd("kati");
		logIn.clickMe();
		logIn.click_vacations();
		processesSteps.click_Processes();
		processesSteps.click_VacationRequests();	
		processesSteps.getDriver().get("http://localhost:9090/web/.net-department/vacation?p_p_id=1_WAR_EvozonKaleooFormsportlet&p_p_lifecycle=0&p_p_state=normal&p_p_mode=view&p_p_col_id=column-1&p_p_col_count=1&_1_WAR_EvozonKaleooFormsportlet_mvcPath=%2Fview_kaleo_process.jsp&_1_WAR_EvozonKaleooFormsportlet_backURL=%2Fweb%2F.net-department%2Fvacation%3Fp_p_id%3D1_WAR_EvozonKaleooFormsportlet%26p_p_lifecycle%3D0%26p_p_state%3Dnormal%26p_p_mode%3Dview%26p_p_col_id%3Dcolumn-1%26p_p_col_count%3D1%26tabs1%3Dprocesses&_1_WAR_EvozonKaleooFormsportlet_kaleoProcessId=18864");
		processesSteps.retrieveMyVacationCompletedRequests();
	}
    
}