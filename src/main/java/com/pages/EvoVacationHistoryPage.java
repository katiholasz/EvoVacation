package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.seleniumemulation.SeleniumMutator;
import org.openqa.selenium.internal.seleniumemulation.SeleniumSelect;
import org.openqa.selenium.support.FindBy;

@SuppressWarnings("unused")
@DefaultUrl("http://172.22.8.39:9090/web/guest/login")
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

	@FindBy(css =".tip-concediu-label")
	private WebElement ddlTipConcediu;

	@FindBy(css ="ul.concediu-ul")
	private WebElement concediuListContainer;
	// ---------------------------------- METHODS --------------------------------------------------
	public void refresh_page()
	{
		getDriver().navigate().refresh();
	}

	public void goto_EvoVH()
	{
		element(goTo_EvoVacationHistory).waitUntilVisible();
		element(goTo_EvoVacationHistory).click(); 
	}

	public void send_enter() 
	{

	}

	public void checkAdvancedSearch() 
	{
		if (!advancedSearchLink.isDisplayed())
		{
			refresh_page();
		} 
		else
		{
			if (advancedSearchLink.isDisplayed())
			{
				element(advancedSearchLink).waitUntilVisible();
				element(advancedSearchLink).click(); 
			}
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

	public void select_tip_concediu(String checkName)
	{
		element(ddlTipConcediu).waitUntilVisible();
		element(ddlTipConcediu).click();

		element(concediuListContainer).waitUntilVisible();

		List<WebElement> checkList = concediuListContainer.findElements(By.cssSelector("li span.aui-field-content"));

		for(WebElement elementNow:checkList){
			String currentTerm = elementNow.getText();
			System.out.println("Current term: " + currentTerm);
			if(currentTerm.contains(checkName)){
				elementNow.findElement(By.cssSelector("input:last-child")).click();
				break;
			}
		}
	}



}
