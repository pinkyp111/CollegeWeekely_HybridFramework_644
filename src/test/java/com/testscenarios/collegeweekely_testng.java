package com.testscenarios;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utilities.CommonFunctions;

public class collegeweekely_testng extends CommonFunctions{
	public static WebDriver driver;
	
 
  @BeforeClass
  public void beforeClass()  {
	  System.out.println("@BeforeClass block");
	  chromeBrowserLaunch();
  }
  @Test
  public void f() throws Exception {
	 getURL("CollegeWeekely_URL");
		sendKeysByAnyLocator(loc.signup_firstname_editbox, "FirstName");
		sendKeysByAnyLocator(loc.signup_lastname_editbox, "LastName");
		sendKeysByAnyLocator(loc.signup_emailaddress_editbox, "Email");
		sendKeysByAnyLocator(loc.signup_mobilenumber_editbox, "PhoneNumber");
		sendKeysByAnyLocator(loc.signup_password_editbox, "Password");
		sendKeysByAnyLocator(loc.signup_confirmpassword_editbox, "ConfirmPassword");
		
		selectCustomiseOptionFromTheDropdownValues(loc.signup_country_editbox,"ARUBA");
		
		  Thread.sleep(2000);
		selectCustomiseOptionFromTheDropdownValues(loc.signup_education_editbox,"Parent");
		  Thread.sleep(2000);
		  selectCustomiseOptionFromTheDropdownValues(loc.signup_year_editbox,"Fall 2023");
		
		clickByAnyLocator(loc.signup_checkbox1_editbox);
		clickByAnyLocator(loc.signup_checkbox2_editbox);
		clickByAnyLocator(loc.signup_checkbox3_editbox);
		clickByAnyLocator(loc.signup_submit_button);
		Thread.sleep(2000);
  }
  @AfterClass
  public void afterClass() throws Exception {
	  System.out.println("@AfterClass block");
	  takeScreenshot("collegeweekely_testng");
	  
		// close the browser
		driver.close();
		driver.quit();
  }
  
  public static WebDriver initializeanGetDriver(WebDriver driverN) {
	  driver = driverN;
	  return driver;
  }

}
