package anitaseltest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ResizeTest {

	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		
		
List <WebElement> frames= driver.findElementsByTagName("iframe");
System.out.println(frames.size());

driver.switchTo().frame(0);
WebElement drg=driver.findElement(By.xpath(".//*[@id='resizable']"));

Actions res=new Actions(driver);

res.clickAndHold(drg).moveByOffset(300, 300).release(drg).build().perform();
//Thread.sleep(5000);

//res.clickAndHold(drg).moveByOffset(-300, -300).release(drg).build().perform();




	}

}
