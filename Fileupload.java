package com.selenium.sample;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fileupload {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KPS\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/upload/");//// TODO Auto-generated method stub
		driver.manage().window().maximize();// TODO Auto-generated method stub// TODO Auto-generated method stub
		Robot robot = new Robot();
		// robot.keyPress(KeyEvent.VK_CONTROL);
		// robot.keyRelease(KeyEvent.VK_CONTROL);
		WebElement chooseFile = driver.findElement(By.id("uploadfile_0"));
		Actions action = new Actions(driver);
		action.moveToElement(chooseFile).click().perform();
		// copy path to your system clipboard
		StringSelection ss = new StringSelection("C:\\Users\\KPS\\Downloads\\1680529187251_Assignment-4");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(250);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		WebElement submit = driver.findElement(By.id("submitbutton"));
		submit.click();
	}

}
