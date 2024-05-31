package com.crm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DWSloginPage {
	//class name and constructor name same
	public  DWSloginPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
}
	
//	//variable declaration 
//	@FindBy(id="Email")
//	public WebElement username;
//	@FindBy(name="Password")
//	 public WebElement password;
//	@FindBy(xpath="//input[@value='Log in']")
//	 public WebElement login_button;
//	
	
	//Method declaration
	@FindBy(id="Email")
	private WebElement username;
	@FindBy(name="Password")
	 private WebElement password;
	@FindBy(xpath="//input[@value='Log in']")
	 private WebElement login_button;


public void username(String value) {
	username.sendKeys(value);
}
public void password(String value) {
	password.sendKeys(value);
}
public void login_button() {
	login_button.click();
}

}
