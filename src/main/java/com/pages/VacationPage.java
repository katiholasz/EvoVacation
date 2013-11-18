package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://172.22.8.39:9090/:9090/web/guest/login")
public class VacationPage extends PageObject {

	public VacationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "a[href*=vacation]")
	public WebElement vacation;

	@FindBy(id = "_1_WAR_EvozonKaleooFormsportlet_addVacationRequest")
	public WebElement addVacation;
	
	public void assert_vacation_is_visible() {
		element(vacation).shouldBeVisible();		
	}

	public void vacation() {
		element(vacation).waitUntilVisible();
		element(vacation).click();
	}
	
    public void assert_vacation_link_should_be_visible() {
        element(vacation).shouldBeVisible();
    }

	public void AddNewVacation() {
		element(addVacation).waitUntilVisible();
		element(addVacation).click();
	}
}
