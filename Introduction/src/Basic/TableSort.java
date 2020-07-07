package Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
public class TableSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","V:\\Docfile\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers"); //URL in the browser
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		
		List<WebElement> firstColList = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
		
		ArrayList<String> originalList = new ArrayList<String>();
		for (int i=0;i<firstColList.size();i++)
		{
			originalList.add(firstColList.get(i).getText());
		}
    	ArrayList<String> copiedList = new ArrayList<String>();
    	for(int i=0;i<firstColList.size();i++)
    	{
    		copiedList.add(originalList.get(i)); 	
    	}
    	System.out.println("*************************");
    	Collections.sort(copiedList);
    	for(String s:copiedList)
    	{
    		System.out.println(s);
    	}
    	System.out.println("************original List*************");
    	Collections.sort(originalList);
    	for(String s:originalList)
    	{
    		System.out.println(s);
    	}
    		Assert.assertTrue(originalList.equals(copiedList));
    	
	}	

}
