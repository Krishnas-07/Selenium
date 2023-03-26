package com.selenium.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPS\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");// TODO Auto-generated method stub
         WebElement message=driver.findElement(By.id("single-input-field"));
         message.sendKeys("KrishnaPriya");

WebElement showMessage=driver.findElement(By.cssSelector("button#button-one"));
showMessage.click();
String text=showMessage.getText();
System.out.println(text);//to get text on the showMessage button
String colour=showMessage.getCssValue("background-color");
System.out.println(colour);// to get background colour of button
String font=showMessage.getCssValue("color");
System.out.println(font);// to get font colour of button
String id=showMessage.getAttribute("id");
System.out.println("Attribute value of id is "+id);
String u=showMessage.getAttribute("class");
System.out.println("Attribute value of class is "+u);
WebElement valueA=driver.findElement(By.id("value-a"));
valueA.sendKeys("10");// to enter text or values
WebElement valueB=driver.findElement(By.id("value-b"));
valueB.sendKeys("65");
WebElement getTotal=driver.findElement(By.cssSelector("button#button-two"));
getTotal.click();// to click button
String show=getTotal.getText();
System.out.println(show);// to get text on button


	}

}
