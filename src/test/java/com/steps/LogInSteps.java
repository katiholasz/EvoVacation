package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.LogInPage;
import com.pages.VacationPage;

@SuppressWarnings("serial")
public class LogInSteps extends ScenarioSteps {

    LogInPage dictionaryPage;
    VacationPage vacationPage;

    public LogInSteps(Pages pages) 
    {
        super(pages);
    }
    
   @Step
   public void logIn(String email, String password) 
   {
       dictionaryPage.enter(email).into(dictionaryPage.email);
       dictionaryPage.enter(password).into(dictionaryPage.password);
       dictionaryPage.signin.click();
   }
       

    @Step
    public void enter_user(String email) {
        dictionaryPage.open();
        dictionaryPage.enter_email(email);
    }

    @Step
    public void enter_passd(String password) {
        dictionaryPage.enter_password(password);
    }

    @Step
    public void clickMe() {
        dictionaryPage.submit();
    }
    
    @Step
    public void click_vacations() 
    {
        vacationPage.vacation();
    }

    @Step
    public void click_log_out()
    {
    	dictionaryPage.logout();
    }
    
}
    