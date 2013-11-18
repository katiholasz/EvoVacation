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
public class LogOutTest 
{

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://172.22.8.39:9090/")
    public Pages pages;

    @Steps
    public LogInSteps endUser;
    
    @Test
    public void Log_Out() 
    {
       endUser.enter_user("holaszkati@ymail.com");
       endUser.enter_passd("kati");
       endUser.clickMe();
       endUser.click_log_out();
       endUser.assert_Home_page_should_be_visible();
       
 }
}