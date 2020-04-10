package TestPom;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Generics.BaseTest;
import Generics.Excel;

import Pom.LoginPage;


public class SortBy extends BaseTest 
{
	@Test
	public static void sortby() throws EncryptedDocumentException, InvalidFormatException, InterruptedException
	{
		String un = Excel.getData(XLPATH,SHEET,1,0);
		String pwd = Excel.getData(XLPATH,SHEET,1,1);
		//String title= Excel.getData(XLPATH,SHEET,1,2);
		//Excel.storeValue(XLPATH, SHEET, 0, 3, "Status");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		LoginPage lp = new LoginPage(driver);
		Thread.sleep(2000);
		lp.inputUN(un);
		Thread.sleep(2000);

		lp.inputPWD(pwd);
		Thread.sleep(2000);

		lp.loginClick();
		//Thread.sleep(1000);

		lp.mencategory();
		//Thread.sleep(1000);


		lp.tshirtcategory();
		
		Thread.sleep(3000);
		
		lp.recomm();
		Thread.sleep(1000);
		
		lp.popular();
		lp.productcategory();
		String parent = driver.getWindowHandle();
		Set<String> subtab = driver.getWindowHandles();
		for(String name:subtab)
		{
			driver.switchTo().window(name);
		}
		lp.selectsize();
		lp.addtobag();
		lp.bagicon();
		lp.order();
		
		
		lp.contin();
		lp.netbanking();
	
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
		 * 
		 * lp.categories(); Thread.sleep(3000);
		 * 
		 * lp.brands(); Thread.sleep(3000);
		 * 
		 * lp.colors(); Thread.sleep(3000);
		 */
		
        
		
		
		
		
		
		

	}

}
