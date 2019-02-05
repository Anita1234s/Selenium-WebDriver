package anitaseltest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousehoverTest1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
WebElement women=driver.findElementByLinkText("Women");
WebElement dj=driver.findElementByXPath(".//*[@id='desktop-header-cnt']/div[2]/nav/div/div[2]/div/div/div/ul[2]/li[2]/a");
		
		Actions mouse=new Actions(driver);
		
		mouse.moveToElement(women).moveToElement(dj).click().build().perform();
		
		
	}

}
