package com.facebook.FirstMaven;

import org.testng.Reporter;
import org.testng.annotations.Test;

import utility.BaseClass;

public class TestCase1_LoginToFacebook extends BaseClass
{
	@Test
	public void loginValidCredential()
	{
		LoginPage loginPage = new LoginPage();
		loginPage.enteringUsername();
		loginPage.enteringPassword();
		loginPage.loginClick();
		Reporter.log("Login is successful");
	}

}
