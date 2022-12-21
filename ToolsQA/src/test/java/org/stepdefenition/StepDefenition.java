package org.stepdefenition;

import org.base.Baseclass;
import org.openqa.selenium.WebDriver;
import org.pom.ToolsQApom;

import io.cucumber.java.en.*;

public class StepDefenition extends Baseclass {

	ToolsQApom t = new ToolsQApom(driver);

	@Given("launch url and user should click the poduct")

	public void launch_url_and_user_should_click_the_poduct() throws InterruptedException {
		urlLaunch("https://shop.demoqa.com/shop/");
		dynamicWait(10);
		Thread.sleep(5000);

		t.getProductclick().click();

	}

	@When("user should select size and colour")
	public void user_should_select_size_and_colour() throws InterruptedException {

		Thread.sleep(5000);
		selectTagVisibleText(t.getColour(), "Black");
		selectTagVisibleText(t.getSize(), "32");
		Thread.sleep(2000);
		t.getAddtokart().click();

	}

	@When("user should click add to cart icon")
	public void user_should_click_add_to_cart_icon() {
		t.getViwekart().click();

	}

	@When("The user should click the proceed to check out")
	public void the_user_should_click_the_proceed_to_check_out() {
		t.getCheckout().click();

	}

	@Given("The user should fill personal details")
	public void the_user_should_fill_personal_details() {
		t.getFname().sendKeys("naveen");
		t.getLname().sendKeys("kumar");
		t.getAdress().sendKeys("mannivakam");
		t.getCity().sendKeys("chennai");
		t.getPin().sendKeys("600048");
		t.getPhone().sendKeys("9874563211");
		t.getEmail().sendKeys("dfghjkfgh@gmail.com");

	}

	@Given("user should agree terms and condition")
	public void user_should_agree_terms_and_condition() throws InterruptedException {

		Thread.sleep(10000);
		javaScriptClick(t.getTerms());
//		javaScriptScroll(t.getTerms());
//		Thread.sleep(6000);
//		t.getTerms().click();
//		
	

	}

	@Then("the user should Place order")
	public void the_user_should_place_order() throws InterruptedException {
		Thread.sleep(2000);
		javaScriptClick(t.getPlaceorder());
		//t.getPlaceorder().click();

	}

}
