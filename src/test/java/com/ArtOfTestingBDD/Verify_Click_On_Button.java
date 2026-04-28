package com.ArtOfTestingBDD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_Click_On_Button {
	WebDriver driver = Hook.driver;
	
	@When("I click the button")
	public void i_click_the_button() {
	    
		JavascriptExecutor ScrollDown = (JavascriptExecutor) driver;
		ScrollDown.executeScript("window.scrollBy(0,300");
		
		driver.findElement(By.id("idOfButton")).click();

		
		
	}

	@Then("The button should respond as expected")
	public void the_button_should_respond_as_expected() {
	    
		System.out.println("Able to click on button");
		
	}
	
}
