package com.ArtOfTestingBDD;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_Alert_Handling_Popup {

	WebDriver driver = Hook.driver;
	
	@When("I click the button to trigger an alert")
	public void i_click_the_button_to_trigger_an_alert() throws InterruptedException {
	    
	    WebElement btn = driver.findElement(By.cssSelector("#AlertBox button"));

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(btn));

	    btn.click();

	    System.out.println("Alert triggered");
	}

	@When("I accept the alert")
	public void i_accept_the_alert() throws InterruptedException {
		

	   driver.switchTo().alert().getText();
	   driver.switchTo().alert().accept();

	    System.out.println("Alert accepted");

	}

	@Then("The alert should be handled successfully")
	public void the_alert_should_be_handled_successfully() {
	    System.out.println("Alert handled successfully");
		
	}
	
	
}
