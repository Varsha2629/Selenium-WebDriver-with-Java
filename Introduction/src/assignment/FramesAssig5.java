package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssig5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "V:\\Docfile\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//li[34]//a[1]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		
		driver.findElement(By.cssSelector("div.row:nth-child(2) div.large-12.columns:nth-child(2) ul:nth-child(4) li:nth-child(34) > a:nth-child(1)")).click();
		
		driver.switchTo().frame("content");
		
	    System.out.println(driver.findElement(By.name("frame-middle")).getText());
		
		//Printing the text in inner frame
		//driver.switchTo().defaultContent();
}
}