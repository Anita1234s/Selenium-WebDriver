package anitaseltest;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsTest {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();

		
		String curr =driver.getWindowHandle();
		
		System.out.println(curr);
		driver.findElement(By.id("loginsubmit")).click();
        //String curr1 =driver.getWindowHandle();
		
		Set <String> windows= new HashSet(driver.getWindowHandles());
		System.out.println(windows.size());
		
		
		for(String win: windows)
		{
			System.out.println(win);
		}
		
		//System.out.println(curr1);
		
//////////////to do(iterator in hash set practice with syntax and how to switch focus to another
		//window)		
		System.out.println(driver.getTitle());
		if(!driver.getTitle().contains("NetBanking"))
		{
			driver.close();
		}
		
		//System.out.println(driver.getTitle());
		driver.switchTo().window("15434F49B5F15638D4BF13C2BE60FF50");
	}
	
	
	
	

}
