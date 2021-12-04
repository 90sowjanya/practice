package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Scripts.scripttestng;
import basicutilities.LoginAndLogout;

public class landingpage {
	@FindBy(xpath="//input[@title=\"Search for products, brands and more\"]")
	private WebElement searchbox;
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement searchbutton;
	@FindBy(xpath="//a[text()=\"Login\"]")
	private WebElement loginlink;
	@FindBy(xpath="//div[@class=\"exehdJ\"]")
	private WebElement more;
	@FindBy(xpath="(//div[@class=\"_28p97w\"])[2]")
	private WebElement morebutton;
	@FindBy(xpath="//span[text()=\"Cart\"]")
	private WebElement addcart;
	@FindBy(xpath="//img[@alt=\"Top Offers\"]")
	private WebElement topoffers;
	@FindBy(xpath="//img[@alt=\"Grocery\"]")
	private WebElement grocery;
	@FindBy(xpath="//img[@alt=\"Mobiles\"]")
	private WebElement mobiles;
	@FindBy(xpath="//img[@alt=\"Fashion\"]")
	private WebElement fashion;
	@FindBy(xpath="//img[@alt=\"Electronics\"]")
	private WebElement electronics;
	@FindBy(xpath="//img[@alt=\"Home\"]")
	private WebElement home;
	@FindBy (xpath="//img[@alt=\"Appliances\"]")
	private WebElement appliencess;
	@FindBy(xpath="//img[@alt=\"Travel\"]")
	private WebElement travel;
	@FindBy (xpath="//img[@alt=\"Beauty, Toys & More\"]")
	private WebElement beautytoymore;
	@FindBy(xpath="(//a[text()=\"VIEW ALL\"])[1]")
	private WebElement viewdealsday;
	@FindBy (xpath="(//a[text()=\"VIEW ALL\"])[2]")
	private WebElement viewdealonfashion;
	@FindBy (xpath="(//a[text()=\"VIEW ALL\"])[3]")
	private WebElement viewtopoffers;
	
	public landingpage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
		
	}
	


	public  void searchgbox(String name)
	{
		searchbox.sendKeys(name);
	}
	public void search()
	{
		searchbutton.click();
	}
	public void loginlink()
	{
		loginlink.click();
	}
	public void more()
	{
		more.click();
	}
	public void addcart()
	{
		addcart.click();
	}
	public void topoffers()
	{
		topoffers.click();
	}
	public void Grocery()
	{
		grocery.click();	
	}
	public void mobiles()
	{
		mobiles.click();
	}
	public void fashion()
	{
	Actions a=new Actions(LoginAndLogout.driver);
	a.moveToElement(fashion).perform();

	}
	public void electronics()
	{
		electronics.click();
	}
	public void home()
	{
		home.click();
	}

	
}


