package anitaseltest;

import java.util.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		System.out.println("Hello World");
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		System.out.println("Total no of links availabl are:"+links.size());
		
		for(int i=0; i<links.size(); i++)
		{
			System.out.println(links.get(i).getText());
		}
		
		
driver.close();
	}

}
