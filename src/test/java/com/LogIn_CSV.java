package com;

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

@Story(Application.Login.LogIn.class)
@RunWith(ThucydidesParameterizedRunner.class)
@UseTestDataFrom("Resources/users.csv")

public class LogIn_CSV {
	
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

    @ManagedPages(defaultUrl = "http://localhost:9090/")
    public Pages pages;

    @Steps
    public LogInSteps endUser;
    @Steps
    public VacationSteps vacationSteps;

  //  public SignOutSteps singUser;
    
    @Issue("#Login-1")
    @Test
    public void InsertUserName() {
    	endUser.enter_user(getUsername());
        endUser.enter_passd(getPassword());
        endUser.clickMe();
        endUser.click_vacations();
        vacationSteps.click_addNewVacation();
    }
    
}

/*package com;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.EndUserSteps;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.Qualifier;
import net.thucydides.junit.annotations.UseTestDataFrom;
import net.thucydides.junit.runners.ThucydidesParameterizedRunner;

 @RunWith(ThucydidesParameterizedRunner.class)
        @UseTestDataFrom(value="users.csv", separator=',')
        public class LogIn_param {

            private String email;
            private String password;
            EndUserSteps endUser;

            public LogIn_param() 
            {
            	
            }

            @Qualifier
            public String getQualifier() {
                return email;
            }

            @Managed
            public WebDriver webdriver;

            @ManagedPages(defaultUrl = "http://localhost:9090/web/guest/login")
            public Pages pages;

            @Steps
            public EndUserSteps steps;

            @Test
            public void data_driven_test() {
                System.out.println(getEmail() + "," + getPassword());
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

         
        }
*/