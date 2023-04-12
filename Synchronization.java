package com.selenium.sample;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KPS\\Downloads\\chromedriver_win32\\chromedriver.exe"); // TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.qabible.in/payrollapp/site/login");// --> login page

		driver.manage().window().maximize();// TODO Auto-generated method stub
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));// implicit
		// wait
		WebElement userName = driver.findElement(By.id("loginform-username"));
		userName.sendKeys("carol");
		WebElement password = driver.findElement(By.id("loginform-password"));
		password.sendKeys("1q2w3e4r");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();// login --> home page

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Clients")));// explicit wait
		// wait.until(ExpectedConditions.textToBe(By.xpath("fwerwer"), "Login"));
		// wait.until(ExpectedConditions.alertIsPresent());
		// wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator))

		WebElement client = driver.findElement(By.linkText("Clients"));// home page
		client.click();

		// fluent wait:
		Wait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30L))// MAX TIME
																											// OUT
				.pollingEvery(Duration.ofSeconds(10))// POLLING INTERVEL
				.ignoring(NoSuchElementException.class);

		WebElement foo = fluentwait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("foo"));
			}
		});

	}

}
