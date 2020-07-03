package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtableAssgin7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "V:\\Docfile\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//number of Rows print
		WebElement GetRows = driver.findElement(By.xpath("//table[@id='product']/tbody"));
		List<WebElement>TotalRows = GetRows.findElements(By.tagName("tr"));
		System.out.println("Total number of Rows in the table are : "+ TotalRows.size());
		
		// number of Columns Print
		WebElement GetColumns = driver.findElement(By.xpath("//table[@id='product']/tbody/tr"));
		List<WebElement> TotalCols = GetColumns.findElements(By.tagName("th"));
		System.out.println("Total Number of Columns in the table are: "+TotalCols.size());
		
		// Print Second Rows of Content
		WebElement Row = driver.findElement(By.id("product"));


		List<WebElement> secondrow = driver.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));


		System.out.println(secondrow.get(0).getText());
		System.out.println(secondrow.get(1).getText());
		System.out.println(secondrow.get(2).getText());
		
	}
}
