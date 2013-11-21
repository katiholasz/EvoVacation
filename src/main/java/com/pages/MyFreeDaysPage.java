package com.pages;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@SuppressWarnings("unused")
@DefaultUrl("http://172.22.8.39:9090/web/guest/login")
public class MyFreeDaysPage extends PageObject {

	// Constructor
	public MyFreeDaysPage(WebDriver driver) 
	{
		super(driver);
	}

	//--------- ELEMENTS ------------
	@FindBy(css = "input[id='pqai_Free Days From Last Year']")
	public WebElement freeDaysLastYear;
	
	@FindBy(css = "input[id='znux_Free Days In Current Year']")
	public WebElement freeDaysCurrentYear;
	
	@FindBy(css = "input[id='eada_Months Of Experience Before Hiring']")
	public WebElement monthsExpBeforeHiring;
	
	@FindBy(css = "input[id='scch_Months Of Previous Experience In Evozon']")
	public WebElement monthsExpPreviousEvozon;
	
	// ---------------------------------- METHODS --------------------------------------------------
	//enter data to input - Free From Last Year
	 public void enter_freeFromLastYear(String freeLastYear) 
	 {
		 	element(freeDaysLastYear).waitUntilVisible();
		 	element(freeDaysLastYear).click();
		 	element(freeDaysLastYear).clear();
	        element(freeDaysLastYear).type(freeLastYear);
	 }
	 
	//enter data to input - Free From Current Year
	 public void enter_freeCurrentYear(String freeCurrent) 
	 {
		 	element(freeDaysCurrentYear).waitUntilVisible();
		 	element(freeDaysCurrentYear).click();
		 	element(freeDaysCurrentYear).clear();
		 	element(freeDaysCurrentYear).type(freeCurrent);
	 }
	 
	//enter data to input - Months Experience Before Hiring
	 public void enter_monthsExpBeforeHiring(String expBefore) 
	 {
		 	element(monthsExpBeforeHiring).waitUntilVisible();
		 	element(monthsExpBeforeHiring).type(expBefore);
	 }
	 
	//enter data to input - Months Experience Previous Evozon
	 public void enter_monthsExpPreviousEvozon(String expPreviousEvo) 
	 {
		 	element(monthsExpPreviousEvozon).waitUntilVisible();
		 	element(monthsExpPreviousEvozon).type(expPreviousEvo);
	 }
	 
	 public void refresh()
	 {
		 getDriver().navigate().refresh();

	 }
}
