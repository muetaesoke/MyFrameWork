package TestPom;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Generics.BaseTest;
import Generics.Excel;

import Pom.LoginPage;

@Listeners(Listner.EventListener.class)
public class TestValidLogin extends BaseTest 
{
	@Test
	public static void validLogin() throws EncryptedDocumentException, InvalidFormatException, InterruptedException
	{
		String un = Excel.getData(XLPATH,SHEET,1,0);
		String pwd = Excel.getData(XLPATH,SHEET,1,1);
		//String title= Excel.getData(XLPATH,SHEET,1,2);
		//Excel.storeValue(XLPATH, SHEET, 0, 3, "Status");

		LoginPage lp = new LoginPage(driver);
		Thread.sleep(2000);
	
		

		
		lp.inputUN(un);
		Thread.sleep(2000);
		
		
		
		lp.inputPWD(pwd);
		Thread.sleep(2000);
       
		
		
		lp.loginClick();
		Thread.sleep(3000);
		
		lp.profileclick();
		Thread.sleep(3000);
		
		lp.logoutclick();



//		Instagram ig = new Instagram(driver);
//		ig.verifyHomePageIsDisplayed(driver, 5, title);


	}

}
