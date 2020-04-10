package Generics;

import org.openqa.selenium.chrome.ChromeOptions;

public interface IAutoConstant 
{

	String CHROME_KEY = "webdriver.chrome.driver";
	String CHROME_VALUE = "./softwares/chromedriver.exe";
	String FIREFOX_KEY = "webdriver.gecko.driver";
	String FIREFOX_VALUE = "./softwares/geckodriver.exe";

	long ITO = 20;

	String URL="https://www.myntra.com/login";
	String XLPATH=".\\excel\\myntra.xlsx";
	String IMGPATH=".\\ScreenShots\\";
	String SHEET="Sheet1";
	String CONFIGPATH="./Config.properties";
	ChromeOptions co= new ChromeOptions();
}


