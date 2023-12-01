package com.objectrepository;
import org.openqa.selenium.By;
public class Locators {
//public final By pagename_elementname_elementtype = By.xpath("");
	public final By signup_firstname_editbox= By.xpath("//input[@id='firstName']");
	public final By signup_lastname_editbox= By.xpath("//input[@id='lastName']");
	public final By signup_emailaddress_editbox= By.xpath("//input[@id='emailAddress']");
	public final By signup_mobilenumber_editbox= By.xpath("//input[@id='phoneNumber']");
	public final By signup_password_editbox= By.xpath("//input[@id='password']");
	public final By signup_confirmpassword_editbox= By.xpath("//input[@id='ConfirmPassword']");
	public final By signup_country_editbox= By.xpath("//select[@name='nationality']");
	public final By signup_checkbox1_editbox= By.xpath("//input[@id='questions[q_135]']");
	public final By signup_checkbox2_editbox= By.xpath("//input[@id='questions[q_136]']");
	public final By signup_checkbox3_editbox= By.xpath("//input[@id='questions[q_137]']");
	public final By signup_education_editbox= By.xpath("//select[@name='attendeeType']");
	public final By signup_year_editbox= By.xpath("//select[@id='questions[q_134]']");
	public final By signup_submit_button= By.xpath("//button[@id='submit']");
}
