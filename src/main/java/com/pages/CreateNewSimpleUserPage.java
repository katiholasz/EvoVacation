package com.pages;

import java.util.Set;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://localhost:9090/web/guest/login")
public class CreateNewSimpleUserPage extends PageObject {

	public CreateNewSimpleUserPage(WebDriver driver) {
		super(driver);
	}

	// ---------------------ELEMENTS------------------------
	@FindBy(id = "_125_screenName")
	private WebElement screenName;

	@FindBy(id = "_125_emailAddress")
	private WebElement emailAddress;

	@FindBy(css="span input[id ='_125_firstName']")
	private WebElement firstName;

	@FindBy(css="span input[id ='_125_lastName']")
	private WebElement lastName;

	@FindBy(css ="span input[id='_125_Personal Identification Number']")
	private WebElement personalID;

	@FindBy(css="input[id*='_125_Birthplace'][type='text']")
	private WebElement birthPlace;

	@FindBy(css=".lfr-component.form-navigator .aui-button-input-submit")
	private WebElement saveNewUserBtn;

	@FindBy(css= "	input[id='_125_password1']")
	private WebElement password1;

	@FindBy(css= "	input[id='_125_password2']")
	private WebElement password2;


	@FindBy(css= "[href*=openGroup]")
	private WebElement selectDepartemntButton;

	@FindBy(css= "td[id*=\"net-department\"] a")
	private WebElement netDepartmentFromModal;


	// ------------------- METHODS -------------
	public void enter_screenName(String sName) 
	{
		element(screenName).waitUntilVisible();
		element(screenName).click();
		element(screenName).clear();
		element(screenName).type(sName);
	}

	public void enter_email(String email) 
	{
		element(emailAddress).waitUntilVisible();
		element(emailAddress).click();
		element(emailAddress).clear();
		element(emailAddress).type(email);
	}

	public void enter_firstName(String fName) 
	{
		element(firstName).waitUntilVisible();
		element(firstName).click();
		element(firstName).clear();
		element(firstName).type(fName);
	}

	public void enter_lastName(String lName) 
	{
		element(lastName).waitUntilVisible();
		element(lastName).click();
		element(lastName).clear();
		element(lastName).type(lName);
	}

	public void enter_birthPlace(String bPlace) 
	{
		element(birthPlace).waitUntilVisible();
		element(birthPlace).click();
		element(birthPlace).clear();
		element(birthPlace).type(bPlace);
	}

	public void enter_pId(String pId) 
	{
		element(personalID).waitUntilVisible();
		element(personalID).click();
		element(personalID).clear();
		element(personalID).type(pId);
	}

	public void saveNewUser() 
	{
		element(saveNewUserBtn).waitUntilVisible();
		element(saveNewUserBtn).click();
	}

	//PASSWORD
	public void enter_password1(String pass1) 
	{
		element(password1).waitUntilVisible();
		element(password1).click();
		element(password1).clear();
		element(password1).type(pass1);
	}

	public void enter_password2(String pass2) 
	{
		element(password2).waitUntilVisible();
		element(password2).click();
		element(password2).clear();
		element(password2).type(pass2);
	}

	public void add_site()
	{

	}

	public void click_selectDepartemntButton(){
		element(selectDepartemntButton).waitUntilVisible();
		selectDepartemntButton.click();
	}

	public void select_net_dep_from_users_and_organizations(){
		//getDriver().switchTo().window("Users and Organizations");
		String defaultHandle = getDriver().getWindowHandle();

		Set<String> handles = getDriver().getWindowHandles();

		for(String windowHandle  : handles)
			getDriver().switchTo().window(windowHandle);

		element(netDepartmentFromModal).waitUntilVisible();
		netDepartmentFromModal.click();

		getDriver().switchTo().window(defaultHandle);
	}

}
