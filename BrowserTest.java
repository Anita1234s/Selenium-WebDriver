package anitaseltest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//driver.findElementById("email").sendKeys("anita.sharma");
		//driver.close();
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		//driver.findElement(By.)
		//driver.close();

	}

}
