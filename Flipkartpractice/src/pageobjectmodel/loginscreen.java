package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginscreen {

	//declaration
	@FindBy(xpath="//input[@class=\"_2IX_2- VJZDxU\"]")
	private WebElement username;
	@FindBy(xpath="//input[@type=\"password\"]")
	private WebElement pwd;
	@FindBy(xpath="//span[text()=\"Forgot?\"]")
	private WebElement forgot;
	@FindBy (xpath="(//span[text()=\"Login\"])[2]")
	private WebElement login;
	@FindBy (xpath="//button[text()=\"Request OTP\"]")
	private WebElement  reqstotp;
	@FindBy(xpath="//a[@class=\"_14Me7y\"]")
	private WebElement Crateac;
	@FindBy(xpath="//button[@class=\\\"_2KpZ6l _2doB4z\\\"]")
	private WebElement close;
	
	//intilization
	public loginscreen(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void usrname(String name)
	{
		username.sendKeys(name);
	}
	public void password(String password)
	{
		pwd.sendKeys(password);
		
	}
	
	public void forgot()
	{
		forgot.click();
	}
	public void loginbutton()
	{
		login.click();
	}
	public void rqtotp()
	{
		reqstotp.click();
	}
	public void craeteaccount()
	{
		Crateac.click();
	}
	public void close()
	{
		close.click();
	}
}
