package anitaseltest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusTest {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("HOTELS")).click();;
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().back();
	
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		

	}

}
