package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@SuppressWarnings("unused")
@DefaultUrl("http://localhost:9090/web/guest/login")
public class EvoVacationHistoryPage extends PageObject {

	// Constructor
	public EvoVacationHistoryPage(WebDriver driver) {
		super(driver);
	}

	//--------- ELEMENTS ------------
	@FindBy(id = "_evocontrolpanelvacationhistory_WAR_EvozonControlPanelVacationHistoryportlet_firstName")
	public WebElement firstName_field;

	@FindBy(id = "_evocontrolpanelvacationhistory_WAR_EvozonControlPanelVacationHistoryportlet_lastName")
	public WebElement lastName_field;

	@FindBy(id = "_evocontrolpanelvacationhistory_WAR_EvozonControlPanelVacationHistoryportlet_dayCount")
	public WebElement dayCount_field;

	@FindBy(id = "_evocontrolpanelvacationhistory_WAR_EvozonControlPanelVacationHistoryportlet_type")
	public WebElement vacationType_field;

	//SEARCH BUTTON
	@FindBy(css ="")
	public WebElement searchButton;

	//Advanced Link / BUTTON
	@FindBy(partialLinkText ="Advanced")
	public WebElement advancedSearchLink;

	//Advanced Link / BUTTON
	@FindBy(partialLinkText ="Basic")
	public WebElement basicSearchLink;

	// web element - click Control Panel for "History"
	@FindBy(id = "_160_portlet_evocontrolpanelvacationhistory_WAR_EvozonControlPanelVacationHistoryportlet")
	public WebElement goTo_EvoVacationHistory;

	// ---------------------------------- METHODS --------------------------------------------------
	public void refresh_page()
	{
		getDriver().navigate().refresh();

//		Actions actionObject = new Actions(getDriver());
//		actionObject.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
	}
	
	public void goto_EvoVH()
	{
	element(goTo_EvoVacationHistory).waitUntilVisible();
	element(goTo_EvoVacationHistory).click(); 
	}
	
	public void send_enter() throws AWTException
	{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
	}

	public void checkAdvancedSearch() 
	{
		if (advancedSearchLink.isDisplayed())
		{
			element(advancedSearchLink).waitUntilVisible();
			element(advancedSearchLink).click(); 
			//element(lastName_field).typeAndEnter();		
		} 
		else
		{
			refresh_page();
		}
	}

	public void insert_firstName(String first_name) 
	{
		if (!firstName_field.isDisplayed())
		{
			throw new IllegalStateException("First Name is not displayed!");
		} else
		{
			element(firstName_field).waitUntilVisible();
			element(firstName_field).click(); 
			element(firstName_field).typeAndEnter(first_name);		

		}        
	}

	public void insert_lastName(String last_name) 
	{
		if (!lastName_field.isDisplayed())
		{
			throw new IllegalStateException("Last Name is not displayed!");
		} else
		{
			element(lastName_field).waitUntilVisible();
			element(lastName_field).click(); 
			element(lastName_field).typeAndEnter(last_name);

		}        
	}

	public void insert_dayCount(String day_count) 
	{
		if (!dayCount_field.isDisplayed())
		{
			throw new IllegalStateException("Vacation type is not displayed!");
		} else
		{
			element(dayCount_field).waitUntilVisible();
			element(dayCount_field).click(); 
			element(dayCount_field).typeAndEnter(day_count);

		}        
	}

	public void insert_vacationType(String vacation_type) 
	{
		if (!vacationType_field.isDisplayed())
		{
			throw new IllegalStateException("Vacation type is not displayed!");
		} else
		{
			element(vacationType_field).waitUntilVisible();
			element(vacationType_field).click(); 
			element(lastName_field).typeAndEnter(vacation_type);
		}        
	}




}
