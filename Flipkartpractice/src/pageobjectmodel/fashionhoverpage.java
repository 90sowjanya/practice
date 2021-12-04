package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Scripts.scripttestng;
import basicutilities.LoginAndLogout;



public class fashionhoverpage {
	@FindBy(xpath="//a[@class=\"_6WOcW9 _2-k99T\"]")
	private WebElement womenethnic;
	@FindBy(xpath="//a[text()=\"All\"]")
	private WebElement womenethnicall;
	@FindBy(xpath="//a[text()='Women Sarees']")
	private WebElement womensaree;
	@FindBy(xpath="//a[text()='Women Kurtas & Kurtis']")
	private WebElement womenkurtaskurtis;
	@FindBy(xpath="//a[text()=\"Women Leggings & Patialas\"]")
	private WebElement womenleggins;
	@FindBy(xpath="//a[@class=\"_6WOcW9 _2-k99T\"]")
	private WebElement kids;
	
	@FindBy(xpath="//a[text()=\"Girls Dresses\"]")
	private WebElement girlsfashion;
	
	public fashionhoverpage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	public void womenethnic()
	{
		//Actions a=new Actions(scripttestng.driver);
		//a.moveToElement(womenethnic).perform();
		
	}
	public void womenall()
	{
		womenethnicall.click();
	}
	public void womensaree()
	{
		womensaree.click();
	}
	public void womenkurtas()
	{
		womenkurtaskurtis.click();
	}
	public void womenleggins()
	{
		womenleggins.click();
	}
	public void kids()
	{
		
		Actions a=new Actions(LoginAndLogout.driver);
		a.moveToElement(kids).perform();
	}
	public void girlsfashion()
	{
		girlsfashion.click();
	}
}
