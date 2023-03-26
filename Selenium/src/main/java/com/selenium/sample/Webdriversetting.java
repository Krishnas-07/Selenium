package com.selenium.sample;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver; 

public class Webdriversetting {

public static void  main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KPS\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//System.setProperty("webdriver.edge.driver","C:\\Users\\KPS\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
	//WebDriver driver=new EdgeDriver();
		//driver.get("https://mail.google.com/");// to get  a page
		driver.navigate().to("https://mail.google.com/");// helps to navigate to a page
		driver.manage().window().maximize();
		String u=driver.getTitle();
		System.out.println(u);
		String v=driver.getCurrentUrl();// to get URL
		System.out.println(v);
		//String x=driver.getPageSource();
		//System.out.println(x);
		
		driver.navigate().back();// helps to return back
		driver.navigate().forward();
		driver.navigate().refresh();
		
		//driver.close();//main or focused window will close
		//driver.quit();//all windows will be closed
		
	
		
		
			// TODO Auto-generated method stub

	}

}
