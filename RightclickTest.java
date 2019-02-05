package anitaseltest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightclickTest {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in//");
		driver.manage().window().maximize();
		
		
	WebElement gmail=	driver.findElementByLinkText("Gmail");
	
	Actions right = new Actions(driver);
	right.contextClick(gmail).build().perform();
		

	}

}
