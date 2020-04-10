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


public class WishListNetBanking extends BaseTest 
{
	@Test
	public static void validLogin() throws EncryptedDocumentException, InvalidFormatException, InterruptedException
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
		Thread.sleep(3000);

		lp.mencategory();
		Thread.sleep(3000);


		lp.tshirtcategory();
		Thread.sleep(3000);

		lp.productcategory();
		Thread.sleep(3000);

		String parent = driver.getWindowHandle();
		Set<String> subtab = driver.getWindowHandles();
		for(String name:subtab)
		{
			driver.switchTo().window(name);
		}


		lp.selectsize();
		Thread.sleep(3000);

		lp.addwishlist();
		Thread.sleep(3000);

		lp.wishlist();
		Thread.sleep(2000);
		
		lp.bagmoving();
		Thread.sleep(2000);
		
		lp.bagicon();
		Thread.sleep(3000);

		lp.order();
		Thread.sleep(3000);

		lp.contin();
		Thread.sleep(3000);

		lp.netbanking();


	}

}
