package assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "V:\\Docfile\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element = driver.findElement(By.xpath("//li[33]//a[1]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		driver.findElement(By.xpath("//li[33]//a[1]")).click();
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//div[@class='example']//h3"));
		Set<String>ids=driver.getWindowHandles();//It returns number of windows opened by WebDriver and will return Set of Strings
		
		Iterator<String> it=ids.iterator();//Using Iterator to iterate(manytimes come like for loop) with in windows
		String parentid= it.next();
		String childid= it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.findElement(By.xpath("//body/div[@class='example']")).getText());

		driver.switchTo().window(parentid);//back to parent page contact
       System.out.println(driver.findElement(By.cssSelector("body:nth-child(2) div.example > h3:nth-child(1)")).getText());
       

	}

}
