package Generics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot 
{



	public static  void Screenshot(WebDriver driver,String name)throws IOException 
	{

		TakesScreenshot ts =  (TakesScreenshot) driver; 


		File ss = ts.getScreenshotAs(OutputType.FILE);         
		File ff = new File("./ScreenShots/"+name+".png");     //file object created 


		Files.copy(ss, ff);                                                                  


	}
}