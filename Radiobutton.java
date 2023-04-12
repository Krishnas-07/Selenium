package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radiobutton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPS\\Downloads\\chromedriver_win32\\chromedriver.exe");	// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
        driver.manage().window().maximize();
        WebElement page=driver.findElement(By.linkText("Radio Buttons Demo"));
        page.click();// to go to page radio button demo
        WebElement radioButton=driver.findElement(By.xpath("//label[@for='inlineRadio1']"));
        radioButton.click();//to select male
        WebElement selectedValue=driver.findElement(By.id("button-one"));
        selectedValue.click();// to click show selected value button
       boolean display= selectedValue.isDisplayed();// for verifying element is in the application
       boolean enable=selectedValue.isEnabled();//to check the button is enabled or not
       System.out.println(enable);// to check the button is enabled or not
       System.out.println(display);
        boolean gender=radioButton.isSelected();// to check selection
        System.out.println("Is the Male button is selected " +gender);
       
        
        boolean show=selectedValue.isSelected();// to check selection
       System.out.println("Is the selected value button is selected " +show);
        
        WebElement showSelection=driver.findElement(By.id("button-one"));
        String selection=showSelection.getTagName();// to get tag name of show selection button
        System.out.println("Tag name of show selected value is "+selection);
      
        WebElement maleRadio=driver.findElement(By.className("form-check-label"));
        String selection2=maleRadio.getTagName();// to get tag name of male button
        System.out.println("Tag name of Male radio button  is "+selection2);
        
        
       // driver.close();
	}

}
