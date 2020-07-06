package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelleanous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","V:\\Docfile\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com"); //URL in the browser
		
 		driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();// delete all cookies
		//driver.manage().deleteCookieNamed("name of cookie"); // delete one cookies
		// click on any link // add cookies this is for your interview 
	
			//login page- verify login url
		
		
	}

}
