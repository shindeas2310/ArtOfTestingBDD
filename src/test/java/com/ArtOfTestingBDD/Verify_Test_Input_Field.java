package com.ArtOfTestingBDD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_Test_Input_Field {

		WebDriver driver=Hook.driver;
		String Actual;
		
	@When("I enter {string} in the text input field")
	public void i_enter_in_the_text_input_field(String text) {
	    
		JavascriptExecutor ScrollDown = (JavascriptExecutor) driver;
		ScrollDown.executeScript("window.scrollBy(0,300)");
		
		
		
		WebElement input = driver.findElement(By.id("fname"));
		input.sendKeys(text);
		
		Actual = input.getAttribute("value");
		System.out.println(Actual);
		
	}

	@Then("The text input field should display {string}")
	public void the_text_input_field_should_display(String string) {
	   System.out.println("Expected: "+string + "Actual: "+Actual);
		Assert.assertEquals(Actual,string);
				
	}

	
}
