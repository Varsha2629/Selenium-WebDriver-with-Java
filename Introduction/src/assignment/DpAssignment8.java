package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DpAssignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","V:\\Docfile\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); //URL in the browser
		
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Ind");
		Thread.sleep(2000);

		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value")); 

	}

}