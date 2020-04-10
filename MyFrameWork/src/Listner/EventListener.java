package Listner;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class EventListener implements ITestListener{
	//private static final String Outputype = null;
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		String date=new Date().toString().replaceAll(" ", "_").replaceAll(":", "_");
		String methodName=result.getMethod().getMethodName();
		EventFiringWebDriver ef=new EventFiringWebDriver(Generics.BaseTest.driver);
		File src = ef.getScreenshotAs(OutputType.FILE);
	    File dest = new File("./Screenshots\\"+methodName+"_"+date+".png");
		try {
		
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
