package anitaseltest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiobuttonTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
				
				ChromeDriver driver= new ChromeDriver();
				driver.get("https://www.facebook.com/");
				driver.manage().window().maximize();
				//WebElement radio= driver.findElementByName("sex");
				driver.findElement(By.id("u_0_a")).click();
				
				if(driver.findElement(By.id("u_0_a")).isSelected()==true)
				{
					System.out.println("Male button is selected");
				}

				else
				{
					System.out.println("Male button is not selected");
				
				}
				
		driver.findElement(By.id("u_0_9")).click();
				
				if(driver.findElement(By.id("u_0_a")).isSelected())
				{
					System.out.println("Male button is selected");
				}

				else
				{
					System.out.println("Male button is not selected");
				
				}
			}

	}


