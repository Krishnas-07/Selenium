package com.selenium.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtmlTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPS\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");//// TODO Auto-generated method stub
		driver.manage().window().maximize();// TODO Auto-generated method stub
		List<WebElement>heading=driver.findElements(By.xpath("//table[@id='dtBasicExample']//thead//tr[1]//th"));
		for(int i=0;i<heading.size();i++) {
			String header=heading.get(i).getText();
			System.out.println("Heading of Table contains "+header );
			
		}
List<WebElement>row1=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]//td"));
for(int i=0;i<row1.size();i++) {
	String firstLine=row1.get(i).getText();
	System.out.println("First row of table is "+firstLine);
	
}List<WebElement>row2=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr[2]//td"));
for(int i=0;i<row2.size();i++) {
	String secondLine=row2.get(i).getText();
	System.out.println("Second row contains " +secondLine);
}

	}

}
