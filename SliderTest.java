package anitaseltest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderTest {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://jqueryui.com/slider/");
		driver.manage().window().maximize();
		
		
List <WebElement> frames= driver.findElementsByTagName("iframe");
System.out.println(frames.size());

driver.switchTo().frame(0);
WebElement drg=driver.findElement(By.xpath(".//*[@id='slider']"));

Actions slider=new Actions(driver);

slider.clickAndHold(drg).moveByOffset(300,0).release(drg).build().perform();
//Thread.sleep(5000);

	}

}
