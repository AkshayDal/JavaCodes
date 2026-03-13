package com.facebook.FirstMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	
	//Declaration
	@FindBy(name = "email")
	private WebElement username;
	
	@FindBy(name = "pass")
	private WebElement password;
	
	@FindBy(xpath = "//div[@aria-label='Log in']")
	private WebElement login;
	
	//Utilization
	public void enteringUsername()
	{
		username.sendKeys("abc@gmail.com");
	}
	
	public void enteringPassword()
	{
		password.sendKeys("123456");
	}
	public void loginClick()
	{
		login.click();
	}
	
	//Initialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


}
