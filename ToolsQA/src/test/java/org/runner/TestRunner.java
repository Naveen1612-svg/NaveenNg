package org.runner;

import org.base.Baseclass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Naveen\\eclipse-workspace\\ToolsQA\\src\\test\\java\\Features",
dryRun=false,
plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
"html:taget/cucumber.html",
"json:target/cucumber.json"})


public class TestRunner {

	public static WebDriver driver;

	@BeforeClass
	public static void browser() {
		driver = Baseclass.launchBrowser("chrome");

	}
}