package pageobjects;

import org.openqa.selenium.By;

import base.Action;
import base.DriverIdentify;
import base.Loggers;
import base.SetupDriver;

public class ContactUsPage extends DriverIdentify {
	

	// customer care form name xpath
	public By care_from_name = (By.xpath("//input[@id='name']"));

	// customer care form email
	public By care_from_email = (By.xpath("//input[@id='email']"));

	// customer care form phone
	public By care_from_phone = (By.xpath("//input[@id='phone']"));

	// customer care form messgae
	public By care_from_message = (By.xpath("//input[@id='message']"));

	// customer care form send btn
	public By care_form_send_btn = (By.xpath("//input[@class='button' and @value=\"Send to Customer Care\"]"));


	public void clickFormSubmit() {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(care_form_send_btn, 5);
		ac.click(care_form_send_btn);
		Loggers.logger.info("click on send info form");
	}

	public void typeName(String name) {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(care_from_name, 5);
		ac.typing(care_from_name, name);
		Loggers.logger.info("type name in form");
	}

	public void typeFormEmail(String email) {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(care_from_email, 5);
		ac.typing(care_from_email, email);
		Loggers.logger.info("type email in form");
	}

	public void typeFormPhone(String phomne) {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(care_from_phone, 5);
		ac.typing(care_from_phone, phomne);
		Loggers.logger.info("type form phone number");
	}

	public void typeFormMessage(String message) {
		Action ac = new Action(driver);
		ac.explicitWaitTillElementVisibility(care_from_message, 5);
		ac.typing(care_from_message, message);
		Loggers.logger.info("type form message");
	}
	
	public void navigateToPage() {
		MainButtons homepage = new MainButtons();
		driver.navigate().to(SetupDriver.prop.getProperty("Home_page"));

		homepage.clickContactUs();
		Loggers.logger.info("Navigate to contact us page");
	}

}