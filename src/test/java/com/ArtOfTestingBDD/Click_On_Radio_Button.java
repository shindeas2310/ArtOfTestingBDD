package com.ArtOfTestingBDD;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Click_On_Radio_Button {

		WebDriver driver = Hook.driver;
		By MaleRadioButton = By.id("male");
		
	
	@When("I select the Male radio button")
	public void i_select_the_male_radio_button() {
	    
		JavascriptExecutor ScrollDown = (JavascriptExecutor) driver;
		ScrollDown.executeScript("window.scrollBy(0,300)");
		
		
		WebElement ClickOnMaleRadioButton = driver.findElement(MaleRadioButton);
		ClickOnMaleRadioButton.click();
		
	}

	@Then("The Male radio button should be selected")
	public void the_male_radio_button_should_be_selected() {
	    
		WebElement Male_Radio_Button = driver.findElement(MaleRadioButton);
		boolean isSelected = Male_Radio_Button.isSelected();
		//Assert.assertEquals(isSelected, "MaleRadio Button Is Not Selected");
		Assert.assertEquals("MaleRadio Button Is Not Selected", true, isSelected);
		
	}
	
}
