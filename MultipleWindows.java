package com.selenium.sample;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KPS\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");//// TODO Auto-generated method stub
		driver.manage().window().maximize();
		String parentWindow = driver.getWindowHandle();// id of parentWindow
		System.out.println(parentWindow);
		WebElement newTab = driver.findElement(By.id("tabButton"));
		newTab.click();
		Set<String> allWindow = driver.getWindowHandles();
		System.out.println(allWindow);
		for (String childWindow : allWindow) {
			if (!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
				WebElement text = driver.findElement(By.id("sampleHeading"));
				String sampleText = text.getText();
				System.out.println(sampleText);

			}
		}driver.switchTo().window(parentWindow);
		

		
	}

}
