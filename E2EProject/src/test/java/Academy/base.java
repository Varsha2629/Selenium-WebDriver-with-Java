package Academy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream fis=new FileInputStream("V:\\Selenium with Java\\Workspaces\\Selenium-WebDriver-with-Java\\E2EProject\\src\\test\\java\\Academy\\data.properties");
		
		prop.load(fis);		
		String browserName=prop.getProperty("browser");
		
		if(browserName=="chrome")
		{
			
			System.setProperty("webdriver.chrome.driver","V:\\Docfile\\chromedriver.exe");
			driver = new ChromeDriver();
			//write a code execute in chrome driver
		}
		else if (browserName=="firefox")
		{
			System.setProperty("webdriver.geko.driver","V:\\Docfile\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if (browserName=="IE")			
		{
			System.setProperty("webdriver.IE.driver","V:\\Docfile\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;	
		
	}

}
