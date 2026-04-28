package com.ArtOfTestingBDD;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verify_Title_Page_Steps {

	WebDriver driver=Hook.driver;
	String Actual_Title;
	
	
//	@Given("I open the sample site")
//	public void i_open_the_sample_site() {
//		
//		driver=Hook.driver;
//		driver.get("https://artoftesting.com/samplesiteforselenium");
//	   
//	}

	@When("I fetch the title of the page")
	public void i_fetch_the_title_of_the_page() {
		
		Actual_Title = driver.getTitle();
	    System.out.println(Actual_Title);
	}

	@Then("The title should be {string}")
	public void the_title_should_be(String string) {
	    
		Assert.assertEquals(string,Actual_Title);
		
		driver.quit();
		
	}

	
}
