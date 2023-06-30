package pageobjects;

import org.openqa.selenium.By;

import base.Action;
import base.DriverFactory;
import base.Loggers;
import base.SetupDriver;
import io.qameta.allure.Step;

public class OpenNewAccountPage extends SetupDriver {

	 private  Action ac = new Action(DriverFactory.getDriver());

public By acoount_id_verification=(By.xpath("//h1[@class='title']"));

	//account number selection
	public By accout_number_selection=(By.xpath("//select[@id='fromAccountId']"));
	
	//account type selection
	public By accout_type_selection=(By.xpath("//select[@id='type']"));
	//open new account btn
	public By open_new_account_btn=(By.xpath("//input[@type='submit']"));
	

	public void navigateToPage() {
		HomePage homepage = new HomePage();
		LogInForm loginform=new LogInForm();
		AccountServiceLinks opennewaccount=new AccountServiceLinks();
		homepage.navigateToPage();
		loginform.typeUserName("hhh");
		loginform.typePassword("hhh");
		loginform.clickLogin();
		opennewaccount.clcikNewAccounts();

	}
	
	@Step("click open account button ")	
	public void clickOpenAccountBtn() {
		ac.explicitWaitTillElementVisibility(open_new_account_btn, 5);
		ac.click(open_new_account_btn);
		Loggers.logger.info("click on open new account btn");
	}
}
