package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.ControlPanelPage;
import com.pages.LogInPage;
import com.pages.MyFreeDaysPage;
import com.pages.VacationPage;

@SuppressWarnings("serial")
public class MyFreeDaysSteps extends ScenarioSteps {

    public MyFreeDaysSteps(Pages pages) {
		super(pages);
		
	}

	LogInPage dictionaryPage;
    VacationPage vacationPage;
    ControlPanelPage contolPanelPage;
    MyFreeDaysPage myFreeDaysPage;


    @Step
    public void click_GoTo() 
    {
    	contolPanelPage.click_GoTo();
    }
    
    @Step
    public void enter_freeFromLastYear(String d) {
    	myFreeDaysPage.enter_freeFromLastYear(d);
    }
    
    @Step
    public void enter_freeCurrentYear(String e) {
    	myFreeDaysPage.enter_freeCurrentYear(e);
    }

    @Step
    public void enter_monthsExpBeforeHiring(String f) {
    	myFreeDaysPage.enter_monthsExpBeforeHiring(f);
    }
    
    @Step
    public void enter_monthsExpPreviousEvozon(String g) {
    	myFreeDaysPage.enter_monthsExpPreviousEvozon(g);
    }
    
    @Step
    public void refresh() {
    	myFreeDaysPage.refresh();
    }
   
    
}
    