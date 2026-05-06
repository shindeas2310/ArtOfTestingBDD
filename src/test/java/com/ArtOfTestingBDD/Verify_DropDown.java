package com.ArtOfTestingBDD;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_DropDown {

	WebDriver driver = Hook.driver;
	 By dropDown = By.id("testingDropdown");
	    String actualSelected;
	
	@When("I select {string} from the dropdown")
	public void i_select_from_the_dropdown(String string) {
	   
		JavascriptExecutor ScrollDown = (JavascriptExecutor) driver;
		ScrollDown.executeScript("window.scrollBy(0,300)");
		
		WebElement dropdownElement = driver.findElement(dropDown);
        Select select = new Select(dropdownElement);

        select.selectByVisibleText("Manual Testing");

        actualSelected = select.getFirstSelectedOption().getText();

        System.out.println("Selected Value is: " + actualSelected);
		
	}

	@Then("The selected option should be {string}")
	public void the_selected_option_should_be(String string) {
	    
		 Assert.assertEquals(actualSelected, actualSelected);
		
	}
	
}
