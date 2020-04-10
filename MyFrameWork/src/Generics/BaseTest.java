package Generics;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;






public class BaseTest implements  IAutoConstant
{   
	public static Properties con;
	public static FileInputStream fis;
	public static WebDriver driver;
	static String browser_name="chrome";
	static
	{	


		try
		{
			fis = new FileInputStream(CONFIGPATH);
			Properties p= new Properties();
			p.load(fis);
			browser_name=p.getProperty("browser");
			if(browser_name.contains("chrome"))
			{
				System.setProperty(CHROME_KEY, CHROME_VALUE);
			}
			else
			{
				System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}

	@BeforeMethod()
	public static void beforeM() 
	{
		if(browser_name.contains("chrome"))
		{
			co.addArguments("--disable-notifications");
			driver = new ChromeDriver(co);
		}
		else
		{
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		driver.get(URL);
	}

	@AfterMethod
	public static void afterM() throws InterruptedException
	{
		Thread.sleep(5000);
		//driver.close();
	}

}


