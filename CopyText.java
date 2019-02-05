package anitaseltest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyText {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElementByName("firstname").sendKeys("Anita");

		driver.findElementByName("firstname").sendKeys(Keys.CONTROL+"a");
		driver.findElementByName("firstname").sendKeys(Keys.CONTROL+"c");
		driver.findElementByName("lastname").sendKeys(Keys.CONTROL+"v");
		
		
		

	}

}
