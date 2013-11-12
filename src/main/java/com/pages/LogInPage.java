package com.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://localhost:9090/web/guest/login")
public class LogInPage extends PageObject {

	    @FindBy(id="_58_login")
	    public WebElement email;

	    @FindBy(id="_58_password")
	    public WebElement password;

	    @FindBy(css=".aui-button-input")
		public WebElement signin;

	    @FindBy(linkText = "Logout")
	    public WebElement logout;

	    public LogInPage(WebDriver driver) 
	    {
	        super(driver);
	    }	       
	    
	    public void enter_email(String em) {
	        element(email).type(em);
	    }
	    
	    public void enter_password(String ps) {
	        element(password).type(ps);
	    }

	    public void submit() {
	        element(signin).click();
	    }
	    
	    public void logout() {
	        logout.click();
	    }

	  /*  public void login(String email, String password) {
	        enter(email).into(emailField);
	        enter(password).into(passwordField);
	        signin.click();
	    }

	    public void logout() {
	        logout.click();
	    }**/
	}

/*
    @FindBy(name="search")
    private WebElement searchTerms;

    @FindBy(name="go")
    private WebElement lookupButton;

    public DictionaryPage(WebDriver driver) {
        super(driver);
    }

    public void enter_keywords(String keyword) {
        element(searchTerms).type(keyword);
    }

    public void lookup_terms() {
        element(lookupButton).click();
    }

    public List<String> getDefinitions() {
        WebElement definitionList = getDriver().findElement(By.tagName("ol"));
        List<WebElement> results = definitionList.findElements(By.tagName("li"));
        return convert(results, toStrings());
    }

    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }
    
}
*/

