package com.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://172.22.8.39:9090/web/.net-department/vacation")
public class MyVacationCompletedRequestsPage extends PageObject {

	public MyVacationCompletedRequestsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "a[href*=my-completed-requests]")
	private WebElement MyVacationCompletedRequestsBtn;

	public void click_MyVacationCompletedRequestsBtn() {
		element(MyVacationCompletedRequestsBtn).click();
	}
}
