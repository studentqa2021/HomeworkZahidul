package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	public MasterPageFactory(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//*[@class='login']")
private	WebElement signinbtn; 
@FindBy (xpath="//*[@id='email']")
private WebElement email;
@FindBy (xpath="//*[@name='passwd']")
private WebElement password;
@FindBy (xpath="//*[@class='icon-lock left']")
private WebElement signinbutton;
public WebElement getSigninbtn() {
	return signinbtn;
}
public WebElement getEmail() {
	return email;
}
public WebElement getPassword() {
	return password;
}
public WebElement getSigninbutton() {
	return signinbutton;
}


	
}
