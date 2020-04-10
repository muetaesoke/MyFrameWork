package Pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;

import Generics.Excel;
import Generics.IAutoConstant;
import Generics.ScreenShot;

public class Instagram implements IAutoConstant {
	public Instagram(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verifyHomePageIsDisplayed(WebDriver driver, long ETO, String title)
			throws EncryptedDocumentException, InvalidFormatException {
		try
		{
			WebDriverWait ww = new WebDriverWait(driver, ETO);
			ww.until(ExpectedConditions.titleContains(title));
			Reporter.log("HomePage is Displayed", true);
			//Excel.setStatus(XLPATH, SHEET, 2, 3, "Pass");
		}

		catch (Exception e)
		{
			Reporter.log("Home Page is not displayed", true);
			try 
			{
				ScreenShot.Screenshot(driver, title);

			} catch (IOException e1) {
				e1.printStackTrace();
			}
			Assert.fail();
		}
	}
}
