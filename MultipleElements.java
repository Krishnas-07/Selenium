package com.selenium.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPS\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");//// TODO Auto-generated method stub
		driver.manage().window().maximize();	// TODO Auto-generated method stub
List<WebElement>list=driver.findElements(By.xpath("//select[@id='single-input-field']//option"));
for(int i=0;i<list.size();i++) {
	String multipleElements=list.get(i).getText();
	System.out.println(multipleElements);
}
	}

}
