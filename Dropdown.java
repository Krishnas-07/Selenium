package com.selenium.sample;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPS\\Downloads\\chromedriver_win32\\chromedriver.exe");	// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		WebElement color=driver.findElement(By.id("single-input-field"));
        Select obj=new Select(color);
       // obj.selectByIndex(2);
        //obj.selectByVisibleText("Yellow");
        obj.selectByValue("Green");
       WebElement selectedValueElementt=obj.getFirstSelectedOption();
     String text= selectedValueElementt.getText();
       System.out.println(text);
        WebElement selectColor=driver.findElement(By.id("multi-select-field"));
        Select dropdown=new Select(selectColor);
       dropdown.selectByValue("Red");
        dropdown.selectByIndex(1);
       List<WebElement>list1=dropdown.getAllSelectedOptions();
     for(int i=0;i<list1.size();i++) {
    	String a= list1.get(i).getText();
    	System.out.println(a);
     }
    	 
     }
        
       
        
        
        
	}


