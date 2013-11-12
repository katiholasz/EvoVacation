package com;

import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.runner.RunWith;

import com.requirements.Application;
import com.steps.LogInSteps;
@Story(Application.Login.LogIn.class)
@RunWith(ThucydidesRunner.class)

public class LogOut 
{
	 @Steps
	public LogInSteps endUser;
	public class Log_out 
	{
	
	}
}
