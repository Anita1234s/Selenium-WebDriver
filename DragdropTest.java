package anitaseltest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragdropTest {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		
List <WebElement> frames= driver.findElementsByTagName("iframe");
System.out.println(frames.size());

driver.switchTo().frame(0);
		
		WebElement drg=driver.findElementById("draggable");
		WebElement drp=driver.findElementById("droppable");
		
		Actions drag=new Actions(driver);
		
		drag.dragAndDrop(drg, drp).build().perform();
		
	}

}
