package com.pages;

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
	
	@FindBy(id = "_125_firstName")
	private WebElement firstName;
	
	@FindBy(id = "_125_lastName")
	private WebElement lastName;
	
	@FindBy(css =" input[id='_125_Personal Identification Number']")
	private WebElement personalID;
	
	@FindBy(id ="_125_Birthplace")
	private WebElement birthPlace;
	
	@FindBy(css=".lfr-component.form-navigator .aui-button-input-submit")
	private WebElement saveNewUserBtn;
 
	
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
	 
	 public void enter_birthPlace(String birthPlace) 
	 {
		 element(personalID).waitUntilVisible();
		 element(personalID).click();
		 element(personalID).clear();
		 element(personalID).type(birthPlace);
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
}
