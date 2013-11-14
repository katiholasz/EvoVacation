package com.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://localhost:9090/web/guest/login")
public class ControlPanelPage extends PageObject {
	// Constructor
	public ControlPanelPage(WebDriver driver) {
		super(driver);
	}

	// web element - Go To from Top Menu
	@FindBy(css = ".my-sites .menu-button span")
	public WebElement goTo_fromTopMenu;

	// web element - click Control Panel from Drop Down
	@FindBy(css = ".control-panel a")
	public WebElement goTo_ControlPanel;

	// web element - click Control Panel for "My Free Days"
	@FindBy(id = "_160_portlet_evocontrolpanelmyfreedays_WAR_EvozonControlPanelMyFreeDaysportlet")
	public WebElement goTo_MyFreeDays;

	// web element - click Control Panel for "History"
	@FindBy(id = "_160_portlet_evocontrolpanelvacationhistory_WAR_EvozonControlPanelVacationHistoryportlet")
	public WebElement goTo_EvoVacationHistory;

	// web element - click Control Panel for "Evo Cancel Vacation"
	@FindBy(id = "_160_portlet_evocancelvacation_WAR_EvozonCancelVacationportlet")
	public WebElement goTo_EvoCancelVacation;
	
	// web element - click Control Panel for "Evo Cancel Vacation"
	@FindBy(id = "_160_portlet_125")
	public WebElement goTo_UsersAndOrganisation;

	// -- METHODS --
	public void click_GoTo() {
		element(goTo_fromTopMenu).waitUntilVisible();
		Actions actions = new Actions(getDriver());
		actions.moveToElement(goTo_fromTopMenu).click().build().perform();
		goTo_fromTopMenu.click();
	}

	public void click_ControlPanel() {
		element(goTo_ControlPanel).waitUntilVisible();
		/*
		  Actions actions = new Actions(getDriver());
		  actions.moveToElement(goTo_ControlPanel).click().build().perform();
		 */
		goTo_ControlPanel.click();
	}

	public void click_MyFreeDays() {
		element(goTo_MyFreeDays).waitUntilVisible();
		goTo_MyFreeDays.click();
	}

	public void click_EvoVacationHistory() {
		element(goTo_EvoVacationHistory).waitUntilVisible();
		goTo_EvoVacationHistory.click();
	}
	
	public void click_EvoCancelVacation() {
		element(goTo_EvoCancelVacation).waitUntilVisible();
		goTo_EvoCancelVacation.click();
	}

	public void click_UsersAndOrganisation() {
		element(goTo_UsersAndOrganisation).waitUntilVisible();
		goTo_UsersAndOrganisation.click();
	}

}
