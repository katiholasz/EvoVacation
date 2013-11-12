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
import com.steps.LogInSteps;

@Story(Application.Login.LogIn.class)
@RunWith(ThucydidesRunner.class)
public class Vacations 
{

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://localhost:9090/")
    public Pages pages;

    @Steps
    public LogInSteps endUser;
    
    @Test
    public void vacations() 
    {
       endUser.clickMe();      
	}
    
}