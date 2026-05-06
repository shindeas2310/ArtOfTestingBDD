package com.ArtOfTestingBDD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_CheckBox {

	WebDriver driver = Hook.driver;
	  By AutomationTesting = By.xpath("//input[@value='Automation']");
	    By PerformanceTesting = By.xpath("//input[@value='Performance']");
	
	@When("I select the {string} and {string} checkboxes")
	public void i_select_the_and_checkboxes(String string, String string2) {
	    
		JavascriptExecutor ScrollDown = (JavascriptExecutor) driver;
		ScrollDown.executeScript("window.scrollBy(0,300)");
		
		 WebElement autoCheckBox = driver.findElement(AutomationTesting);

	        if (!autoCheckBox.isSelected()) {
	            autoCheckBox.click();
	        }

	        if (autoCheckBox.isSelected()) {
	            System.out.println("Automation Testing CheckBox is Selected");
	        } else {
	            System.out.println("Automation Testing CheckBox is NOT Selected");
	        }
	}

	@Then("Both checkboxes should be selected")
	public void both_checkboxes_should_be_selected() {
		 WebElement perfCheckBox = driver.findElement(PerformanceTesting);
		 if (!perfCheckBox.isSelected()) {
	            perfCheckBox.click();
	        }

	        if (perfCheckBox.isSelected()) {
	            System.out.println("Performance Testing CheckBox is Selected");
	        } else {
	            System.out.println("Performance Testing CheckBox is NOT Selected");
	        }
	    }
	}



	

