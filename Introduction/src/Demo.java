import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code-
		
		//create Driver object for chrome Browser
		
		//we will strictly implement methods of webdriver
		
		/* Class name ChromeDriver,
		 
		  X driver=new X(); */
		//invoke.exe file first
			
		System.setProperty("webdriver.chrome.driver","V:\\Docfile\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.udemy.com");
		
		System.out.println(driver.getTitle()); //validate if your page title is correct
		
		System.out.println(driver.getCurrentUrl()); //validate if you are landed on correct url		

	driver.close();
	}
	

}
