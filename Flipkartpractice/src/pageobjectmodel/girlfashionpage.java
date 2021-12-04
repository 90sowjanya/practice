package pageobjectmodel;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class girlfashionpage {
	@FindBy(xpath="(//a[@title=\"Girls Maxi/Full Length Festive/Wedding Dress\"])[2]")
	private WebElement img1;
	@FindBy(linkText="//span[text()=\"View Details\"]")
	private WebElement viewdetails;
	
	public girlfashionpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
public void image()
{
	img1.click();
}
public void viewdetails(WebDriver driver)


{

	viewdetails.click();
}



}
