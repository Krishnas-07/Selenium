package com.selenium.sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KPS\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");//// TODO Auto-generated method stub
		driver.manage().window().maximize();// TODO Auto-generated method stub // TODO Auto-generated method stub
		List<WebElement> firstColumnElement = driver
				.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[1]"));
		String locator=null;
		for (int i = 0; i < firstColumnElement.size(); i++) {
			if (firstColumnElement.get(i).getText().equals("Garrett Winters")) {
				locator="//table[@id='dtBasicExample']//tbody//tr["+(i+1)+"]//td[4]";
				break;
			}

		}
		WebElement ageCellValue=driver.findElement(By.xpath(locator));
		System.out.println(ageCellValue.getText());
	}

}
