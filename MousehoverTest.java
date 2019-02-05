package anitaseltest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MousehoverTest {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		FirefoxDriver driver= new FirefoxDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		//WebElement sign=driver.findElementByClassName("nav-line-1");
		
		//Actions mouse=new Actions(driver);
		
		//mouse.moveToElement(sign).build().perform();

	}

}
