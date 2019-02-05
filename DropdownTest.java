package anitaseltest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTest {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement bday_day= driver.findElement(By.name("birthday_day"));
		List<WebElement> bdaylist= bday_day.findElements(By.tagName("option"));
		System.out.println(bdaylist.size());
		for(int i=0;i<bdaylist.size();i++)
		{
			System.out.println(bdaylist.get(i).getText());
			
			
		}
		System.out.println("//////////////////////'");
		Select sl= new Select(driver.findElement(By.name("birthday_day")));
		sl.selectByVisibleText("9");
		System.out.println(sl.getFirstSelectedOption().getText());
		/////////pending:by value.need to chk for drpdown properties locators.
	}

}
