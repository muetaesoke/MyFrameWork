package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.BaseTest;

public class LoginPage extends BaseTest
{

	@FindBy(xpath="//input[@name=\"email\"]")

	private WebElement un;



	@FindBy(xpath="//input[@type=\"password\"]")
	private WebElement pwd;	
	@FindBy(xpath="//button[@class=\"login-login-button\"]")
	private WebElement login;

	@FindBy(xpath="//input[@id=\"signInSubmit\"]")
	private WebElement loginBtn;

	@FindBy (xpath="//span[text()='Profile']")
	private WebElement profile;



	@FindBy (xpath="//a[@data-group=\"men\"]")
	private WebElement men;
	@FindBy (xpath="//main[@class=\"shop-base\"]//following::a[text()='Clothing']/parent::li/parent::ul/parent::div/parent::div/parent::div//a[text()='T-Shirts']")
	private WebElement tshirt;

	@FindBy (xpath="//img[@alt=\"DILLINGER Men Navy Blue Colourblocked Round Neck T-shirt\"]")
	private WebElement product;

	@FindBy (xpath="//div[text()='ADD TO BAG']")
	private WebElement addtobag;

	@FindBy(xpath="//p[text()='L']")
	private WebElement size;

	@FindBy (xpath="//span[text()='Bag']")
	private WebElement bag;

	@FindBy (xpath="//div[text()='Place Order']")
	private WebElement placeorder;

	@FindBy (xpath="//div[text()='continue']")
	private WebElement cont;

	@FindBy (xpath="//span[text()='CREDIT/DEBIT CARD']")
	private WebElement credit;

	@FindBy (xpath="//span[text()='WISHLIST']")
	private WebElement wishlist;

	@FindBy (xpath="//span[text()='Wishlist']")
	private WebElement wishlisticon;


	@FindBy (xpath="//a[text()='MOVE TO BAG']")
	private WebElement movetobag;

	@FindBy (xpath="//span[text()='NET BANKING']")
	private WebElement net;

	@FindBy (xpath="//span[text()='CASH/CARD ON DELIVERY']")
	private WebElement cash;

	@FindBy (xpath="//span[text()='PHONEPE/GOOGLE PAY/BHIM UPI']")
	private WebElement phonepe;

	@FindBy (xpath="//span[text()='PAYPAL/PAYTM/WALLETS']")
	private WebElement paypalwallet;

	@FindBy (xpath="//span[text()='GIFT CARD']")
	private WebElement gift;

	@FindBy (xpath="//div[@data-track=\"logout\"]")
	private WebElement logout;

	@FindBy (xpath="//span[text()='Categories']/parent::div//label[@class=\"common-customCheckbox vertical-filters-label\"]/input[@value=\"Tshirts\"]")
	private WebElement category;

    @FindBy (xpath="(//span[text()='Brand']/following::div[@class=\"common-checkboxIndicator\"])[1]")
    private WebElement brand;

    @FindBy (xpath="//span[text()='Color']/parent::div//label[@class=\"common-customCheckbox\"]/span[@data-colorhex=\"black\"]")
    private WebElement color;
    
    @FindBy (xpath="//img[@title=\"Roadster Men Brown Printed Round Neck T-shirt\"]")
    private WebElement roadsterproduct;
    @FindBy (xpath="//span[@class=\"myntraweb-sprite sort-downArrow sprites-downArrow\"]")
    private WebElement recommended;
    @FindBy (xpath="(//label[@class=\"sort-label \"]/parent::li/parent::ul//label)[2]")
    private WebElement popularity;
    


	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void inputUN(String text)
	{
		un.sendKeys(text);	
	}

	public void inputPWD(String text)
	{
		pwd.sendKeys(text);	
	}
	public void loginClick()
	{
		login.click();
	}

	public void profileclick()
	{
		profile.click();
	}

	public void mencategory()
	{
		men.click();
	}

	public void tshirtcategory()
	{
		tshirt.click();

	}
	public void productcategory()
	{
		product.click();
	}


	public void addtobag()
	{
		addtobag.click();
	}


	public void selectsize()
	{
		size.click();
	}
	public void bagicon()
	{
		bag.click();
	}
	public void order()
	{
		placeorder.click();
	}
	public void contin()
	{
		cont.click();
	}

	public void card()
	{
		credit.click();
	}

	public void addwishlist()
	{
		wishlist.click();
	}

	public void wishlist()
	{
		wishlisticon.click();
	}
	public void bagmoving()
	{
		movetobag.click();
	}

	public void netbanking()
	{
		net.click();
	}
	public void cashondelivery()
	{
		cash.click();
	}
	public void phonepay()
	{
		phonepe.click();
	}
	public void paypal()
	{
		paypalwallet.click();
	}
	public void giftcard()
	{
		gift.click();
	}
	public void logoutclick()
	{
		logout.click();
	}
	public void categories()
	{
		category.click();
	}
	
	public void brands()
	{
		brand.click();
	}
	public void colors()
	{
		color.click();
	}
	public void roadsterprod()
	{
		roadsterproduct.click();
	}
	
   public void recomm()
   {
	   Actions a = new Actions(driver);
	   a.moveToElement(recommended).build().perform();
	   
   }
   public void popular() 
   {
	popularity.click(); 
   }


}
