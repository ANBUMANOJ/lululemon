package com.lululemon.stepdefinition;

import org.openqa.selenium.By;

import com.lululemon.baseclass.FunctionalLibrary;
import com.lululemon.objects.CreateAccountPom;
import com.lululemon.objects.ForgetPasswordPom;
import com.lululemon.objects.SignInPom;
import com.lululemon.singleton.PageObjectManager;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.Reporter;

public class StepDefinition extends FunctionalLibrary {
	
//	@Given("^User initialize the browser$")
//	public void user_initialize_the_browser() throws Throwable {
//		launchBrowser();
//	}
	PageObjectManager po =new PageObjectManager();
	
	@When("^User enter the lululemon url$")
	public void user_enter_the_lululemon_url() throws Throwable {
		launchApp("https://shop.lululemon.com/");
	}

	@Then("^User click the sign in button$")
	public void user_click_the_sign_in_button() throws Throwable {
		clickBtn(po.getCap().getSigninClick());
	}

	@Then("^User create an account with email id$")
	public void user_create_an_account_with_email_id() throws Throwable {
		enterTextInTheWebelement(po.getCap().getEnterEmailAddress(), "anbumanoj129@gmail.com");
	}

	@Then("^User create a password for the account$")
	public void user_create_a_password_for_the_account() throws Throwable {
		enterTextInTheWebelement(po.getCap().getEnterPassword(), "Integrations@14");
	}

	@Then("^User click the create an account button$")
	public void user_click_the_create_an_account_button() throws Throwable {
		clickBtn(po.getCap().getCreateAccountClick());
	}
	
	@Then("^User check whether the email already in use header is displayed$")
	public boolean user_check_whether_the_email_already_in_use_header_is_displayed() throws Throwable {
		elementIsDisplayed(po.getCap().getAlreadyEmailInUse());		
		elementHighlight(po.getCap().getAlreadyEmailInUse());
		return false;
	}


	@Then("^User enter the email id$")
	public void user_enter_the_email_id() throws Throwable {
		enterTextInTheWebelement(po.getSip().getEnterUserName(), "anbumanoj129@gmail.com");
	}

	@Then("^User enter the password$")
	public void user_enter_the_password() throws Throwable {
		enterTextInTheWebelement(po.getSip().getEnterPassword(), "Integrations@14");
	}
	
	@Then("^User click the signin button$")
	public void user_click_the_signin_button() throws Throwable {
		clickBtn(po.getSip().getClickSignInButton());
	}
	
	@Then("^User logout from the application$")
	public void user_logout_from_the_application() throws Throwable {
		clickBtn(po.getSip().getSignoutClick());
	}

	@Then("^User click the forget password link$")
	public void user_click_the_forget_password_link() throws Throwable {
		clickBtn(po.getFpp().getClickForgetPassword());
	}

	@Then("^User the email id for reseting the password$")
	public void user_the_email_id_for_reseting_the_password() throws Throwable {
		enterTextInTheWebelement(po.getFpp().getEnterEmailId(), "anbumanoj129@gmail.com");
	}
	
	@Then("^User click the reset button$")
	public void user_click_the_reset_button() throws Throwable {
		clickBtn(po.getFpp().getClickResetButton());
	}
	
	@Then("^User check whether the primary header is displayed$")
	public boolean user_check_whether_the_primary_header_is_displayed() throws Throwable {
		elementIsDisplayed(po.getHp().getPrimaryHeaderDisplay());
		elementHighlight(po.getHp().getPrimaryHeaderDisplay());
		return false;
	}
	
	@Then("^User enter the product in the search box$")
	public void user_enter_the_product_in_the_search_box() throws Throwable {
		po.getPop().getSearchTheProduct().clear();
		clickBtn(po.getPop().getClickTheSearchButton());
		enterTextInTheWebelement(po.getPop().getSearchTheProduct(), "Women Joggers");
		clickBtn(po.getPop().getClickTheSearchButton());
	}

	@Then("^User select the product$")
	public void user_select_the_product() throws Throwable {
		clickBtn(po.getPop().getSearchTheProduct());
	}

	@Then("^User select the colour of the product$")
	public void user_select_the_colour_of_the_product() throws Throwable {
		clickBtn(po.getPop().getSelectTheColour());
	}

	@Then("^User select the size of the product$")
	public void user_select_the_size_of_the_product() throws Throwable {
		clickBtn(po.getPop().getSelectTheSize());
	}

	@Then("^User click the add to bag button$")
	public void user_click_the_add_to_bag_button() throws Throwable {
		clickBtn(po.getPop().getClickTheAddToBagButton());
	}

	@Then("^User click the check out button$")
	public void user_click_the_check_out_button() throws Throwable {
		clickBtn(po.getPop().getClickCheckOutButton());
	}

	@Then("^User select the country$")
	public void user_select_the_country() throws Throwable {
		dropDown(po.getPop().getSelectTheCountry(), "MEX", "value");
	}

	@Then("^User enter the first name$")
	public void user_enter_the_first_name() throws Throwable {
		enterTextInTheWebelement(po.getPop().getEnterTheFirstName(), "ANBUMANOJ");
	}

	@Then("^User enter the last name$")
	public void user_enter_the_last_name() throws Throwable {
		enterTextInTheWebelement(po.getPop().getEnterTheLastName(), "M S");
	}

	@Then("^User enter the shipping address$")
	public void user_enter_the_shipping_address() throws Throwable {
		enterTextInTheWebelement(po.getPop().getEnterTheAddress(), "567/110 St THOMAS ENCLAVE 18th FLOOR");
	}

	@Then("^User enter the city$")
	public void user_enter_the_city() throws Throwable {
		enterTextInTheWebelement(po.getPop().getEnterTheCity(), "CANCUN");
	}

	@Then("^User enter the country zip code$")
	public void user_enter_the_country_zip_code() throws Throwable {
		enterTextInTheWebelement(po.getPop().getEnterTheZipCode(), "77509");
	}

	@Then("^User enter the phone number$")
	public void user_enter_the_phone_number() throws Throwable {
		enterTextInTheWebelement(po.getPop().getEnterThePhoneNumber(), "9986582902");
	}

	@Then("^User enter the shipping address nick name$")
	public void user_enter_the_shipping_address_nick_name() throws Throwable {
		enterTextInTheWebelement(po.getPop().getEnterTheNickNameForAddress(), "THOMAS");
	}

	@Then("^User click the save address to my account button$")
	public void user_click_the_save_address_to_my_account_button() throws Throwable {
		clickBtn(po.getPop().getClickContinueToPaymentButton());
	}

	@Then("^User enter the card name$")
	public void user_enter_the_card_name() throws Throwable {
	}

	@Then("^User enter the card number$")
	public void user_enter_the_card_number() throws Throwable {
	}

	@Then("^User enter the security code of the card$")
	public void user_enter_the_security_code_of_the_card() throws Throwable {
	}

	@Then("^User enter the expiry month of the card$")
	public void user_enter_the_expiry_month_of_the_card() throws Throwable {
	}

	@Then("^User enter the expiry year of the card$")
	public void user_enter_the_expiry_year_of_the_card() throws Throwable {
	}

	@Then("^User enter the nick name for the card$")
	public void user_enter_the_nick_name_for_the_card() throws Throwable {
	}

	@Then("^User click the same as shipping address$")
	public void user_click_the_same_as_shipping_address() throws Throwable {
	}

	@Then("^User click the continue to review button$")
	public void user_click_the_continue_to_review_button() throws Throwable {
	}

}