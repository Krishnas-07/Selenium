package com.selenium.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableAssignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KPS\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");//// TODO Auto-generated method stub
		driver.manage().window().maximize();// TODO Auto-generated method stub
	
	
List<WebElement>fetchAllDetails=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
String locator=null;
for(int i=0;i<fetchAllDetails.size();i++) {
	if(fetchAllDetails.get(i).getText().equals("Cedric Kelly")) {
	locator ="//table[@id='dtBasicExample']//tbody//tr["+(i+1)+"]//td";
	break;
	
	}
}List<WebElement> allDetails=driver.findElements(By.xpath(locator));
for(int i=0;i<allDetails.size();i++) {
	String rowDetails=allDetails.get(i).getText();
	System.out.println(rowDetails);
}
List<WebElement>officedetails=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
for (int i = 0; i < officedetails.size(); i++) {
	if (officedetails.get(i).getText().equals("Herrod Chandler")) {
		locator="//table[@id='dtBasicExample']//tbody//tr["+(i+1)+"]//td[3]";
		break;
	}

	}
WebElement officeAt=driver.findElement(By.xpath(locator));
System.out.println("Office of Herrod Chandler is at "+officeAt.getText());

}}
