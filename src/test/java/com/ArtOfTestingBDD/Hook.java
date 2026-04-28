package com.ArtOfTestingBDD;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

	public static WebDriver driver;
	
	@Before
		public void setup() {
			
			driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        driver.get("https://artoftesting.com/samplesiteforselenium");
					}
	
	
		@After
		public void tearDown() {
			driver.quit();
		}
	}
	

