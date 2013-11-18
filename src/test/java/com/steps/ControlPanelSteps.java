package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.ControlPanelPage;
import com.pages.LogInPage;
import com.pages.VacationPage;

@SuppressWarnings("serial")
public class ControlPanelSteps extends ScenarioSteps {

    public ControlPanelSteps(Pages pages) {
		super(pages);
	}

	LogInPage dictionaryPage;
    VacationPage vacationPage;
    ControlPanelPage contolPanelPage;


    @Step
    public void click_GoTo() 
    {
    	contolPanelPage.click_GoTo();
    }

    @Step
    public void click_ControlPanel() 
    {
    	contolPanelPage.click_ControlPanel();
    } 
    
    @Step
    public void click_MyFreeDays() 
    {
    	contolPanelPage.click_MyFreeDays();
    }
    
    @Step
    public void assert_MyFreeDays_page_should_be_visible() 
    {
    	contolPanelPage.assert_MyFreeDays_page_should_be_visible();
    }
    
    @Step
    public void assert_ControlPanel_should_be_visible() 
    {
    	contolPanelPage.assert_MyFreeDays_page_should_be_visible();
    }

    @Step
    public void click_EvoVacationHistory()
    {
    	contolPanelPage.click_EvoVacationHistory();
    }
    
    @Step
    public void click_EvoCancelVacation()
    {
    	contolPanelPage.click_EvoCancelVacation();
    }
    
    @Step
    public void click_UsersAndOrganisation()
    {
    	contolPanelPage.click_UsersAndOrganisation();
    }
    
}
    