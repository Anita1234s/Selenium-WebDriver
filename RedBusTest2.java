package anitaseltest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusTest2 {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			
			ChromeDriver driver= new ChromeDriver();
			driver.get("https://www.redbus.in/");
			driver.manage().window().maximize();
	Set <String> window=		driver.getWindowHandles();
	
	for (String windows: window)
	{
	System.out.println(window);
	}

	}

}
