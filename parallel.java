package org.run;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallel {
	@Parameters({"browser"})
	@Test
	private void tc1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\Facebook\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("dhinesh");
		driver.findElement(By.id("pass")).sendKeys("dhinesh");
		driver.close();
	
	}
	@Parameters({"browser1"})
	@Test
	private void tc2() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\USER\\eclipse-workspace\\Facebook\\driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("dhinesh");
		driver.findElement(By.id("pass")).sendKeys("dhinesh");
		driver.close();
	
	}

}
