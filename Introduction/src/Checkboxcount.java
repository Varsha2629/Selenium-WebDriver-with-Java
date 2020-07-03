
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxcount {

	public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","V:\\Docfile\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); //URL in the browser
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		driver.findElement(By.xpath("//input[@value='option2']")).click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int checkedCount=0;
		int UncheckedCount=0;
		for(int i=0;i<elements.size();i++)
		{
		if(elements.get(i).isSelected()==true)			
			checkedCount++;
		else 
			UncheckedCount++;
		}
		System.out.print("Number of Checked Checkboxes are"+checkedCount);
		System.out.print("Number of UnChecked Checkboxes are"+UncheckedCount);
		driver.quit();
	}
}
