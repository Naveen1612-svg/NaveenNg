package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class ToolsQApom {
	public static WebDriver driver;

	public ToolsQApom(WebDriver driver) {
		ToolsQApom.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//img[@class='product-one-thumb'])[6]")
	private WebElement productclick;
	@FindBy(id = "pa_color")
	private WebElement colour;
	@FindBy(id = "pa_size")
	private WebElement size;

	public WebElement getProductclick() {
		return productclick;
	}

	public WebElement getColour() {
		return colour;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getAddtokart() {
		return addtokart;
	}

	public WebElement getViwekart() {
		return viwekart;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAdress() {
		return adress;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getPin() {
		return pin;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getTerms() {
		return terms;
	}

	public WebElement getPlaceorder() {
		return placeorder;
	}

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement addtokart;
	@FindBy(xpath = "//a[contains(text(),'View cart')]")
	private WebElement viwekart;
	@FindBy(xpath = "//a[contains(text(),'checkout')]")
	private WebElement checkout;
	@FindBy(id = "billing_first_name")
	private WebElement fname;
	@FindBy(id = "billing_last_name")
	private WebElement lname;
	@FindBy(id = "billing_address_1")
	private WebElement adress;
	@FindBy(id = "billing_city")
	private WebElement city;
	@FindBy(id = "billing_postcode")
	private WebElement pin;
	@FindBy(id = "billing_phone")
	private WebElement phone;
	@FindBy(id = "billing_email")
	private WebElement email;
	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private WebElement terms;
	@FindAll({@FindBy(id="place_order"),@FindBy(name="woocommerce_checkout_place_order")})
	private WebElement placeorder;

}
